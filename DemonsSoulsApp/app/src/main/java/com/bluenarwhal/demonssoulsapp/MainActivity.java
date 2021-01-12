package com.bluenarwhal.demonssoulsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity {
    private Button trophiesButton;
    private Button roadmapButton;
    private ScrollView sv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        trophiesButton = findViewById(R.id.trophiesButton);
        trophiesButton.setSoundEffectsEnabled(false);
    }

//    public void openCharActivity(View view){
     //   sv = findViewById(R.id.scrollView1);
   //     lastButton = findViewById(R.id.lastButton);
 //       sv.smoothScrollTo((int) lastButton.getX(), (int) lastButton.getY());
//    }

    public void openTrophiesActivity(View view){
        Intent intent = new Intent(this, TrophiesActivity.class);
        startActivity(intent);
    }

    public void openRoadmapActivity(View view){
        Intent intent = new Intent(this, RoadmapActivity.class);
        startActivity(intent);
    }

}