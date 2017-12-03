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
    int resourceID;

    public Item(String _name)
    {
        name = _name;
        resourceID = R.mipmap.missing_texture;
        properties = new ArrayList<>();
        effects = new ArrayList<>();
        effectAmounts = new ArrayList<>();
    }

    public Item(String _name, int id)
    {
        name = _name;
        resourceID = id;
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

    public ArrayList<Property> getProperties()
    {
        return properties;
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

    public String getName()
    {
        return name;
    }
}
