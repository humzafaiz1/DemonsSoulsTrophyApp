package com.bluenarwhal.demonssoulsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FistsOfLegendActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fists_of_legend);
    }

    public void showDragonGod(View view){
        Intent intent = new Intent(this, DragonOfGodActivity.class);
        startActivity(intent);
    }
}