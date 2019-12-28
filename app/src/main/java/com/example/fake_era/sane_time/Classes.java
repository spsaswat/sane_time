package com.example.fake_era.sane_time;

import android.database.Cursor;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class Classes extends AppCompatActivity {
    String select1;
    EditText UID,COURSE_ID,START,START_M,END_M,END,ROOM,BUILDING;
    MainActivity user;
    DatabaseHelper myDb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classes);

        COURSE_ID=(EditText)findViewById(R.id.editText19);
        START=(EditText)findViewById(R.id.editText57);
        START_M=(EditText)findViewById(R.id.editText57_1);
        END=(EditText)findViewById(R.id.editText59);
        END_M=(EditText)findViewById(R.id.editText59_1);
        ROOM=(EditText)findViewById(R.id.editText23);
        BUILDING=(EditText)findViewById(R.id.editText24);
        user=new MainActivity();
        myDb =new DatabaseHelper(this);
        Spinner mySpinner = (Spinner) findViewById(R.id.spinner12);

        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.weakdays));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myAdapter);

        mySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                parent.setSelection(position);
                select1 = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }





    public void insertCLASS(View view){
        UID=user.uid;


        String start_1,end_1;
        start_1= (!(START.getText().toString().isEmpty()))?(START.getText().toString()+":"+START_M.getText().toString()):START.getText().toString();
        end_1= (!(END.getText().toString().isEmpty()))?(END.getText().toString()+":"+END_M.getText().toString()):END.getText().toString();

        int start_int,end_int;
        start_int=(START.getText().toString().isEmpty())?50:(Integer.parseInt(START.getText().toString()));
        end_int=(END.getText().toString().isEmpty())?50:(Integer.parseInt(END.getText().toString()));


        int start_int_m=(START_M.getText().toString().isEmpty())?0:(Integer.parseInt(START_M.getText().toString()));
        int end_int_m=(END_M.getText().toString().isEmpty())?0:(Integer.parseInt(END_M.getText().toString()));




            StringBuffer a=new StringBuffer();;
            Cursor res=myDb.get_all_c_code_SUB(UID.getText().toString());
            if(res.getCount()==0){
                showMessage("Error!","Enter details in subject table first");
                return;
            }
            int flag=0;
            while (res.moveToNext()){
                a.append(res.getString(0)+" ");
                if(res.getString(0).equals(COURSE_ID.getText().toString()))
                flag=1;

            }
            res.moveToFirst();
        if (flag==1 && start_int>=0 && start_int<24 && end_int>=0 && end_int<24 && (start_int<end_int||(start_int==end_int&&start_int_m<end_int_m)) && start_int_m>=0 && start_int_m<60 && end_int_m>=0 && end_int_m<60)  {
            boolean isin = myDb.insertDataCLASS(UID.getText().toString(), select1, COURSE_ID.getText().toString(), start_1,end_1, ROOM.getText().toString(), BUILDING.getText().toString());
            if (isin == true)
                showMessage(" ", "Data inserted");
            else
                showMessage(" ","Data not inserted");
        }
        else {
            if(flag==0 || COURSE_ID.getText().toString().isEmpty()) {
                showMessage(" ", "plz ensure the id matches with id u have entered in subject table" + a);
            }
            else
            {
                showMessage(" ", "check if times are entered correctly(start<end)");
            }
            }


    }
    public void view_allCLASS(View view){
        UID=user.uid;
        Cursor res=myDb.get_all_dataCLASS(UID.getText().toString());
        if(res.getCount()==0){
            showMessage("Error","Nothing Fnd!");
            return;
        }
        StringBuffer buffer=new StringBuffer();

        while (res.moveToNext()){

            buffer.append("UID: "+res.getString(0)+"\n");
            buffer.append("Days: "+res.getString(1)+"\n");
            if(!(res.getString(2).isEmpty()))
            buffer.append("Course_Id: "+res.getString(2)+"\n");
            if(!(res.getString(3).isEmpty()))
            buffer.append("Start: "+res.getString(3)+"\n");
            if(!(res.getString(4).isEmpty()))
            buffer.append("End: "+res.getString(4)+"\n");
            if(!(res.getString(5).isEmpty()))
            buffer.append("Room: "+res.getString(5)+"\n");
            if(!(res.getString(6).isEmpty()))
            buffer.append("Building: "+res.getString(6)+"\n");
            buffer.append("\n");
        }

        showMessage("All The Entries",buffer.toString());
    }
    public void showMessage(String Title,String Message){
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setTitle(Title);
        builder.setMessage(Message);
        builder.show();
    }
    public void update_dataCLASS(View view){
        UID=user.uid;

        String start_1,end_1;
        start_1= (!(START.getText().toString().isEmpty()))?(START.getText().toString()+":"+START_M.getText().toString()):START.getText().toString();
        end_1= (!(END.getText().toString().isEmpty()))?(END.getText().toString()+":"+END_M.getText().toString()):END.getText().toString();

        int start_int=(START.getText().toString().isEmpty())?50:(Integer.parseInt(START.getText().toString()));
        int end_int=(END.getText().toString().isEmpty())?50:(Integer.parseInt(END.getText().toString()));


        int start_int_m=(START_M.getText().toString().isEmpty())?0:(Integer.parseInt(START_M.getText().toString()));
        int end_int_m=(END_M.getText().toString().isEmpty())?0:(Integer.parseInt(END_M.getText().toString()));
        if (start_int>=0 && start_int<24 && end_int>=0 && end_int<24 && (start_int<end_int||(start_int==end_int&&start_int_m<end_int_m))&& start_int_m>=0 && start_int_m<60 && end_int_m>=0 && end_int_m<60 ) {
            boolean isUpdate = myDb.update_dbmsCLASS(UID.getText().toString(), select1, COURSE_ID.getText().toString(), start_1,end_1, ROOM.getText().toString(), BUILDING.getText().toString());
            if (isUpdate == true) {
                AlertDialog.Builder builder2 = new AlertDialog.Builder(this);
                builder2.setMessage("Data updated");
                builder2.show();
            }
        }
        else
        {AlertDialog.Builder builder2 = new AlertDialog.Builder(this);
            builder2.setMessage("Data not updated! \n Please enter valid data.");
            builder2.show();}
    }

}
