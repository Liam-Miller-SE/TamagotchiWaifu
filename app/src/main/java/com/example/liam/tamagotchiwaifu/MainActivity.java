package com.example.liam.tamagotchiwaifu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout lotLove = findViewById(R.id.lotLove);
        ViewGroup.LayoutParams params = new ViewGroup.LayoutParams(100, 100);
        //initialize hearts
        for(int i = 0; i < 6; i++)
        {
            ImageView vw = new ImageView(getApplicationContext());
            vw.setImageResource(R.mipmap.love_empty);
            vw.setLayoutParams(params);
            lotLove.addView(vw, i);
        }
        params = new ViewGroup.LayoutParams(50, 50);

        //initialize food
        LinearLayout lotFood = findViewById(R.id.lotFood);
        for(int i = 0; i < 6; i++)
        {
            ImageView vw = new ImageView(getApplicationContext());
            vw.setImageResource(R.mipmap.hunger_empty);
            vw.setLayoutParams(params);
            lotFood.addView(vw, i);
        }

        //initialize confidence
        LinearLayout lotConfidence = findViewById(R.id.lotConfidence);
        for(int i = 0; i < 6; i++)
        {
            ImageView vw = new ImageView(getApplicationContext());
            vw.setImageResource(R.mipmap.confident_empty);
            vw.setLayoutParams(params);
            lotConfidence.addView(vw, i);
        }

        //initialize Health
        LinearLayout lotHealth = findViewById(R.id.lotHealth);
        for(int i = 0; i < 6; i++)
        {
            ImageView vw = new ImageView(getApplicationContext());
            vw.setImageResource(R.mipmap.health_empty);
            vw.setLayoutParams(params);
            lotHealth.addView(vw, i);
        }

        //initialize Happiness
        LinearLayout lotHappy = findViewById(R.id.lotHappy);
        for(int i = 0; i < 6; i++)
        {
            ImageView vw = new ImageView(getApplicationContext());
            vw.setImageResource(R.mipmap.happy_empty);
            vw.setLayoutParams(params);
            lotHappy.addView(vw, i);
        }
    }
}
