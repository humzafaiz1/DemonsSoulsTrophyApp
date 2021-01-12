package com.bluenarwhal.demonssoulsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class NotFooledActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_not_fooled);
    }

    public void showFoolsIdol(View view){
        Intent intent = new Intent(this, FoolsIdolActivity.class);
        startActivity(intent);
    }
}