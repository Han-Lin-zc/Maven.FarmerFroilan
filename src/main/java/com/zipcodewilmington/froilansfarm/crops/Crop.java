package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.food.Food;
import com.zipcodewilmington.froilansfarm.interfaces.Produce;

public class Crop implements Produce
{
    Boolean hasBeenHarvested;
    Boolean hasBeenFertilized;

    public Crop()
    {
        hasBeenFertilized = false;
        hasBeenHarvested = false;
    }

    public Boolean fertilize()
    {
        hasBeenFertilized = true;

        return hasBeenFertilized;
    }

    public Boolean canHarvest()
    {
        if(hasBeenHarvested == false && hasBeenFertilized == true)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public Food yield() {
        if(hasBeenFertilized == true && hasBeenHarvested == false)
        {
            return new Food();
        }
        else
        {
            return null;
        }
    }
}
