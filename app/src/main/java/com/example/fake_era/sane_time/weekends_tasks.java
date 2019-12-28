package com.example.fake_era.sane_time;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class weekends_tasks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weekends_tasks);
    }
    public void goto_eating_wknd(View view) {
        Intent intent = new Intent(this, Eating_Wknd.class);
        startActivity(intent);
    }
    public void goto_outing_wknd(View view) {
        Intent intent = new Intent(this, Outing_Shopping_Wknd.class);
        startActivity(intent);
    }
    public void goto_assgn_wknd(View view) {
        Intent intent = new Intent(this, assignment_selfstudy_wknd.class);
        startActivity(intent);
    }
    public void goto_hobby_wknd(View view) {
        Intent intent = new Intent(this, Hobby_Exercise_Wknd.class);
        startActivity(intent);
    }
    public void goto_sleeping_wknd(View view) {
        Intent intent = new Intent(this, Sleeping_Wknd.class);
        startActivity(intent);
    }
    public void goto_personal_wknd(View view) {
        Intent intent = new Intent(this, Personal_Cleanliness_Wknd.class);
        startActivity(intent);
    }

    public void gotoMiscellanous_wknd(View view) {
        Intent intent = new Intent(weekends_tasks.this, Miscellaneous_Wknd.class);
        startActivity(intent);
    }
}
