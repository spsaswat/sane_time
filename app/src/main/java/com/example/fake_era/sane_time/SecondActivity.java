package com.example.fake_era.sane_time;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void workingdays(View view) {
        Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
        startActivity(intent);
    }

    public void holidays(View view) {
        Intent intent = new Intent(this, weekends_tasks.class);
        startActivity(intent);
    }

    public void gotoSubject(View view) {
        Intent intent = new Intent(SecondActivity.this, SubjectActivity.class);
        startActivity(intent);
    }

    public void gotoTimetable(View view) {
        Intent intent = new Intent(SecondActivity.this, Time_table.class);
        startActivity(intent);
    }



}
