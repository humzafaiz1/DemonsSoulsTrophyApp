package com.bluenarwhal.demonssoulsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SaintsTrophyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saints_trophy);
    }

    public void showAntidote(View view){
        Intent intent = new Intent(this, AntidoteActivity.class);
        startActivity(intent);
    }

    public void showAntiMagicField(View view){
        Intent intent = new Intent(this, AntiMagicFieldActivity.class);
        startActivity(intent);
    }

    public void showBanish(View view){
        Intent intent = new Intent(this, BanishActivity.class);
        startActivity(intent);
    }

    public void showCure(View view){
        Intent intent = new Intent(this, CureActivity.class);
        startActivity(intent);
    }

    public void showEvacuate(View view){
        Intent intent = new Intent(this, EvacuateActivity.class);
        startActivity(intent);
    }

    public void showGodsWrath(View view){
        Intent intent = new Intent(this, GodsWrathActivity.class);
        startActivity(intent);
    }

    public void showHeal(View view){
        Intent intent = new Intent(this, HealActivity.class);
        startActivity(intent);
    }

    public void showHiddenSoul(View view){
        Intent intent = new Intent(this, HiddenSoulActivity.class);
        startActivity(intent);
    }

    public void showRecovery(View view){
        Intent intent = new Intent(this, RecoveryActivity.class);
        startActivity(intent);
    }

    public void showRegeneration(View view){
        Intent intent = new Intent(this, RegenerationActivity.class);
        startActivity(intent);
    }

    public void showResurrection(View view){
        Intent intent = new Intent(this, ResurrectionActivity.class);
        startActivity(intent);
    }

    public void showSecondChance(View view){
        Intent intent = new Intent(this, SecondChanceActivity.class);
        startActivity(intent);
    }
}