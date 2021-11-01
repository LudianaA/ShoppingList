package com.example.shoppinglist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG =
            MainActivity.class.getSimpleName();
    public static final int TEXT_REQUEST = 1;
    private TextView item1,item2,item3,item4,item5,item6,item7,item8,item9,item10;
    private ArrayList <String> buttonList = new ArrayList<>();
    private ArrayList <String> savedlist = new ArrayList<>();
    private ArrayList <TextView> itemList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        item1 = findViewById(R.id.item1);
        item2 = findViewById(R.id.item2);
        item3 = findViewById(R.id.item3);
        item4 = findViewById(R.id.item4);
        item5 = findViewById(R.id.item5);
        item6 = findViewById(R.id.item6);
        item7 = findViewById(R.id.item7);
        item8 = findViewById(R.id.item8);
        item9 = findViewById(R.id.item9);
        item10 = findViewById(R.id.item10);


        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);
        itemList.add(item4);
        itemList.add(item5);
        itemList.add(item6);
        itemList.add(item7);
        itemList.add(item8);
        itemList.add(item9);
        itemList.add(item10);




        if(savedInstanceState != null) {
            savedlist = (ArrayList<String>) savedInstanceState.getSerializable("array");
            for(int i = 0; i < savedlist.size();i++){
               itemList.get(i).setText(savedlist.get(i));

          }


      }
    }

    public void launchSecondActivity(View view) {
        Log.d(LOG_TAG, "Button clicked!");
        Intent intent = new Intent(this, SecondActivity.class);
        startActivityForResult(intent, TEXT_REQUEST);
    }

    @Override
    public void onActivityResult(int requestCode,
                                 int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == TEXT_REQUEST) {
            if (resultCode == RESULT_OK) {
                String reply =
                        data.getStringExtra(SecondActivity.EXTRA_REPLY);

                if (!(buttonList.contains(reply))) {
                    buttonList.add(reply);
                }
               for(int i = 0; i <buttonList.size();i++){
                  itemList.get(i).setText(buttonList.get(i));

                }



            }
        }
    }


    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putSerializable("array",buttonList);


    }

}