package com.zipcodewilmington.froilansfarm.animals;

import com.zipcodewilmington.froilansfarm.food.Egg;
import com.zipcodewilmington.froilansfarm.interfaces.Produce;

public class Chicken extends Animal implements Produce
{
    Boolean isFertilized;

    public Chicken(String chickenName)
    {
        super(chickenName);
        isFertilized = false;
    }

    public Chicken()
    {
        this("");
    }

    public Egg yield()
    {
        if(isFertilized == false) {
            return new Egg();
        }
        else
        {
            // TODO: I really hate this.
            return null;
        }
    }

    public Boolean getIsFertilized()
    {
        return isFertilized;
    }

    private void fertilize()
    {
        isFertilized = true;
    }
}