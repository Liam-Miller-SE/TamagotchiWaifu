package com.example.liam.tamagotchiwaifu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class StoreMenuActivity extends AppCompatActivity
{
    Game game;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store_menu);
        game = Game.getInstance();

        RefreshYen();

        LinearLayout lotStore = findViewById(R.id.lotStore);
        lotStore.removeAllViews();
        ArrayList<Item> inventory = game.getStoreInventory();
        ArrayList<Integer> costs = game.getStoreCosts();
        for(int x = 0; x < inventory.size(); x++)
        {
            Button btn = new Button(getApplicationContext());
            final Item i = inventory.get(x);
            final int cost = costs.get(x);
            btn.setText(i.getName() + " - " + cost + getString(R.string.yen));
            btn.setOnClickListener(new View.OnClickListener()
            {
                public void onClick(View v)
                {
                    if(game.getYen() >= cost)
                    {
                        game.buyItem(i, cost);
                    }
                    RefreshYen();
                }
            });
            LinearLayout ll = new LinearLayout(getApplicationContext());
            ll.setOrientation(LinearLayout.HORIZONTAL);
            ImageView iv = new ImageView(getApplicationContext());
            iv.setImageResource(i.getResourseID());
            ll.addView(iv);
            ll.addView(btn);
            lotStore.addView(ll);
        }
    }

    private void RefreshYen()
    {
        EditText txtYen = findViewById(R.id.txtYenStore);
        txtYen.setText(game.getYen() + getString(R.string.yen));
    }

    public void btnStoreBack_onClick(View v)
    {
        startActivity(new Intent(StoreMenuActivity.this, MainActivity.class));
    }
}
