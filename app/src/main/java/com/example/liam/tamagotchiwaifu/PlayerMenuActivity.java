package com.example.liam.tamagotchiwaifu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class PlayerMenuActivity extends AppCompatActivity
{
    Game game;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        game = Game.getInstance();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_menu);

        EditText txtYen = findViewById(R.id.txtYenInventory);
        txtYen.setText(game.getYen() + getString(R.string.yen));

        LinearLayout lotInventory = findViewById(R.id.lotInventory);
        lotInventory.removeAllViews();
        ArrayList<Item> inventory = game.getInventory();
        for(final Item i : inventory)
        {
            Button btn = new Button(getApplicationContext());
            btn.setText(i.getName());
            btn.setOnClickListener(new View.OnClickListener()
            {
                public void onClick(View v)
                {
                    game.useItemFromInventory(i);
                    startActivity(new Intent(PlayerMenuActivity.this, MainActivity.class));
                }
            });
            lotInventory.addView(btn);
        }
    }

    public void btnBack_onClick(View v)
    {
        startActivity(new Intent(PlayerMenuActivity.this, MainActivity.class));
    }
}
