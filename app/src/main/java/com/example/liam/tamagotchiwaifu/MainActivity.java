package com.example.liam.tamagotchiwaifu;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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
    private Game game;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        game = Game.getInstance();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView hair = (ImageView) findViewById(R.id.petHair);
        Drawable imghair = getResources().getDrawable(R.mipmap.nikki_hair1);
        imghair.setFilterBitmap(false);
        hair.setImageDrawable(imghair);

        ImageView face = (ImageView) findViewById(R.id.petFace);
        Drawable imgface = getResources().getDrawable(R.mipmap.nikki_idle);
        imgface.setFilterBitmap(false);
        face.setImageDrawable(imgface);

        UpdateStats();
    }

    private void UpdateStats()
    {
        LinearLayout lotLove = findViewById(R.id.lotLove);
        lotLove.removeAllViews();
        ViewGroup.LayoutParams params = new ViewGroup.LayoutParams(100, 100);
        //initialize hearts
        for(int i = 0; i < 6; i++)
        {
            ImageView vw = new ImageView(getApplicationContext());
            if(game.getLove() > i + 1)
            {
                vw.setImageResource(R.mipmap.love_full);
            }
            else if(game.getLove() + 0.5 > i + 1)
            {
                vw.setImageResource(R.mipmap.love_half);
            }
            else
            {
                vw.setImageResource(R.mipmap.love_empty);
            }
            vw.setLayoutParams(params);
            lotLove.addView(vw, i);
        }
        params = new ViewGroup.LayoutParams(50, 50);

        //initialize food
        LinearLayout lotFood = findViewById(R.id.lotFood);
        lotFood.removeAllViews();
        for(int i = 0; i < 6; i++)
        {
            ImageView vw = new ImageView(getApplicationContext());
            if(game.getFood() > i + 1)
            {
                vw.setImageResource(R.mipmap.hunger_full);
            }
            else if(game.getFood() + 0.5 > i + 1)
            {
                vw.setImageResource(R.mipmap.hunger_half);
            }
            else
            {
                vw.setImageResource(R.mipmap.hunger_empty);
            }
            vw.setLayoutParams(params);
            lotFood.addView(vw, i);
        }

        //initialize confidence
        LinearLayout lotConfidence = findViewById(R.id.lotConfidence);
        lotConfidence.removeAllViews();
        for(int i = 0; i < 6; i++)
        {
            ImageView vw = new ImageView(getApplicationContext());
            if(game.getConfidence() > i + 1)
            {
                vw.setImageResource(R.mipmap.confident_full);
            }
            else if(game.getConfidence() + 0.5 > i + 1)
            {
                vw.setImageResource(R.mipmap.confident_half);
            }
            else
            {
                vw.setImageResource(R.mipmap.confident_empty);
            }
            vw.setLayoutParams(params);
            lotConfidence.addView(vw, i);
        }

        //initialize Health
        LinearLayout lotHealth = findViewById(R.id.lotHealth);
        lotHealth.removeAllViews();
        for(int i = 0; i < 6; i++)
        {
            ImageView vw = new ImageView(getApplicationContext());
            if(game.getHealth() > i + 1)
            {
                vw.setImageResource(R.mipmap.health_full);
            }
            else if(game.getHealth() + 0.5 > i + 1)
            {
                vw.setImageResource(R.mipmap.health_half);
            }
            else
            {
                vw.setImageResource(R.mipmap.health_empty);
            }
            vw.setLayoutParams(params);
            lotHealth.addView(vw, i);
        }

        //initialize Happiness
        LinearLayout lotHappy = findViewById(R.id.lotHappy);
        lotHappy.removeAllViews();
        for(int i = 0; i < 6; i++)
        {
            ImageView vw = new ImageView(getApplicationContext());
            if(game.getHappiness() > i + 1)
            {
                vw.setImageResource(R.mipmap.happy_full);
            }
            else if(game.getHappiness() + 0.5 > i + 1)
            {
                vw.setImageResource(R.mipmap.happy_half);
            }
            else
            {
                vw.setImageResource(R.mipmap.happy_empty);
            }
            vw.setLayoutParams(params);
            lotHappy.addView(vw, i);
        }
    }

    public void btnItems_onClick(View v)
    {
        startActivity(new Intent(MainActivity.this, PlayerMenuActivity.class));
    }

    public void btnStore_onClick(View v)
    {
        startActivity(new Intent(MainActivity.this, StoreMenuActivity.class));
    }

}
