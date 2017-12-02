package com.example.liam.tamagotchiwaifu;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by liam on 12/2/17.
 * The singleton Game class holds all the data and methods for running the game,
 * Game takes input from the frontend and interacts with the data structures to generate an output
 */

public class Game
{
    private static final Game ourInstance = new Game();
    private Pet pet;
    private Player player;
    private ArrayList<Item> storeInventory;
    private ArrayList<Integer> storePrices;

    public static Game getInstance()
    {
        return ourInstance;
    }

    private Game()
    {
        pet = new Pet("TEST");
        player = new Player("ANON");
        Item i = new Item("Candy Sticks");
        storeInventory = new ArrayList<>();
        storePrices = new ArrayList<>();

        i.addEffect(Stat.HUNGER, 2f);
        i.addEffect(Stat.HAPPINESS, 1f);
        i.addEffect(Stat.HEALTH, -0.5f);
        i.addProperty(Property.PINK);
        i.addProperty(Property.SWEET);
        player.addItem(i);

        storeInventory.add(i);
        storePrices.add(100);
    }

    public float getLove()
    {
        return pet.getLove();
    }

    public float getFood()
    {
        return pet.getFood();
    }

    public float getHappiness()
    {
        return pet.getHappiness();
    }

    public float getConfidence()
    {
        return pet.getConfidence();
    }

    public float getHealth()
    {
        return pet.getHealth();
    }

    public void useItem(Item i)
    {
        pet.useItem(i);
    }

    public ArrayList<Item> getInventory()
    {
        return player.getItems();
    }

    public void useItemFromInventory(Item i)
    {
        player.removeItem(i);
        pet.useItem(i);
    }

    public int getYen()
    {
        return player.getYen();
    }

    public ArrayList<Item> getStoreInventory()
    {
        return storeInventory;
    }

    public ArrayList<Integer> getStoreCosts()
    {
        return storePrices;
    }

    public void buyItem(Item i, int cost)
    {
        player.addItem(i);
        player.removeYen(cost);
    }
}
