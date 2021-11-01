package com.example.shoppinglist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private static final String LOG_TAG =
            MainActivity.class.getSimpleName();
    public static final String RICE = "Rice";
    public static final String EXTRA_REPLY =
            "com.example.android.shoppinglist.extra.REPLY";

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        btn1 = findViewById(R.id.cheese_button);
        btn2 = findViewById(R.id.rice_button);
        btn3 = findViewById(R.id.bread_button);
        btn4 = findViewById(R.id.egg_button);
        btn5 = findViewById(R.id.butter_button);
        btn6 = findViewById(R.id.milk_button);
        btn7 = findViewById(R.id.carrot_button);
        btn8 = findViewById(R.id.cookies_button);
        btn9 = findViewById(R.id.grapes_button);
        btn10 = findViewById(R.id.water_button);

    }

    public void addCheese(View view) {
        Log.d(LOG_TAG, "clicked cheese!");
        String b1 = btn1.getText().toString();
        Intent cheese = new Intent();
        cheese.putExtra(EXTRA_REPLY,b1);
        setResult(RESULT_OK,cheese);
        finish();

    }

    public void addRice(View view) {
        Log.d(LOG_TAG, "clicked rice!");
        String b2 = btn2.getText().toString();
        Intent rice = new Intent();
        rice.putExtra(EXTRA_REPLY,b2);
        setResult(RESULT_OK,rice);
        finish();

    }

    public void addBread(View view) {
        Log.d(LOG_TAG, "clicked bread!");
        String b3 = btn3.getText().toString();
        Intent bread = new Intent();
        bread.putExtra(EXTRA_REPLY,b3);
        setResult(RESULT_OK,bread);
        finish();
    }

    public void addEgg(View view) {
        Log.d(LOG_TAG, "clicked egg!");
        String b4 = btn4.getText().toString();
        Intent egg = new Intent();
        egg.putExtra(EXTRA_REPLY,b4);
        setResult(RESULT_OK,egg);
        finish();
    }

    public void addButter(View view) {
        Log.d(LOG_TAG, "clicked butter!");
        String b5 = btn5.getText().toString();
        Intent butter = new Intent();
        butter.putExtra(EXTRA_REPLY,b5);
        setResult(RESULT_OK,butter);
        finish();
    }

    public void addMilk(View view) {
        Log.d(LOG_TAG, "clicked milk!");
        String b6 = btn6.getText().toString();
        Intent milk = new Intent();
        milk.putExtra(EXTRA_REPLY,b6);
        setResult(RESULT_OK,milk);
        finish();
    }

    public void addCarrot(View view) {
        Log.d(LOG_TAG, "clicked carrot!");
        String b7 = btn7.getText().toString();
        Intent carrot = new Intent();
        carrot.putExtra(EXTRA_REPLY,b7);
        setResult(RESULT_OK,carrot);
        finish();
    }

    public void addWater(View view) {
        Log.d(LOG_TAG, "clicked water!");
        String b10 = btn10.getText().toString();
        Intent water = new Intent();
        water.putExtra(EXTRA_REPLY,b10);
        setResult(RESULT_OK,water);
        finish();
    }

    public void addGrape(View view) {
        Log.d(LOG_TAG, "clicked grapes!");
        String b9 = btn9.getText().toString();
        Intent grape = new Intent();
        grape.putExtra(EXTRA_REPLY,b9);
        setResult(RESULT_OK,grape);
        finish();
    }

    public void addCookies(View view) {
        Log.d(LOG_TAG, "clicked cookies!");
        String b8 = btn8.getText().toString();
        Intent cookies = new Intent();
        cookies.putExtra(EXTRA_REPLY,b8);
        setResult(RESULT_OK,cookies);
        finish();
    }
}