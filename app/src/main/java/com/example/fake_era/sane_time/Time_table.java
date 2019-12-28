package com.example.fake_era.sane_time;

import android.database.Cursor;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Time_table extends AppCompatActivity {
    EditText UID;
    MainActivity user;
    DatabaseHelper myDb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_table);
        user=new MainActivity();
        myDb =new DatabaseHelper(this);
    }

    public void showMessage(String Title,String Message){
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setTitle(Title);
        builder.setMessage(Message);
        builder.show();
    }
    public void Monday(View view){
        UID=user.uid;
        String day="Monday";
        Cursor res=myDb.get_all_datadaywise_EAT(UID.getText().toString(),day);
        Cursor res1=myDb.get_all_datadaywise_ASSGN(UID.getText().toString(),day);
        Cursor res2=myDb.get_all_datadaywise_SLEEP(UID.getText().toString(),day);
        Cursor res3=myDb.get_all_datadaywise_PERSONAL(UID.getText().toString(),day);
        Cursor res4=myDb.get_all_datadaywise_CLASSES(UID.getText().toString(),day);
        Cursor res5=myDb.get_all_datadaywise_HOBBY_WKDY(UID.getText().toString(),day);

        if(res.getCount()==0 && res1.getCount()==0 && res2.getCount()==0 && res3.getCount()==0  && res4.getCount()==0 &&res5.getCount()==0){
            showMessage("Error","Nothing Fnd!");
            return;
        }
        StringBuffer buffer1=new StringBuffer();

        while (res.moveToNext()) {
            buffer1.append("EATING " + "\n");
            if(!res.getString(0).isEmpty())
            buffer1.append("TIME1: " + res.getString(0) + "\n");
            if(!res.getString(1).isEmpty())
            buffer1.append("TIME2: " + res.getString(1) + "\n");
            if(!res.getString(2).isEmpty())
            buffer1.append("TIME3: " + res.getString(2) + "\n");
            if(!res.getString(3).isEmpty())
            buffer1.append("TIME4: " + res.getString(3) + "\n");
            if(!res.getString(4).isEmpty())
            buffer1.append("TIME5: " + res.getString(4) + "\n");
        }
        StringBuffer buffer2=new StringBuffer();
        while (res1.moveToNext()) {
            buffer2.append("\n"+"ASSIGNMENT AND SELFSTUDY " + "\n");
            if(!res1.getString(0).isEmpty())
            buffer2.append("TIME1: " + res1.getString(0) + "\n");
            if(!res1.getString(1).isEmpty())
            buffer2.append("TIME2: " + res1.getString(1) + "\n");
            if(!res1.getString(2).isEmpty())
            buffer2.append("TIME3: " + res1.getString(2) + "\n");
            if(!res1.getString(3).isEmpty())
            buffer2.append("TIME4: " + res1.getString(3) + "\n");
            if(!res1.getString(4).isEmpty())
            buffer2.append("TIME5: " + res1.getString(4) + "\n");

        }
        StringBuffer buffer3=new StringBuffer();
        while (res2.moveToNext()) {
            buffer2.append("\n"+"SLEEPING " + "\n");
            if(!res2.getString(0).isEmpty())
            buffer3.append("TIME1: " + res2.getString(0) + "\n");
            if(!res2.getString(1).isEmpty())
            buffer3.append("TIME2: " + res2.getString(1) + "\n");
            if(!res2.getString(2).isEmpty())
            buffer3.append("TIME3: " + res2.getString(2) + "\n");
            if(!res2.getString(3).isEmpty())
            buffer3.append("TIME4: " + res2.getString(3) + "\n");
            if(!res2.getString(4).isEmpty())
            buffer3.append("TIME5: " + res2.getString(4) + "\n");
        }
        StringBuffer buffer4=new StringBuffer();
        while (res3.moveToNext()) {
            buffer4.append("\n"+"PERSONAL_CLEANLINESS "+"\n");
            if(!res3.getString(0).isEmpty())
            buffer4.append("TIME1: "+res3.getString(0)+"\n");
            if(!res3.getString(1).isEmpty())
            buffer4.append("TIME2: "+res3.getString(1)+"\n");
            if(!res3.getString(2).isEmpty())
            buffer4.append("TIME3: "+res3.getString(2)+"\n");
            if(!res3.getString(3).isEmpty())
            buffer4.append("TIME4: "+res3.getString(3)+"\n");
            if(!res3.getString(4).isEmpty())
            buffer4.append("TIME5: "+res3.getString(4)+"\n");
        }
        StringBuffer buffer5=new StringBuffer();
        while (res4.moveToNext()) {
            buffer5.append("\n"+"CLASSES "+"\n");
            buffer5.append("COURSE NAME: "+res4.getString(0)+"\n");
            buffer5.append("COURSE CODE: "+res4.getString(1)+"\n");
            buffer5.append("STARTING TIME: "+res4.getString(2)+"\n");
            buffer5.append("ENDING TIME: "+res4.getString(3)+"\n");
            buffer5.append("ROOM: "+res4.getString(4)+"\n");
            buffer5.append("BUILDING: "+res4.getString(5)+"\n\n");
        }
        StringBuffer buffer6=new StringBuffer();
        while (res5.moveToNext()) {
            buffer6.append("\n"+"HOBBY AND EXERCISE "+"\n");
            if(!res5.getString(0).isEmpty())
            buffer6.append("TIME1: "+res5.getString(0)+"\n");
            if(!res5.getString(1).isEmpty())
            buffer6.append("TIME2: "+res5.getString(1)+"\n");
            if(!res5.getString(2).isEmpty())
            buffer6.append("TIME3: "+res5.getString(2)+"\n");
            if(!res5.getString(3).isEmpty())
            buffer6.append("TIME4: "+res5.getString(3)+"\n");
            if(!res5.getString(4).isEmpty())
            buffer6.append("TIME5: "+res5.getString(4)+"\n");
        }
        StringBuffer buffer=new StringBuffer();
        buffer.append(buffer5);
        buffer.append(buffer1);
        buffer.append(buffer2);
        buffer.append(buffer3);
        buffer.append(buffer4);
        buffer.append(buffer6);
        showMessage("MONDAY SCHEDULE",buffer.toString());

    }


    public void Tuesday(View view){
        String day="Tuesday";
        UID=user.uid;
        Cursor res=myDb.get_all_datadaywise_EAT(UID.getText().toString(),day);
        Cursor res1=myDb.get_all_datadaywise_ASSGN(UID.getText().toString(),day);
        Cursor res2=myDb.get_all_datadaywise_SLEEP(UID.getText().toString(),day);
        Cursor res3=myDb.get_all_datadaywise_PERSONAL(UID.getText().toString(),day);
        Cursor res4=myDb.get_all_datadaywise_CLASSES(UID.getText().toString(),day);
        Cursor res5=myDb.get_all_datadaywise_HOBBY_WKDY(UID.getText().toString(),day);
        if(res.getCount()==0 && res1.getCount()==0 && res2.getCount()==0 && res3.getCount()==0  && res4.getCount()==0 && res5.getCount()==0){
            showMessage("Error","Nothing Fnd!");
            return;
        }
        StringBuffer buffer1=new StringBuffer();

        while (res.moveToNext()) {
            buffer1.append("EATING " + "\n");
            if(!res.getString(0).isEmpty())
                buffer1.append("TIME1: " + res.getString(0) + "\n");
            if(!res.getString(1).isEmpty())
                buffer1.append("TIME2: " + res.getString(1) + "\n");
            if(!res.getString(2).isEmpty())
                buffer1.append("TIME3: " + res.getString(2) + "\n");
            if(!res.getString(3).isEmpty())
                buffer1.append("TIME4: " + res.getString(3) + "\n");
            if(!res.getString(4).isEmpty())
                buffer1.append("TIME5: " + res.getString(4) + "\n");
        }
        StringBuffer buffer2=new StringBuffer();
        while (res1.moveToNext()) {
            buffer2.append("\n"+"ASSIGNMENT AND SELFSTUDY " + "\n");
            if(!res1.getString(0).isEmpty())
                buffer2.append("TIME1: " + res1.getString(0) + "\n");
            if(!res1.getString(1).isEmpty())
                buffer2.append("TIME2: " + res1.getString(1) + "\n");
            if(!res1.getString(2).isEmpty())
                buffer2.append("TIME3: " + res1.getString(2) + "\n");
            if(!res1.getString(3).isEmpty())
                buffer2.append("TIME4: " + res1.getString(3) + "\n");
            if(!res1.getString(4).isEmpty())
                buffer2.append("TIME5: " + res1.getString(4) + "\n");

        }
        StringBuffer buffer3=new StringBuffer();
        while (res2.moveToNext()) {
            buffer2.append("\n"+"SLEEPING " + "\n");
            if(!res2.getString(0).isEmpty())
                buffer3.append("TIME1: " + res2.getString(0) + "\n");
            if(!res2.getString(1).isEmpty())
                buffer3.append("TIME2: " + res2.getString(1) + "\n");
            if(!res2.getString(2).isEmpty())
                buffer3.append("TIME3: " + res2.getString(2) + "\n");
            if(!res2.getString(3).isEmpty())
                buffer3.append("TIME4: " + res2.getString(3) + "\n");
            if(!res2.getString(4).isEmpty())
                buffer3.append("TIME5: " + res2.getString(4) + "\n");
        }
        StringBuffer buffer4=new StringBuffer();
        while (res3.moveToNext()) {
            buffer4.append("\n"+"PERSONAL_CLEANLINESS "+"\n");
            if(!res3.getString(0).isEmpty())
                buffer4.append("TIME1: "+res3.getString(0)+"\n");
            if(!res3.getString(1).isEmpty())
                buffer4.append("TIME2: "+res3.getString(1)+"\n");
            if(!res3.getString(2).isEmpty())
                buffer4.append("TIME3: "+res3.getString(2)+"\n");
            if(!res3.getString(3).isEmpty())
                buffer4.append("TIME4: "+res3.getString(3)+"\n");
            if(!res3.getString(4).isEmpty())
                buffer4.append("TIME5: "+res3.getString(4)+"\n");
        }
        StringBuffer buffer5=new StringBuffer();
        while (res4.moveToNext()) {
            buffer5.append("\n"+"CLASSES "+"\n");
            buffer5.append("COURSE NAME: "+res4.getString(0)+"\n");
            buffer5.append("COURSE CODE: "+res4.getString(1)+"\n");
            buffer5.append("STARTING TIME: "+res4.getString(2)+"\n");
            buffer5.append("ENDING TIME: "+res4.getString(3)+"\n");
            buffer5.append("ROOM: "+res4.getString(4)+"\n");
            buffer5.append("BUILDING: "+res4.getString(5)+"\n\n");
        }
        StringBuffer buffer6=new StringBuffer();
        while (res5.moveToNext()) {
            buffer6.append("\n"+"HOBBY AND EXERCISE "+"\n");
            if(!res5.getString(0).isEmpty())
                buffer6.append("TIME1: "+res5.getString(0)+"\n");
            if(!res5.getString(1).isEmpty())
                buffer6.append("TIME2: "+res5.getString(1)+"\n");
            if(!res5.getString(2).isEmpty())
                buffer6.append("TIME3: "+res5.getString(2)+"\n");
            if(!res5.getString(3).isEmpty())
                buffer6.append("TIME4: "+res5.getString(3)+"\n");
            if(!res5.getString(4).isEmpty())
                buffer6.append("TIME5: "+res5.getString(4)+"\n");
        }
        StringBuffer buffer=new StringBuffer();
        buffer.append(buffer5);
        buffer.append(buffer1);
        buffer.append(buffer2);
        buffer.append(buffer3);
        buffer.append(buffer4);
        buffer.append(buffer6);
        showMessage("TUESDAY SCHEDULE",buffer.toString());
    }



    public void Wednesday(View view){
        String day="Wednesday";
        UID=user.uid;
        Cursor res=myDb.get_all_datadaywise_EAT(UID.getText().toString(),day);
        Cursor res1=myDb.get_all_datadaywise_ASSGN(UID.getText().toString(),day);
        Cursor res2=myDb.get_all_datadaywise_SLEEP(UID.getText().toString(),day);
        Cursor res3=myDb.get_all_datadaywise_PERSONAL(UID.getText().toString(),day);
        Cursor res4=myDb.get_all_datadaywise_CLASSES(UID.getText().toString(),day);
        Cursor res5=myDb.get_all_datadaywise_HOBBY_WKDY(UID.getText().toString(),day);
        if(res.getCount()==0 && res1.getCount()==0 && res2.getCount()==0 && res3.getCount()==0  && res4.getCount()==0 &&res5.getCount()==0 ){
            showMessage("Error","Nothing Fnd!");
            return;
        }
        StringBuffer buffer1=new StringBuffer();

        while (res.moveToNext()) {
            buffer1.append("EATING " + "\n");
            if(!res.getString(0).isEmpty())
                buffer1.append("TIME1: " + res.getString(0) + "\n");
            if(!res.getString(1).isEmpty())
                buffer1.append("TIME2: " + res.getString(1) + "\n");
            if(!res.getString(2).isEmpty())
                buffer1.append("TIME3: " + res.getString(2) + "\n");
            if(!res.getString(3).isEmpty())
                buffer1.append("TIME4: " + res.getString(3) + "\n");
            if(!res.getString(4).isEmpty())
                buffer1.append("TIME5: " + res.getString(4) + "\n");
        }
        StringBuffer buffer2=new StringBuffer();
        while (res1.moveToNext()) {
            buffer2.append("\n"+"ASSIGNMENT AND SELFSTUDY " + "\n");
            if(!res1.getString(0).isEmpty())
                buffer2.append("TIME1: " + res1.getString(0) + "\n");
            if(!res1.getString(1).isEmpty())
                buffer2.append("TIME2: " + res1.getString(1) + "\n");
            if(!res1.getString(2).isEmpty())
                buffer2.append("TIME3: " + res1.getString(2) + "\n");
            if(!res1.getString(3).isEmpty())
                buffer2.append("TIME4: " + res1.getString(3) + "\n");
            if(!res1.getString(4).isEmpty())
                buffer2.append("TIME5: " + res1.getString(4) + "\n");

        }
        StringBuffer buffer3=new StringBuffer();
        while (res2.moveToNext()) {
            buffer2.append("\n"+"SLEEPING " + "\n");
            if(!res2.getString(0).isEmpty())
                buffer3.append("TIME1: " + res2.getString(0) + "\n");
            if(!res2.getString(1).isEmpty())
                buffer3.append("TIME2: " + res2.getString(1) + "\n");
            if(!res2.getString(2).isEmpty())
                buffer3.append("TIME3: " + res2.getString(2) + "\n");
            if(!res2.getString(3).isEmpty())
                buffer3.append("TIME4: " + res2.getString(3) + "\n");
            if(!res2.getString(4).isEmpty())
                buffer3.append("TIME5: " + res2.getString(4) + "\n");
        }
        StringBuffer buffer4=new StringBuffer();
        while (res3.moveToNext()) {
            buffer4.append("\n"+"PERSONAL_CLEANLINESS "+"\n");
            if(!res3.getString(0).isEmpty())
                buffer4.append("TIME1: "+res3.getString(0)+"\n");
            if(!res3.getString(1).isEmpty())
                buffer4.append("TIME2: "+res3.getString(1)+"\n");
            if(!res3.getString(2).isEmpty())
                buffer4.append("TIME3: "+res3.getString(2)+"\n");
            if(!res3.getString(3).isEmpty())
                buffer4.append("TIME4: "+res3.getString(3)+"\n");
            if(!res3.getString(4).isEmpty())
                buffer4.append("TIME5: "+res3.getString(4)+"\n");
        }
        StringBuffer buffer5=new StringBuffer();
        while (res4.moveToNext()) {
            buffer5.append("\n"+"CLASSES "+"\n");
            buffer5.append("COURSE NAME: "+res4.getString(0)+"\n");
            buffer5.append("COURSE CODE: "+res4.getString(1)+"\n");
            buffer5.append("STARTING TIME: "+res4.getString(2)+"\n");
            buffer5.append("ENDING TIME: "+res4.getString(3)+"\n");
            buffer5.append("ROOM: "+res4.getString(4)+"\n");
            buffer5.append("BUILDING: "+res4.getString(5)+"\n\n");
        }
        StringBuffer buffer6=new StringBuffer();
        while (res5.moveToNext()) {
            buffer6.append("\n"+"HOBBY AND EXERCISE "+"\n");
            if(!res5.getString(0).isEmpty())
                buffer6.append("TIME1: "+res5.getString(0)+"\n");
            if(!res5.getString(1).isEmpty())
                buffer6.append("TIME2: "+res5.getString(1)+"\n");
            if(!res5.getString(2).isEmpty())
                buffer6.append("TIME3: "+res5.getString(2)+"\n");
            if(!res5.getString(3).isEmpty())
                buffer6.append("TIME4: "+res5.getString(3)+"\n");
            if(!res5.getString(4).isEmpty())
                buffer6.append("TIME5: "+res5.getString(4)+"\n");
        }
        StringBuffer buffer=new StringBuffer();
        buffer.append(buffer5);
        buffer.append(buffer1);
        buffer.append(buffer2);
        buffer.append(buffer3);
        buffer.append(buffer4);
        buffer.append(buffer6);

        showMessage("WEDNESDAY SCHEDULE",buffer.toString());
    }




    public void Thursday(View view){
        String day="Thursday";
        UID=user.uid;
        Cursor res=myDb.get_all_datadaywise_EAT(UID.getText().toString(),day);
        Cursor res1=myDb.get_all_datadaywise_ASSGN(UID.getText().toString(),day);
        Cursor res2=myDb.get_all_datadaywise_SLEEP(UID.getText().toString(),day);
        Cursor res3=myDb.get_all_datadaywise_PERSONAL(UID.getText().toString(),day);
        Cursor res4=myDb.get_all_datadaywise_CLASSES(UID.getText().toString(),day);
        Cursor res5=myDb.get_all_datadaywise_HOBBY_WKDY(UID.getText().toString(),day);
        if(res.getCount()==0 && res1.getCount()==0 && res2.getCount()==0 && res3.getCount()==0  && res4.getCount()==0 &&res5.getCount()==0 ){
            showMessage("Error","Nothing Fnd!");
            return;
        }
        StringBuffer buffer1=new StringBuffer();

        while (res.moveToNext()) {
            buffer1.append("EATING " + "\n");
            if(!res.getString(0).isEmpty())
                buffer1.append("TIME1: " + res.getString(0) + "\n");
            if(!res.getString(1).isEmpty())
                buffer1.append("TIME2: " + res.getString(1) + "\n");
            if(!res.getString(2).isEmpty())
                buffer1.append("TIME3: " + res.getString(2) + "\n");
            if(!res.getString(3).isEmpty())
                buffer1.append("TIME4: " + res.getString(3) + "\n");
            if(!res.getString(4).isEmpty())
                buffer1.append("TIME5: " + res.getString(4) + "\n");
        }
        StringBuffer buffer2=new StringBuffer();
        while (res1.moveToNext()) {
            buffer2.append("\n"+"ASSIGNMENT AND SELFSTUDY " + "\n");
            if(!res1.getString(0).isEmpty())
                buffer2.append("TIME1: " + res1.getString(0) + "\n");
            if(!res1.getString(1).isEmpty())
                buffer2.append("TIME2: " + res1.getString(1) + "\n");
            if(!res1.getString(2).isEmpty())
                buffer2.append("TIME3: " + res1.getString(2) + "\n");
            if(!res1.getString(3).isEmpty())
                buffer2.append("TIME4: " + res1.getString(3) + "\n");
            if(!res1.getString(4).isEmpty())
                buffer2.append("TIME5: " + res1.getString(4) + "\n");

        }
        StringBuffer buffer3=new StringBuffer();
        while (res2.moveToNext()) {
            buffer2.append("\n"+"SLEEPING " + "\n");
            if(!res2.getString(0).isEmpty())
                buffer3.append("TIME1: " + res2.getString(0) + "\n");
            if(!res2.getString(1).isEmpty())
                buffer3.append("TIME2: " + res2.getString(1) + "\n");
            if(!res2.getString(2).isEmpty())
                buffer3.append("TIME3: " + res2.getString(2) + "\n");
            if(!res2.getString(3).isEmpty())
                buffer3.append("TIME4: " + res2.getString(3) + "\n");
            if(!res2.getString(4).isEmpty())
                buffer3.append("TIME5: " + res2.getString(4) + "\n");
        }
        StringBuffer buffer4=new StringBuffer();
        while (res3.moveToNext()) {
            buffer4.append("\n"+"PERSONAL_CLEANLINESS "+"\n");
            if(!res3.getString(0).isEmpty())
                buffer4.append("TIME1: "+res3.getString(0)+"\n");
            if(!res3.getString(1).isEmpty())
                buffer4.append("TIME2: "+res3.getString(1)+"\n");
            if(!res3.getString(2).isEmpty())
                buffer4.append("TIME3: "+res3.getString(2)+"\n");
            if(!res3.getString(3).isEmpty())
                buffer4.append("TIME4: "+res3.getString(3)+"\n");
            if(!res3.getString(4).isEmpty())
                buffer4.append("TIME5: "+res3.getString(4)+"\n");
        }
        StringBuffer buffer5=new StringBuffer();
        while (res4.moveToNext()) {
            buffer5.append("\n"+"CLASSES "+"\n");
            buffer5.append("COURSE NAME: "+res4.getString(0)+"\n");
            buffer5.append("COURSE CODE: "+res4.getString(1)+"\n");
            buffer5.append("STARTING TIME: "+res4.getString(2)+"\n");
            buffer5.append("ENDING TIME: "+res4.getString(3)+"\n");
            buffer5.append("ROOM: "+res4.getString(4)+"\n");
            buffer5.append("BUILDING: "+res4.getString(5)+"\n\n");
        }
        StringBuffer buffer6=new StringBuffer();
        while (res5.moveToNext()) {
            buffer6.append("\n"+"HOBBY AND EXERCISE "+"\n");
            if(!res5.getString(0).isEmpty())
                buffer6.append("TIME1: "+res5.getString(0)+"\n");
            if(!res5.getString(1).isEmpty())
                buffer6.append("TIME2: "+res5.getString(1)+"\n");
            if(!res5.getString(2).isEmpty())
                buffer6.append("TIME3: "+res5.getString(2)+"\n");
            if(!res5.getString(3).isEmpty())
                buffer6.append("TIME4: "+res5.getString(3)+"\n");
            if(!res5.getString(4).isEmpty())
                buffer6.append("TIME5: "+res5.getString(4)+"\n");
        }
        StringBuffer buffer=new StringBuffer();
        buffer.append(buffer5);
        buffer.append(buffer1);
        buffer.append(buffer2);
        buffer.append(buffer3);
        buffer.append(buffer4);
        buffer.append(buffer6);

        showMessage("THURSDAY SCHEDULE",buffer.toString());
    }

    public void Friday(View view){
        String day="Friday";
        UID=user.uid;
        Cursor res=myDb.get_all_datadaywise_EAT(UID.getText().toString(),day);
        Cursor res1=myDb.get_all_datadaywise_ASSGN(UID.getText().toString(),day);
        Cursor res2=myDb.get_all_datadaywise_SLEEP(UID.getText().toString(),day);
        Cursor res3=myDb.get_all_datadaywise_PERSONAL(UID.getText().toString(),day);
        Cursor res4=myDb.get_all_datadaywise_CLASSES(UID.getText().toString(),day);
        Cursor res5=myDb.get_all_datadaywise_HOBBY_WKDY(UID.getText().toString(),day);
        if(res.getCount()==0 && res1.getCount()==0 && res2.getCount()==0 && res3.getCount()==0  && res4.getCount()==0  &&res5.getCount()==0){
            showMessage("Error","Nothing Fnd!");
            return;
        }
        StringBuffer buffer1=new StringBuffer();

        while (res.moveToNext()) {
            buffer1.append("EATING " + "\n");
            if(!res.getString(0).isEmpty())
                buffer1.append("TIME1: " + res.getString(0) + "\n");
            if(!res.getString(1).isEmpty())
                buffer1.append("TIME2: " + res.getString(1) + "\n");
            if(!res.getString(2).isEmpty())
                buffer1.append("TIME3: " + res.getString(2) + "\n");
            if(!res.getString(3).isEmpty())
                buffer1.append("TIME4: " + res.getString(3) + "\n");
            if(!res.getString(4).isEmpty())
                buffer1.append("TIME5: " + res.getString(4) + "\n");
        }
        StringBuffer buffer2=new StringBuffer();
        while (res1.moveToNext()) {
            buffer2.append("\n"+"ASSIGNMENT AND SELFSTUDY " + "\n");
            if(!res1.getString(0).isEmpty())
                buffer2.append("TIME1: " + res1.getString(0) + "\n");
            if(!res1.getString(1).isEmpty())
                buffer2.append("TIME2: " + res1.getString(1) + "\n");
            if(!res1.getString(2).isEmpty())
                buffer2.append("TIME3: " + res1.getString(2) + "\n");
            if(!res1.getString(3).isEmpty())
                buffer2.append("TIME4: " + res1.getString(3) + "\n");
            if(!res1.getString(4).isEmpty())
                buffer2.append("TIME5: " + res1.getString(4) + "\n");

        }
        StringBuffer buffer3=new StringBuffer();
        while (res2.moveToNext()) {
            buffer2.append("\n"+"SLEEPING " + "\n");
            if(!res2.getString(0).isEmpty())
                buffer3.append("TIME1: " + res2.getString(0) + "\n");
            if(!res2.getString(1).isEmpty())
                buffer3.append("TIME2: " + res2.getString(1) + "\n");
            if(!res2.getString(2).isEmpty())
                buffer3.append("TIME3: " + res2.getString(2) + "\n");
            if(!res2.getString(3).isEmpty())
                buffer3.append("TIME4: " + res2.getString(3) + "\n");
            if(!res2.getString(4).isEmpty())
                buffer3.append("TIME5: " + res2.getString(4) + "\n");
        }
        StringBuffer buffer4=new StringBuffer();
        while (res3.moveToNext()) {
            buffer4.append("\n"+"PERSONAL_CLEANLINESS "+"\n");
            if(!res3.getString(0).isEmpty())
                buffer4.append("TIME1: "+res3.getString(0)+"\n");
            if(!res3.getString(1).isEmpty())
                buffer4.append("TIME2: "+res3.getString(1)+"\n");
            if(!res3.getString(2).isEmpty())
                buffer4.append("TIME3: "+res3.getString(2)+"\n");
            if(!res3.getString(3).isEmpty())
                buffer4.append("TIME4: "+res3.getString(3)+"\n");
            if(!res3.getString(4).isEmpty())
                buffer4.append("TIME5: "+res3.getString(4)+"\n");
        }
        StringBuffer buffer5=new StringBuffer();
        while (res4.moveToNext()) {
            buffer5.append("\n"+"CLASSES "+"\n");
            buffer5.append("COURSE NAME: "+res4.getString(0)+"\n");
            buffer5.append("COURSE CODE: "+res4.getString(1)+"\n");
            buffer5.append("STARTING TIME: "+res4.getString(2)+"\n");
            buffer5.append("ENDING TIME: "+res4.getString(3)+"\n");
            buffer5.append("ROOM: "+res4.getString(4)+"\n");
            buffer5.append("BUILDING: "+res4.getString(5)+"\n\n");
        }
        StringBuffer buffer6=new StringBuffer();
        while (res5.moveToNext()) {
            buffer6.append("\n"+"HOBBY AND EXERCISE "+"\n");
            if(!res5.getString(0).isEmpty())
                buffer6.append("TIME1: "+res5.getString(0)+"\n");
            if(!res5.getString(1).isEmpty())
                buffer6.append("TIME2: "+res5.getString(1)+"\n");
            if(!res5.getString(2).isEmpty())
                buffer6.append("TIME3: "+res5.getString(2)+"\n");
            if(!res5.getString(3).isEmpty())
                buffer6.append("TIME4: "+res5.getString(3)+"\n");
            if(!res5.getString(4).isEmpty())
                buffer6.append("TIME5: "+res5.getString(4)+"\n");
        }
        StringBuffer buffer=new StringBuffer();
        buffer.append(buffer5);
        buffer.append(buffer1);
        buffer.append(buffer2);
        buffer.append(buffer3);
        buffer.append(buffer4);
        buffer.append(buffer6);

        showMessage("FRIDAY SCHEDULE",buffer.toString());
    }



    /*WEEKENDS*/


    public void Saturday(View view){
        String day="Saturday";
        UID=user.uid;
        Cursor res=myDb.get_all_datadaywise_EAT_WKND(UID.getText().toString(),day);
        Cursor res1=myDb.get_all_datadaywise_ASSGN_WKND(UID.getText().toString(),day);
        Cursor res2=myDb.get_all_datadaywise_SLEEP_WKND(UID.getText().toString(),day);
        Cursor res3=myDb.get_all_datadaywise_PERSONAL_WKND(UID.getText().toString(),day);
        Cursor res4=myDb.get_all_datadaywise_OUTING_WKND(UID.getText().toString(),day);
        Cursor res5=myDb.get_all_datadaywise_HOBBY_WKND(UID.getText().toString(),day);
        Cursor res6=myDb.get_all_datadaywise_MISCELLANEOUS_WKND(UID.getText().toString(),day);
        if(res.getCount()==0 && res1.getCount()==0 && res2.getCount()==0 && res3.getCount()==0 && res4.getCount()==0  &&res5.getCount()==0){
            showMessage("Error","Nothing Fnd!");
            return;
        }
        StringBuffer buffer1=new StringBuffer();

        while (res.moveToNext()) {
            buffer1.append("EATING " + "\n");
            if(!res.getString(0).isEmpty())
                buffer1.append("TIME1: " + res.getString(0) + "\n");
            if(!res.getString(1).isEmpty())
                buffer1.append("TIME2: " + res.getString(1) + "\n");
            if(!res.getString(2).isEmpty())
                buffer1.append("TIME3: " + res.getString(2) + "\n");
            if(!res.getString(3).isEmpty())
                buffer1.append("TIME4: " + res.getString(3) + "\n");
            if(!res.getString(4).isEmpty())
                buffer1.append("TIME5: " + res.getString(4) + "\n");
        }
        StringBuffer buffer2=new StringBuffer();
        while (res1.moveToNext()) {
            buffer2.append("\n"+"ASSIGNMENT AND SELFSTUDY " + "\n");
            if(!res1.getString(0).isEmpty())
                buffer2.append("TIME1: " + res1.getString(0) + "\n");
            if(!res1.getString(1).isEmpty())
                buffer2.append("TIME2: " + res1.getString(1) + "\n");
            if(!res1.getString(2).isEmpty())
                buffer2.append("TIME3: " + res1.getString(2) + "\n");
            if(!res1.getString(3).isEmpty())
                buffer2.append("TIME4: " + res1.getString(3) + "\n");
            if(!res1.getString(4).isEmpty())
                buffer2.append("TIME5: " + res1.getString(4) + "\n");

        }
        StringBuffer buffer3=new StringBuffer();
        while (res2.moveToNext()) {
            buffer2.append("\n"+"SLEEPING " + "\n");
            if(!res2.getString(0).isEmpty())
                buffer3.append("TIME1: " + res2.getString(0) + "\n");
            if(!res2.getString(1).isEmpty())
                buffer3.append("TIME2: " + res2.getString(1) + "\n");
            if(!res2.getString(2).isEmpty())
                buffer3.append("TIME3: " + res2.getString(2) + "\n");
            if(!res2.getString(3).isEmpty())
                buffer3.append("TIME4: " + res2.getString(3) + "\n");
            if(!res2.getString(4).isEmpty())
                buffer3.append("TIME5: " + res2.getString(4) + "\n");
        }
        StringBuffer buffer4=new StringBuffer();
        while (res3.moveToNext()) {
            buffer4.append("\n"+"PERSONAL_CLEANLINESS "+"\n");
            if(!res3.getString(0).isEmpty())
                buffer4.append("TIME1: "+res3.getString(0)+"\n");
            if(!res3.getString(1).isEmpty())
                buffer4.append("TIME2: "+res3.getString(1)+"\n");
            if(!res3.getString(2).isEmpty())
                buffer4.append("TIME3: "+res3.getString(2)+"\n");
            if(!res3.getString(3).isEmpty())
                buffer4.append("TIME4: "+res3.getString(3)+"\n");
            if(!res3.getString(4).isEmpty())
                buffer4.append("TIME5: "+res3.getString(4)+"\n");
        }
        StringBuffer buffer5=new StringBuffer();
        while (res4.moveToNext()) {
            buffer5.append("\n"+"OUTING AND SHOPPING "+"\n");
            if(!res4.getString(0).isEmpty())
                buffer5.append("TIME1: "+res4.getString(0)+"\n");
            if(!res4.getString(1).isEmpty())
                buffer5.append("TIME2: "+res4.getString(1)+"\n");
            if(!res4.getString(2).isEmpty())
                buffer5.append("TIME3: "+res4.getString(2)+"\n");
            if(!res4.getString(3).isEmpty())
                buffer5.append("TIME4: "+res4.getString(3)+"\n");
            if(!res4.getString(4).isEmpty())
                buffer5.append("TIME5: "+res4.getString(4)+"\n");
        }
        StringBuffer buffer6=new StringBuffer();
        while (res5.moveToNext()) {
            buffer6.append("\n"+"HOBBY AND EXERCISE "+"\n");
            if(!res5.getString(0).isEmpty())
                buffer6.append("TIME1: "+res5.getString(0)+"\n");
            if(!res5.getString(1).isEmpty())
                buffer6.append("TIME2: "+res5.getString(1)+"\n");
            if(!res5.getString(2).isEmpty())
                buffer6.append("TIME3: "+res5.getString(2)+"\n");
            if(!res5.getString(3).isEmpty())
                buffer6.append("TIME4: "+res5.getString(3)+"\n");
            if(!res5.getString(4).isEmpty())
                buffer6.append("TIME5: "+res5.getString(4)+"\n");
        }
        StringBuffer buffer7=new StringBuffer();
        while (res6.moveToNext()) {
            buffer7.append("\n"+"MISCELLANEOUS "+"\n");
            if(!res6.getString(0).isEmpty())
                buffer7.append("TIME1: "+res6.getString(0)+"\n");
            if(!res6.getString(1).isEmpty())
                buffer7.append("TIME2: "+res6.getString(1)+"\n");
            if(!res6.getString(2).isEmpty())
                buffer7.append("TIME3: "+res6.getString(2)+"\n");
            if(!res6.getString(3).isEmpty())
                buffer7.append("TIME4: "+res6.getString(3)+"\n");
            if(!res6.getString(4).isEmpty())
                buffer7.append("TIME5: "+res6.getString(4)+"\n");
        }
        StringBuffer buffer=new StringBuffer();
        buffer.append(buffer1);
        buffer.append(buffer2);
        buffer.append(buffer3);
        buffer.append(buffer4);
        buffer.append(buffer5);
        buffer.append(buffer6);
        buffer.append(buffer7);
        showMessage("SATURDAY SCHEDULE",buffer.toString());
    }


    public void Sunday(View view){
        String day="Sunday";
        UID=user.uid;
        Cursor res=myDb.get_all_datadaywise_EAT_WKND(UID.getText().toString(),day);
        Cursor res1=myDb.get_all_datadaywise_ASSGN_WKND(UID.getText().toString(),day);
        Cursor res2=myDb.get_all_datadaywise_SLEEP_WKND(UID.getText().toString(),day);
        Cursor res3=myDb.get_all_datadaywise_PERSONAL_WKND(UID.getText().toString(),day);
        Cursor res4=myDb.get_all_datadaywise_OUTING_WKND(UID.getText().toString(),day);
        Cursor res5=myDb.get_all_datadaywise_HOBBY_WKND(UID.getText().toString(),day);
        Cursor res6=myDb.get_all_datadaywise_MISCELLANEOUS_WKND(UID.getText().toString(),day);
        if(res.getCount()==0 && res1.getCount()==0 && res2.getCount()==0 && res3.getCount()==0 && res4.getCount()==0 &&res5.getCount()==0){
            showMessage("Error","Nothing Fnd!");
            return;
        }
        StringBuffer buffer1=new StringBuffer();

        while (res.moveToNext()) {
            buffer1.append("EATING " + "\n");
            if(!res.getString(0).isEmpty())
                buffer1.append("TIME1: " + res.getString(0) + "\n");
            if(!res.getString(1).isEmpty())
                buffer1.append("TIME2: " + res.getString(1) + "\n");
            if(!res.getString(2).isEmpty())
                buffer1.append("TIME3: " + res.getString(2) + "\n");
            if(!res.getString(3).isEmpty())
                buffer1.append("TIME4: " + res.getString(3) + "\n");
            if(!res.getString(4).isEmpty())
                buffer1.append("TIME5: " + res.getString(4) + "\n");
        }
        StringBuffer buffer2=new StringBuffer();
        while (res1.moveToNext()) {
            buffer2.append("\n"+"ASSIGNMENT AND SELFSTUDY " + "\n");
            if(!res1.getString(0).isEmpty())
                buffer2.append("TIME1: " + res1.getString(0) + "\n");
            if(!res1.getString(1).isEmpty())
                buffer2.append("TIME2: " + res1.getString(1) + "\n");
            if(!res1.getString(2).isEmpty())
                buffer2.append("TIME3: " + res1.getString(2) + "\n");
            if(!res1.getString(3).isEmpty())
                buffer2.append("TIME4: " + res1.getString(3) + "\n");
            if(!res1.getString(4).isEmpty())
                buffer2.append("TIME5: " + res1.getString(4) + "\n");

        }
        StringBuffer buffer3=new StringBuffer();
        while (res2.moveToNext()) {
            buffer2.append("\n"+"SLEEPING " + "\n");
            if(!res2.getString(0).isEmpty())
                buffer3.append("TIME1: " + res2.getString(0) + "\n");
            if(!res2.getString(1).isEmpty())
                buffer3.append("TIME2: " + res2.getString(1) + "\n");
            if(!res2.getString(2).isEmpty())
                buffer3.append("TIME3: " + res2.getString(2) + "\n");
            if(!res2.getString(3).isEmpty())
                buffer3.append("TIME4: " + res2.getString(3) + "\n");
            if(!res2.getString(4).isEmpty())
                buffer3.append("TIME5: " + res2.getString(4) + "\n");
        }
        StringBuffer buffer4=new StringBuffer();
        while (res3.moveToNext()) {
            buffer4.append("\n"+"PERSONAL_CLEANLINESS "+"\n");
            if(!res3.getString(0).isEmpty())
                buffer4.append("TIME1: "+res3.getString(0)+"\n");
            if(!res3.getString(1).isEmpty())
                buffer4.append("TIME2: "+res3.getString(1)+"\n");
            if(!res3.getString(2).isEmpty())
                buffer4.append("TIME3: "+res3.getString(2)+"\n");
            if(!res3.getString(3).isEmpty())
                buffer4.append("TIME4: "+res3.getString(3)+"\n");
            if(!res3.getString(4).isEmpty())
                buffer4.append("TIME5: "+res3.getString(4)+"\n");
        }
        StringBuffer buffer5=new StringBuffer();
        while (res4.moveToNext()) {
            buffer5.append("\n"+"OUTING AND SHOPPING "+"\n");
            if(!res4.getString(0).isEmpty())
            buffer5.append("TIME1: "+res4.getString(0)+"\n");
            if(!res4.getString(1).isEmpty())
            buffer5.append("TIME2: "+res4.getString(1)+"\n");
            if(!res4.getString(2).isEmpty())
            buffer5.append("TIME3: "+res4.getString(2)+"\n");
            if(!res4.getString(3).isEmpty())
            buffer5.append("TIME4: "+res4.getString(3)+"\n");
            if(!res4.getString(4).isEmpty())
            buffer5.append("TIME5: "+res4.getString(4)+"\n");
        }
        StringBuffer buffer6=new StringBuffer();
        while (res5.moveToNext()) {
            buffer6.append("\n"+"HOBBY AND EXERCISE "+"\n");
            if(!res5.getString(0).isEmpty())
                buffer6.append("TIME1: "+res5.getString(0)+"\n");
            if(!res5.getString(1).isEmpty())
                buffer6.append("TIME2: "+res5.getString(1)+"\n");
            if(!res5.getString(2).isEmpty())
                buffer6.append("TIME3: "+res5.getString(2)+"\n");
            if(!res5.getString(3).isEmpty())
                buffer6.append("TIME4: "+res5.getString(3)+"\n");
            if(!res5.getString(4).isEmpty())
                buffer6.append("TIME5: "+res5.getString(4)+"\n");
        }
        StringBuffer buffer7=new StringBuffer();
        while (res6.moveToNext()) {
            buffer7.append("\n"+"MISCELLANEOUS "+"\n");
            if(!res6.getString(0).isEmpty())
                buffer7.append("ACTIVITY 1: "+res6.getString(0)+"\n");
            if(!res6.getString(1).isEmpty())
                buffer7.append("TIME: "+res6.getString(1)+"\n");
            if(!res6.getString(2).isEmpty())
                buffer7.append("ACTIVITY 2: "+res6.getString(2)+"\n");
            if(!res6.getString(3).isEmpty())
                buffer7.append("TIME: "+res6.getString(3)+"\n");
            if(!res6.getString(4).isEmpty())
                buffer7.append("ACTIVITY 3: "+res6.getString(4)+"\n");
            if(!res6.getString(5).isEmpty())
                buffer7.append("TIME: "+res6.getString(5)+"\n");
        }
        StringBuffer buffer=new StringBuffer();
        buffer.append(buffer1);
        buffer.append(buffer2);
        buffer.append(buffer3);
        buffer.append(buffer4);
        buffer.append(buffer5);
        buffer.append(buffer6);
        buffer.append(buffer7);

        showMessage("SUNDAY SCHEDULE",buffer.toString());
    }




}
