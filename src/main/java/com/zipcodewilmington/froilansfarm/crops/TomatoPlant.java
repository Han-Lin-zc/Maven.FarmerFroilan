package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.food.Food;
import com.zipcodewilmington.froilansfarm.food.Tomato;

public class TomatoPlant extends Crop
{
    @Override
    public Food yield() {

        if(hasBeenFertilized == true && hasBeenHarvested == false)
        {
            return new Tomato();
        }
        else
        {
            return null;
        }
    }
}
