package com.bluenarwhal.demonssoulsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class KingOfRingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_king_of_rings);
    }

    public void showCatRing(View view){
        Intent intent = new Intent(this, CatRingActivity.class);
        startActivity(intent);
    }

    public void showCleverRatsRing(View view){
        Intent intent = new Intent(this, CleverRatsRingActivity.class);
        startActivity(intent);
    }

    public void showClingRing(View view){
        Intent intent = new Intent(this, ClingRingActivity.class);
        startActivity(intent);
    }

    public void showDullRatsRing(View view){
        Intent intent = new Intent(this, DullRatsRingActivity.class);
        startActivity(intent);
    }

    public void showEternalWarriorsRing(View view){
        Intent intent = new Intent(this, EternalWarriorsRingActivity.class);
        startActivity(intent);
    }

    public void showFoesRing(View view){
        Intent intent = new Intent(this, FoesRingActivity.class);
        startActivity(intent);
    }

    public void showFragrantRing(View view){
        Intent intent = new Intent(this, FragrantRingActivity.class);
        startActivity(intent);
    }

    public void showFriendsRing(View view){
        Intent intent = new Intent(this, FriendsRingActivity.class);
        startActivity(intent);
    }

    public void showGraverobbersRing(View view){
        Intent intent = new Intent(this, GraverobbersRingActivity.class);
        startActivity(intent);
    }

    public void showMastersRing(View view){
        Intent intent = new Intent(this, MastersRingActivity.class);
        startActivity(intent);
    }

    public void showRegeneratorsRing(View view){
        Intent intent = new Intent(this, RegeneratorsRingActivity.class);
        startActivity(intent);
    }

    public void showRingOfAvarice(View view){
        Intent intent = new Intent(this, RingOfAvariceActivity.class);
        startActivity(intent);
    }

    public void showRingOfDevoutPrayer(View view){
        Intent intent = new Intent(this, RingOfDevoutPrayerActivity.class);
        startActivity(intent);
    }

    public void showPlagueResistanceRing(View view){
        Intent intent = new Intent(this, PlagueResistanceRingActivity.class);
        startActivity(intent);
    }

    public void showFlameResistanceRing(View view){
        Intent intent = new Intent(this, FlameResistanceRingActivity.class);
        startActivity(intent);
    }

    public void showGashResistanceRing(View view){
        Intent intent = new Intent(this, GashResistanceRingActivity.class);
        startActivity(intent);
    }

    public void showRingOfHerculeanStrength(View view){
        Intent intent = new Intent(this, RingOfHerculeanStrengthActivity.class);
        startActivity(intent);
    }

    public void showRingOfGreatStrength(View view){
        Intent intent = new Intent(this, RingOfGreatStrengthActivity.class);
        startActivity(intent);
    }

    public void showRingOfMagicalDullness(View view){
        Intent intent = new Intent(this, RingOfMagicalDullnessActivity.class);
        startActivity(intent);
    }

    public void showRingOfMagicalNature(View view){
        Intent intent = new Intent(this, RingOfMagicalNatureActivity.class);
        startActivity(intent);
    }

    public void showRingOfMagicalSharpness(View view){
        Intent intent = new Intent(this, RingOfMagicalSharpnessActivity.class);
        startActivity(intent);
    }

    public void showRingOfPoisonResistance(View view){
        Intent intent = new Intent(this, RingOfPoisonResistance.class);
        startActivity(intent);
    }

    public void showRingOfSincerePrayer(View view){
        Intent intent = new Intent(this, RingOfSincerePrayerActivity.class);
        startActivity(intent);
    }

    public void showRingOfTheAccursed(View view){
        Intent intent = new Intent(this, RingOfTheAccursedActivity.class);
        startActivity(intent);
    }

    public void showRoninsRing(View view){
        Intent intent = new Intent(this, RoninsRingActivity.class);
        startActivity(intent);
    }

    public void showThiefRing(View view){
        Intent intent = new Intent(this, ThiefRingActivity.class);
        startActivity(intent);
    }

    public void showRingOfLongevity(View view){
        Intent intent = new Intent(this, RingOfLongevityActivity.class);
        startActivity(intent);
    }

    public void showProvidentialRing(View view){
        Intent intent = new Intent(this, ProvidentialRingActivity.class);
        startActivity(intent);
    }

    public void showSoddenRing(View view){
        Intent intent = new Intent(this, SoddenRingActivity.class);
        startActivity(intent);
    }

    public void showRingOfUnevenScales(View view){
        Intent intent = new Intent(this, RingOfUnevenScalesActivity.class);
        startActivity(intent);
    }
}