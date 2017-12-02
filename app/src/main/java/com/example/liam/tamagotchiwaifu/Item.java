package com.example.liam.tamagotchiwaifu;

import java.util.ArrayList;

/**
 * Created by liam on 12/2/17.
 */


public class Item
{
    String name;
    ArrayList<Property> properties;
    ArrayList<Stat> effects;
    ArrayList<Float> effectAmounts;

    public Item(String _name)
    {
        name = name;
        properties = new ArrayList<>();
        effects = new ArrayList<>();
        effectAmounts = new ArrayList<>();
    }

    public void addEffect(Stat stat, Float amount)
    {
        effects.add(stat);
        effectAmounts.add(amount);
    }

    public void addProperty(Property p)
    {
        properties.add(p);
    }

    public Boolean hasProperty(Property p)
    {
        return properties.contains(p);
    }

    public Float getEffect(Stat stat)
    {
        if(effects.contains(stat))
        {
            return effectAmounts.get(effects.indexOf(stat));
        }
        else
        {
            return 0f;
        }
    }

}
