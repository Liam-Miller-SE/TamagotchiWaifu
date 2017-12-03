package com.example.liam.tamagotchiwaifu;

import java.util.ArrayList;

/**
 * Created by liam on 12/2/17.
 */

public class Pet
{
    String name;
    float love;
    float food;
    float happiness;
    float confidence;
    float health;

    ArrayList<Property> likes;
    ArrayList<Property> dislikes;

    public Pet(String _name)
    {
        name = _name;
        love = 0;
        food = 0;
        happiness = 0;
        confidence = 0;
        health = 0;
        likes = new ArrayList<>();
        dislikes = new ArrayList<>();
    }

    public float getLove()
    {
        return love;
    }

    public float getFood()
    {
        return food;
    }

    public float getHappiness()
    {
        return happiness;
    }

    public float getConfidence()
    {
        return confidence;
    }

    public float getHealth()
    {
        return health;
    }

    public void useItem(Item i)
    {
        health += i.getEffect(Stat.HEALTH);
        happiness += i.getEffect(Stat.HAPPINESS);
        food += i.getEffect(Stat.HUNGER);
        confidence += i.getEffect(Stat.CONFIDENCE);
        for (Property p : i.getProperties())
        {
            if(likes.contains(p))
            {
                love++;
            }
            if(dislikes.contains(p))
            {
                love--;
            }
        }
    }

    public void addLike(Property p)
    {
        likes.add(p);
    }
}
