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

public class Miscellaneous_Wknd extends AppCompatActivity {
    String select;
    EditText A1,A2,A3,t1,t2,t3,t1_m,t2_m,t3_m,UID;
    MainActivity user;
    DatabaseHelper myDb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_miscellaneous__wknd);
        A1=(EditText)findViewById(R.id.editText14);
        t1=(EditText)findViewById(R.id.editText57);
        t1_m=(EditText)findViewById(R.id.editText57_1);
        A2=(EditText)findViewById(R.id.editText31);
        t2=(EditText)findViewById(R.id.editText58);
        t2_m=(EditText)findViewById(R.id.editText58_1);
        A3=(EditText)findViewById(R.id.editText61);
        t3=(EditText)findViewById(R.id.editText59);
        t3_m=(EditText)findViewById(R.id.editText59_1);
        user=new MainActivity();
        myDb =new DatabaseHelper(this);
        Spinner mySpinner = (Spinner) findViewById(R.id.spinner13);
        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.weakends));
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



    public void insertMISCELLANEOUS(View view){
        UID=user.uid;
        String s1,s2,s3;
        s1= (!(t1_m.getText().toString().isEmpty()))?(t1.getText().toString()+":"+t1_m.getText().toString()):t1.getText().toString();
        s2= (!(t2_m.getText().toString().isEmpty()))?(t2.getText().toString()+":"+t2_m.getText().toString()):t2.getText().toString();
        s3= (!(t3_m.getText().toString().isEmpty()))?(t3.getText().toString()+":"+t3_m.getText().toString()):t3.getText().toString();

        int t1_int=(t1.getText().toString().isEmpty())?50:(Integer.parseInt(t1.getText().toString()));
        int t2_int=(t2.getText().toString().isEmpty())?0:(Integer.parseInt(t2.getText().toString()));
        int t3_int=(t3.getText().toString().isEmpty())?0:(Integer.parseInt(t3.getText().toString()));

        int t1_int_m=(t1.getText().toString().isEmpty())?0:(Integer.parseInt(t1.getText().toString()));
        int t2_int_m=(t2.getText().toString().isEmpty())?0:(Integer.parseInt(t2.getText().toString()));
        int t3_int_m=(t3.getText().toString().isEmpty())?0:(Integer.parseInt(t3.getText().toString()));

        if(!(A1.getText().toString().isEmpty()) && t1_int<24 && t1_int>=0 && t2_int<24 && t2_int>=0 && t3_int<24 && t3_int>=0 && t1_int_m<60 && t1_int_m>=0 && t2_int_m<60 && t2_int_m>=0 && t3_int_m<60 && t3_int_m>=0)
        {
            boolean isin = myDb.insertDataMISCELLANEOUS_WKND(UID.getText().toString(), select, A1.getText().toString(), s1, A2.getText().toString(), s2, A3.getText().toString(), s3);
            if (isin == true)
                showMessage("Congrats!", "Data inserted!");
            else
                showMessage("OOPs! Error","Data can't be redundant");
        }
        else
            showMessage("OOPs! Error","Data could not be inserted!");

    }
    public void view_allMISCELLANEOUS(View view){
        UID=user.uid;
        Cursor res=myDb.get_all_dataMISCELLANEOUS_WKND(UID.getText().toString());
        if(res.getCount()==0){
            showMessage("Error","Nothing Fnd!");
            return;
        }
        StringBuffer buffer=new StringBuffer();

        while (res.moveToNext()){
            buffer.append("UID: "+res.getString(0)+"\n");
            buffer.append("DAY: "+res.getString(1)+"\n");
            if(!(res.getString(2).isEmpty() || res.getString(3).isEmpty()))
            {buffer.append("ACTIVITY 1: "+res.getString(2)+"\n");
            buffer.append("TIME: "+res.getString(3)+"\n");}
            if(!(res.getString(4).isEmpty() || res.getString(5).isEmpty()))
            {buffer.append("ACTIVITY 2: "+res.getString(4)+"\n");
            buffer.append("TIME: "+res.getString(5)+"\n");}
            if(!(res.getString(6).isEmpty() || res.getString(7).isEmpty()))
            {buffer.append("ACTIVITY 3: "+res.getString(6)+"\n");
            buffer.append("TIME: "+res.getString(7)+"\n");}
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
    public void update_dataMISCELLANEOUS(View view){
        UID=user.uid;
        String s1,s2,s3;
        s1=t1.getText().toString()+":"+t1_m.getText().toString();
        s2=t2.getText().toString()+":"+t2_m.getText().toString();
        s3=t3.getText().toString()+":"+t3_m.getText().toString();

        int t1_int=(t1.getText().toString().isEmpty())?50:(Integer.parseInt(t1.getText().toString()));
        int t2_int=(t2.getText().toString().isEmpty())?0:(Integer.parseInt(t2.getText().toString()));
        int t3_int=(t3.getText().toString().isEmpty())?0:(Integer.parseInt(t3.getText().toString()));

        int t1_int_m=(t1_m.getText().toString().isEmpty())?0:(Integer.parseInt(t1_m.getText().toString()));
        int t2_int_m=(t2_m.getText().toString().isEmpty())?0:(Integer.parseInt(t2_m.getText().toString()));
        int t3_int_m=(t3_m.getText().toString().isEmpty())?0:(Integer.parseInt(t3_m.getText().toString()));

        if(t1_int<24 && t1_int>=0 && t2_int<24 && t2_int>=0 && t3_int<24 && t3_int>=0 && t1_int_m<60 && t1_int_m>=0 && t2_int_m<60 && t2_int_m>=0 && t3_int_m<60 && t3_int_m>=0||(!(A1.getText().toString().isEmpty())&&!(t1.getText().toString().isEmpty())))
        {
            boolean isin = myDb.update_dbmsMISCELLANEOUS_WKND(UID.getText().toString(), select, A1.getText().toString(), s1, A2.getText().toString(), s2, A3.getText().toString(), s3);
        if (isin==true)
            showMessage("Congrats!","Data Updated.");
        else
            showMessage("Oops!","Data could not be Updated.");}
        else
            showMessage("Oops!","Data could not be Updated.");
    }
    public void delete_dataMISCELLANEOUS(View view){
        UID=user.uid;
        int r=myDb.delete_dbmsMISCELLANEOUS_WKND(UID.getText().toString(),select);
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
