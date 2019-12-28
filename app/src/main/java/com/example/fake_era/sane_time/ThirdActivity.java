package com.example.fake_era.sane_time;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
    }

    public void goto_eating_wkdy(View view) {
        Intent intent = new Intent(this, Eating_Wkdy.class);
        startActivity(intent);
    }
    public void goto_classes(View view) {
        Intent intent = new Intent(this, Classes.class);
        startActivity(intent);
    }
    public void goto_assgn_wkdy(View view) {
        Intent intent = new Intent(this, Assignment_SelfStudy_Wkdy.class);
        startActivity(intent);
    }
    public void goto_hobby_wkdy(View view) {
        Intent intent = new Intent(this, Hobby_Exercise_Wkdy.class);
        startActivity(intent);
    }
    public void goto_sleeping_wkdy(View view) {
        Intent intent = new Intent(this, Sleeping_Wkdy.class);
        startActivity(intent);
    }
    public void goto_personal_wkdy(View view) {
        Intent intent = new Intent(this, Personal_Cleanliness_Wkdy.class);
        startActivity(intent);
    }

}
