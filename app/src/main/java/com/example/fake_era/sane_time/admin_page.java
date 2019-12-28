package com.example.fake_era.sane_time;

import android.database.Cursor;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class admin_page extends AppCompatActivity {
    DatabaseHelper myDb;
    EditText del_id;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_page);
        myDb =new DatabaseHelper(this);
        del_id=(EditText)findViewById(R.id.editText15);
    }

    public void all_users_Information(View view){
        Cursor res=myDb.showAllData_admin();

        if(res.getCount()==0){
            showMessage("Oops!","No users have registered yet.");
            return;
        }
        StringBuffer buffer=new StringBuffer();


        while (res.moveToNext()){
            buffer.append("UID: "+res.getString(0)+"\n");
            buffer.append("first name: "+res.getString(1)+"\n");
            if(!(res.getString(2).isEmpty()))
                buffer.append("middle name: "+res.getString(2)+"\n");
            buffer.append("last name: "+res.getString(3)+"\n");
            buffer.append("age: "+res.getString(4)+"\n");
            buffer.append("email: "+res.getString(5)+"\n");
            buffer.append("phone no: "+res.getString(6)+"\n\n");
        }

        showMessage("ALL USERS",buffer.toString());
    }
    public void showMessage(String Title,String Message){
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setTitle(Title);
        builder.setMessage(Message);
        builder.show();
    }

    public void delete_user_data(View view)
    {
        String id_del=del_id.getText().toString();
        int r=myDb.delete_userData_admin(id_del);
        int r1=myDb.delete_userData_admin1(id_del);
        int r2=myDb.delete_userData_admin2(id_del);
        int r3=myDb.delete_userData_admin3(id_del);
        int r4=myDb.delete_userData_admin4(id_del);
        int r5=myDb.delete_userData_admin5(id_del);
        int r6=myDb.delete_userData_admin6(id_del);
        int r7=myDb.delete_userData_admin7(id_del);
        int r8=myDb.delete_userData_admin8(id_del);
        int r9=myDb.delete_userData_admin9(id_del);
        int r10=myDb.delete_userData_admin10(id_del);
        int r11=myDb.delete_userData_admin11(id_del);
        int r12=myDb.delete_userData_admin12(id_del);
        int r13=myDb.delete_userData_admin13(id_del);







        if(r==1)
            showMessage("Congrats!","User has been successfully removed");
        else
            showMessage("Oops!","User can't be removed");
    }
}
