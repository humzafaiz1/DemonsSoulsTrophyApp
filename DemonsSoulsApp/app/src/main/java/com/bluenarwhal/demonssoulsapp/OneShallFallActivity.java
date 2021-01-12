package com.bluenarwhal.demonssoulsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class OneShallFallActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_shall_fall);
    }

    public void showTowerKnight(View view){
        Intent intent = new Intent(this, TowerKnightActivity.class);
        startActivity(intent);
    }
}