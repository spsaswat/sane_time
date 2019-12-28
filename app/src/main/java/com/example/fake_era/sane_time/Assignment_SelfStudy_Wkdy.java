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

public class Assignment_SelfStudy_Wkdy extends AppCompatActivity {
String select;
    EditText t1,t2,t3,t4,t5,UID,t1_m,t2_m,t3_m,t4_m,t5_m;
    MainActivity user;
    DatabaseHelper myDb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignment__self_study__wkdy);
        t1=(EditText)findViewById(R.id.editText56);
        t2=(EditText)findViewById(R.id.editText57);
        t3=(EditText)findViewById(R.id.editText58);
        t4=(EditText)findViewById(R.id.editText59);
        t5=(EditText)findViewById(R.id.editText60);
        t1_m=(EditText)findViewById(R.id.editText56_1);
        t2_m=(EditText)findViewById(R.id.editText57_1);
        t3_m=(EditText)findViewById(R.id.editText58_1);
        t4_m=(EditText)findViewById(R.id.editText59_1);
        t5_m=(EditText)findViewById(R.id.editText60_1);
        user=new MainActivity();
        myDb =new DatabaseHelper(this);
        Spinner mySpinner = (Spinner) findViewById(R.id.spinner2);


        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.weakdays));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myAdapter);
        mySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                select=parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }




    public void insertASS(View view){
        UID=user.uid;
        String s1,s2,s3,s4,s5;
        s1= (!(t1_m.getText().toString().isEmpty()))?(t1.getText().toString()+":"+t1_m.getText().toString()):t1.getText().toString();
        s2= (!(t2_m.getText().toString().isEmpty()))?(t2.getText().toString()+":"+t2_m.getText().toString()):t2.getText().toString();
        s3= (!(t3_m.getText().toString().isEmpty()))?(t3.getText().toString()+":"+t3_m.getText().toString()):t3.getText().toString();
        s4= (!(t4_m.getText().toString().isEmpty()))?(t4.getText().toString()+":"+t4_m.getText().toString()):t4.getText().toString();
        s5= (!(t5_m.getText().toString().isEmpty()))?(t5.getText().toString()+":"+t5_m.getText().toString()):t5.getText().toString();


        int t1_int=(t1.getText().toString().isEmpty())?50:(Integer.parseInt(t1.getText().toString()));
        int t2_int=(t2.getText().toString().isEmpty())?0:(Integer.parseInt(t2.getText().toString()));
        int t3_int=(t3.getText().toString().isEmpty())?0:(Integer.parseInt(t3.getText().toString()));
        int t4_int=(t4.getText().toString().isEmpty())?0:(Integer.parseInt(t4.getText().toString()));
        int t5_int=(t5.getText().toString().isEmpty())?0:(Integer.parseInt(t5.getText().toString()));

        int t1_int_m=(t1_m.getText().toString().isEmpty())?0:(Integer.parseInt(t1_m.getText().toString()));
        int t2_int_m=(t2_m.getText().toString().isEmpty())?0:(Integer.parseInt(t2_m.getText().toString()));
        int t3_int_m=(t3_m.getText().toString().isEmpty())?0:(Integer.parseInt(t3_m.getText().toString()));
        int t4_int_m=(t4_m.getText().toString().isEmpty())?0:(Integer.parseInt(t4_m.getText().toString()));
        int t5_int_m=(t5_m.getText().toString().isEmpty())?0:(Integer.parseInt(t5_m.getText().toString()));

        if(t1_int<24 && t1_int>=0 && t2_int<24 && t2_int>=0 && t3_int<24 && t3_int>=0 && t4_int<24 && t4_int>=0 && t5_int<24 && t5_int>=0 && t1_int_m<60 && t1_int_m>=0 && t2_int_m<60 && t2_int_m>=0 && t3_int_m<60 && t3_int_m>=0 && t4_int_m<60 && t4_int>=0 && t5_int_m<60 && t5_int_m>=0) {
            boolean isin = myDb.insertDataASSIGNMENT_SELFSTUDY_WKDY(UID.getText().toString(), select, s1, s2, s3, s4, s5);
            if (isin == true)
                showMessage("Congrats!", "Data inserted!");
        }
        else
            showMessage("OOPs! Error","Data could not be inserted!");
    }
    public void view_allASS(View view){
        UID=user.uid;
        Cursor res=myDb.get_all_dataASSIGNMENT_SELFSTUDY_WKDY(UID.getText().toString());
        if(res.getCount()==0){
            showMessage("Error","Nothing Fnd!");
            return;
        }
        StringBuffer buffer=new StringBuffer();

        while (res.moveToNext()){
            buffer.append("UID: "+res.getString(0)+"\n");
            buffer.append("DAY: "+res.getString(1)+"\n");
            if(!(res.getString(2).isEmpty()))
                buffer.append("TIME1: "+res.getString(2)+"\n");
            if(!(res.getString(3).isEmpty()))
                buffer.append("TIME2: "+res.getString(3)+"\n");
            if(!(res.getString(4).isEmpty()))
                buffer.append("TIME3: "+res.getString(4)+"\n");
            if(!(res.getString(5).isEmpty()))
                buffer.append("TIME4: "+res.getString(5)+"\n");
            if(!(res.getString(6).isEmpty()))
                buffer.append("TIME5: "+res.getString(6)+"\n");
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
    public void update_dataASS(View view){
        String s1,s2,s3,s4,s5;
        s1= (!(t1_m.getText().toString().isEmpty()))?(t1.getText().toString()+":"+t1_m.getText().toString()):t1.getText().toString();
        s2= (!(t2_m.getText().toString().isEmpty()))?(t2.getText().toString()+":"+t2_m.getText().toString()):t2.getText().toString();
        s3= (!(t3_m.getText().toString().isEmpty()))?(t3.getText().toString()+":"+t3_m.getText().toString()):t3.getText().toString();
        s4= (!(t4_m.getText().toString().isEmpty()))?(t4.getText().toString()+":"+t4_m.getText().toString()):t4.getText().toString();
        s5= (!(t5_m.getText().toString().isEmpty()))?(t5.getText().toString()+":"+t5_m.getText().toString()):t5.getText().toString();


        int t1_int=(t1.getText().toString().isEmpty())?50:(Integer.parseInt(t1.getText().toString()));
        int t2_int=(t2.getText().toString().isEmpty())?0:(Integer.parseInt(t2.getText().toString()));
        int t3_int=(t3.getText().toString().isEmpty())?0:(Integer.parseInt(t3.getText().toString()));
        int t4_int=(t4.getText().toString().isEmpty())?0:(Integer.parseInt(t4.getText().toString()));
        int t5_int=(t5.getText().toString().isEmpty())?0:(Integer.parseInt(t5.getText().toString()));

        int t1_int_m=(t1.getText().toString().isEmpty())?0:(Integer.parseInt(t1.getText().toString()));
        int t2_int_m=(t2.getText().toString().isEmpty())?0:(Integer.parseInt(t2.getText().toString()));
        int t3_int_m=(t3.getText().toString().isEmpty())?0:(Integer.parseInt(t3.getText().toString()));
        int t4_int_m=(t4.getText().toString().isEmpty())?0:(Integer.parseInt(t4.getText().toString()));
        int t5_int_m=(t5.getText().toString().isEmpty())?0:(Integer.parseInt(t5.getText().toString()));
        if(t1_int<24 && t1_int>=0 && t2_int<24 && t2_int>=0 && t3_int<24 && t3_int>=0 && t4_int<24 && t4_int>=0 && t5_int<24 && t5_int>=0 && t1_int_m<60 && t1_int_m>=0 && t2_int_m<60 && t2_int_m>=0 && t3_int_m<60 && t3_int_m>=0 && t4_int_m<60 && t4_int>=0 && t5_int_m<60 && t5_int_m>=0) {
            boolean isUpdate = myDb.update_dbmsASSIGNMENT_SELFSTUDY_WKDY(UID.getText().toString(), select, s1, s2, s3, s4, s5);
            if (isUpdate == true)
                showMessage("Congrats!","Data Updated.");
            else
                showMessage("Oops!","Data could not be Updated.");
        }
        else
            showMessage("Oops!","Data could not be Updated.");
    }
    public void delete_dataASS(View view){
        UID=user.uid;
        int r=myDb.delete_dbmsASSIGNMENT_SELFSTUDY_WKDY(UID.getText().toString(),select);
        if(r==1)
        {AlertDialog.Builder builder2 = new AlertDialog.Builder(this);
            builder2.setMessage("Data deleted");
            builder2.show();}
        else
        {AlertDialog.Builder builder2 = new AlertDialog.Builder(this);
            builder2.setMessage("Data not deleted");
            builder2.show();}

    }
}
