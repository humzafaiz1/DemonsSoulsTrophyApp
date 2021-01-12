package com.bluenarwhal.demonssoulsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SagesTrophyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sages_trophy);
    }

    public void showAcidCloud(View view){
        Intent intent = new Intent(this, AcidCloudActivity.class);
        startActivity(intent);
    }

    public void showCloak(View view){
        Intent intent = new Intent(this, CloakActivity.class);
        startActivity(intent);
    }

    public void showCurseWeapon(View view){
        Intent intent = new Intent(this, CurseWeaponActivity.class);
        startActivity(intent);
    }

    public void showDeathCloud(View view){
        Intent intent = new Intent(this, DeathCloudActivity.class);
        startActivity(intent);
    }

    public void showEnchantWeapon(View view){
        Intent intent = new Intent(this, EnchantWeaponActivity.class);
        startActivity(intent);
    }

    public void showFamiliarsPrank(View view){
        Intent intent = new Intent(this, FamiliarsPrankActivity.class);
        startActivity(intent);
    }

    public void showFireball(View view){
        Intent intent = new Intent(this, FireballActivity.class);
        startActivity(intent);
    }

    public void showFireSpray(View view){
        Intent intent = new Intent(this, FireSprayActivity.class);
        startActivity(intent);
    }

    public void showFirestorm(View view){
        Intent intent = new Intent(this, FirestormActivity.class);
        startActivity(intent);
    }

    public void showFlameToss(View view){
        Intent intent = new Intent(this, FlameTossActivity.class);
        startActivity(intent);
    }

    public void showHomingSoulArrow(View view){
        Intent intent = new Intent(this, HomingSoulArrowActivity.class);
        startActivity(intent);
    }

    public void showIgnite(View view){
        Intent intent = new Intent(this, IgniteActivity.class);
        startActivity(intent);
    }

    public void showLightWeapon(View view){
        Intent intent = new Intent(this, LightWeaponActivity.class);
        startActivity(intent);
    }

    public void showPoisonCloud(View view){
        Intent intent = new Intent(this, PoisonCloudActivity.class);
        startActivity(intent);
    }

    public void showProtection(View view){
        Intent intent = new Intent(this, ProtectionActivity.class);
        startActivity(intent);
    }

    public void showRelief(View view){
        Intent intent = new Intent(this, ReliefActivity.class);
        startActivity(intent);
    }

    public void showSoulArrow(View view){
        Intent intent = new Intent(this, SoulArrowActivity.class);
        startActivity(intent);
    }

    public void showSoulRay(View view){
        Intent intent = new Intent(this, SoulRayActivity.class);
        startActivity(intent);
    }

    public void showSoulSucker(View view){
        Intent intent = new Intent(this, SoulsuckerActivity.class);
        startActivity(intent);
    }

    public void showSoulThirst(View view){
        Intent intent = new Intent(this, SoulThirstActivity.class);
        startActivity(intent);

    }

    public void showWarding(View view){
        Intent intent = new Intent(this, WardingActivity.class);
        startActivity(intent);
    }

    public void showWaterVeil(View view){
        Intent intent = new Intent(this, WaterVeilActivity.class);
        startActivity(intent);
    }
}