package com.bluenarwhal.demonssoulsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RoadmapActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roadmap);
    }

    public void showUmbasa(View view){
        Intent intent = new Intent(this, UmbasaActivity.class);
        startActivity(intent);
    }

    public void showWitchInTheTower(View view){
        Intent intent = new Intent(this, WitchInTheTowerActivity.class);
        startActivity(intent);
    }

    public void showADashOfSage(View view){
        Intent intent = new Intent(this, ADashOfSageActivity.class);
        startActivity(intent);
    }

    public void showSagesTrophy(View view){
        Intent intent = new Intent(this, SagesTrophyActivity.class);
        startActivity(intent);
    }

    public void showSaintsTrophy(View view){
        Intent intent = new Intent(this, SaintsTrophyActivity.class);
        startActivity(intent);
    }

    public void showKingOfRings(View view){
        Intent intent = new Intent(this, KingOfRingsActivity.class);
        startActivity(intent);
    }

    public void showSeekestSoulPower(View view){
        Intent intent = new Intent(this, SeekestSoulPowerActivity.class);
        startActivity(intent);
    }

    public void showWorthyOfTheSword(View view){
        Intent intent = new Intent(this, WorthyOfTheSwordActivity.class);
        startActivity(intent);
    }

    public void showOneOfTheFew(View view){
        Intent intent = new Intent(this, OneOfTheFewActivity.class);
        startActivity(intent);
    }

    public void showOneShallFall(View view){
        Intent intent = new Intent(this, OneShallFallActivity.class);
        startActivity(intent);
    }

    public void showBrotherInArms(View view){
        Intent intent = new Intent(this, BrotherInArmsActivity.class);
        startActivity(intent);
    }

    public void showFistsOfLegend(View view){
        Intent intent = new Intent(this, FistsOfLegendActivity.class);
        startActivity(intent);
    }

    public void showTimeForRolling(View view){
        Intent intent = new Intent(this, TimeForRollingActivity.class);
        startActivity(intent);
    }

    public void showNotFooled(View view){
        Intent intent = new Intent(this, NotFooledActivity.class);
        startActivity(intent);
    }

    public void showOneShallStand(View view){
        Intent intent = new Intent(this, OneShallStandActivity.class);
        startActivity(intent);
    }

    public void showMayYouBeUnharmed(View view){
        Intent intent = new Intent(this, MayYouBeUnharmedActivity.class);
        startActivity(intent);
    }

    public void showLegacyOfTheKings(View view){
        Intent intent = new Intent(this, LegacyOfTheKingsActivity.class);
        startActivity(intent);
    }

    public void showReturnToForm(View view){
        Intent intent = new Intent(this, ReturnToFormActivity.class);
        startActivity(intent);
    }

    public void showUnwelcomeGuest(View view){
        Intent intent = new Intent(this, UnwelcomeGuestActivity.class);
        startActivity(intent);
    }

    public void showRoadToPossibilities(View view){
        Intent intent = new Intent(this, RoadToPossibilitesActivity.class);
        startActivity(intent);
    }
}