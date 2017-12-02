package com.example.liam.tamagotchiwaifu;

/**
 * Created by liam on 12/2/17.
 * The singleton Game class holds all the data and methods for running the game,
 * Game takes input from the frontend and interacts with the data structures to generate an output
 */

public class Game
{
    private static final Game ourInstance = new Game();
    private Pet pet;

    public static Game getInstance()
    {
        return ourInstance;
    }

    private Game()
    {
        pet = new Pet("TEST");
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
}
