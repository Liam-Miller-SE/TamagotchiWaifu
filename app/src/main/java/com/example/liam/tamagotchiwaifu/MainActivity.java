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
        for(int i = 0; i < 6; i++)
        {
            ImageView vw = new ImageView(getApplicationContext());
            if(i == 0)
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
    }
}
