package com.bluenarwhal.demonssoulsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class BrotherInArmsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brother_in_arms);
    }

    public void showPenetrator(View view){
        Intent intent = new Intent(this, PenetratorActivity.class);
        startActivity(intent);
    }
}