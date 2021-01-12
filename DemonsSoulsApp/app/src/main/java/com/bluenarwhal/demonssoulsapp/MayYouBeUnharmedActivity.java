package com.bluenarwhal.demonssoulsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MayYouBeUnharmedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_may_you_be_unharmed);
    }

    public void showMaidenAstraea(View view){
        Intent intent = new Intent(this, MaidenAstraeaActivity.class);
        startActivity(intent);
    }
}