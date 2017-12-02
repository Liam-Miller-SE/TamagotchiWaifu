package com.example.liam.tamagotchiwaifu;

/**
 * Created by liam on 12/2/17.
 * The singleton Game class holds all the data and methods for running the game,
 * Game takes input from the frontend and interacts with the data structures to generate an output
 */

public class Game
{
    private static final Game ourInstance = new Game();

    public static Game getInstance()
    {
        return ourInstance;
    }

    private Game()
    {
    }

    //TODO: implement
    public float getLove()
    {
        return 0;
    }

    //TODO: implement
    public float getFood()
    {
        return 3.6f;
    }

    //TODO: implement
    public float getHappiness()
    {
        return 0;
    }

    //TODO: implement
    public float getConfidence()
    {
        return 0;
    }

    //TODO: implement
    public float getHealth()
    {
        return 0;
    }
}
