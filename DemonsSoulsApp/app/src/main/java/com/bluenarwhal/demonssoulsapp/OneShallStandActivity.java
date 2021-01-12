package com.bluenarwhal.demonssoulsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class OneShallStandActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_shall_stand);
    }

    public void showAdjudicator(View view){
        Intent intent = new Intent(this, AdjudicatorActivity.class);
        startActivity(intent);
    }
}