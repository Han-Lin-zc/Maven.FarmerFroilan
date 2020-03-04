package com.zipcodewilmington.froilansfarm.people;

import com.zipcodewilmington.froilansfarm.food.Food;
import com.zipcodewilmington.froilansfarm.interfaces.Eater;
import com.zipcodewilmington.froilansfarm.interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.interfaces.Rider;

public abstract class Person implements NoiseMaker, Eater, Rider
{
    String name;

    public Person(String startingName)
    {
        name = startingName;
    }

    @Override
    public Boolean eat(Food meal) {
        if(meal instanceof Food)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String makeNoise()
    {
        // TODO: Feel free to override
        return "G'day to you!";
    }

    public Boolean mount(Rideable mount)
    {
        return null;
    }

    public Boolean unmount()
    {
        return null;
    }
}
