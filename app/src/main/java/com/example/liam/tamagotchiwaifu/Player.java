package com.example.liam.tamagotchiwaifu;

import java.util.ArrayList;

/**
 * Created by liam on 12/2/17.
 */

public class Player
{
    String name;
    ArrayList<Item> inventory;
    int yen;

    public Player(String _name)
    {
        name = _name;
        inventory = new ArrayList<>();
        yen = 500;
    }

    public void addItem(Item i)
    {
        inventory.add(i);
    }

    public ArrayList<Item> getItems()
    {
        return inventory;
    }

    public Item consumeItem(int i)
    {
        Item it = inventory.get(i);
        inventory.remove(it);
        return it;
    }

    public void removeItem(Item i)
    {
        inventory.remove(i);
    }

    public int getYen()
    {
        return yen;
    }

    public void removeYen(int cost)
    {
        yen -= cost;
    }
}
