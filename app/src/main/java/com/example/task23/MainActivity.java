package com.example.task23;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView infoText;
    TextView samuraiText;
    TextView ninjaText;
    TextView wizardText;
    Human firstHuman;
    Human secHuman;
    Ninja ninja;
    Samurai samurai;
    Wizard wizard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        infoText = findViewById(R.id.infoText);
        firstHuman = new Human();
        secHuman = new Human(10, 50, 30, 200);
        ninja = new Ninja(5, 10, 20, 30);
        samurai = new Samurai();
        wizard = new Wizard(30, 20, 60, 200);

        infoText.setText("first Human health and strength is " + firstHuman.getHealth() + " , " + firstHuman.getStrength() + "Second human health and strength is : " + secHuman.getHealth() + " , " + secHuman.getStrength() +
                "after first Human attacked Second Human ; the health for second human is now " + firstHuman.attack(secHuman));
        samuraiText = findViewById(R.id.samuraiText);
        ninjaText = findViewById(R.id.ninjaText);
        wizardText = findViewById(R.id.wizardText);
        ninjaText.setText("ninjas health after stealing from human one : " + ninja.steal(firstHuman) + "  and his health after running away :  " + ninja.runaway());
        wizardText.setText("humans health after healing  " + wizard.heal(secHuman) + " human health after fireball is : " + wizard.fireball(secHuman));
        samuraiText.setText("samurais health after killing onther human  " + samurai.deathBlow(firstHuman) + "  and health after he meditate " + samurai.meditate() + "And number of samurais are : " + samurai.counter);
    }
}