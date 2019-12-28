package com.example.fake_era.sane_time;

import android.database.Cursor;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SubjectActivity extends AppCompatActivity {
    EditText UID,code,name,faculty;
    MainActivity user;
    DatabaseHelper myDb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject);
        code=(EditText)findViewById(R.id.editText7);
        name=(EditText)findViewById(R.id.editText12);
        faculty=(EditText)findViewById(R.id.editText13);
        user=new MainActivity();
        myDb =new DatabaseHelper(this);
    }

   public void insertSUB(View view){
        UID=user.uid;
        if (code.getText().toString().indexOf('-',4)!=-1) {
            boolean isin = myDb.insertDataSUB(UID.getText().toString(), code.getText().toString(), name.getText().toString(), faculty.getText().toString());
            if (isin == true) {
                AlertDialog.Builder builder2 = new AlertDialog.Builder(this);
                builder2.setMessage("Data Inserted");
                builder2.show();
            }
        }
        else
        {AlertDialog.Builder builder2 = new AlertDialog.Builder(this);
            builder2.setMessage("Data not inserted kindly fill course code properly");
            builder2.show();}

    }
   public void view_allSUB(View view){
        UID=user.uid;
        Cursor res=myDb.get_all_dataSUB(UID.getText().toString());
        if(res.getCount()==0){
            showMessage("Error","Nothing Fnd!");
            return;
        }
        StringBuffer buffer=new StringBuffer();

        while (res.moveToNext()){
            buffer.append("Course_Code: "+res.getString(0)+"\n");
            buffer.append("UID: "+res.getString(1)+"\n");
            buffer.append("Course_name: "+res.getString(2)+"\n");
            buffer.append("Faculty: "+res.getString(3)+"\n\n");
        }

        showMessage("All The Entries",buffer.toString());
    }
    public void showMessage(String Title,String Message){
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setTitle(Title);
        builder.setMessage(Message);
        builder.show();
    }
    public void update_dataSUB(View view){
        UID=user.uid;
        boolean isUpdate=myDb.update_dbmsSUB(UID.getText().toString(),code.getText().toString(),name.getText().toString(),faculty.getText().toString());
        if (isUpdate==true)
        {AlertDialog.Builder builder2 = new AlertDialog.Builder(this);
            builder2.setMessage("Data updated");
            builder2.show();}
        else
        {AlertDialog.Builder builder2 = new AlertDialog.Builder(this);
            builder2.setMessage("Data not updated");
            builder2.show();}
    }
    public void delete_dataSUB(View view){
        UID=user.uid;
        int r=myDb.delete_dbmsSUB(UID.getText().toString(),code.getText().toString());
        int r1=myDb.delete_dbmsCLASS(UID.getText().toString(),code.getText().toString());
        if(r==1 && r1==1)
        {AlertDialog.Builder builder2 = new AlertDialog.Builder(this);
            builder2.setMessage("Data deleted from classes as well");
            builder2.show();}
        else if (r==1)
        {
            AlertDialog.Builder builder2 = new AlertDialog.Builder(this);
            builder2.setMessage("Data deleted");
            builder2.show();
        }
        else
        {AlertDialog.Builder builder2 = new AlertDialog.Builder(this);
            builder2.setMessage("Error! Data not deleted");
            builder2.show();}

    }


}
