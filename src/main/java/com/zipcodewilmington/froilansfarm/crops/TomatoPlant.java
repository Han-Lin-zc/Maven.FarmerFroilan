package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.food.Food;
import com.zipcodewilmington.froilansfarm.food.Tomato;

public class TomatoPlant extends Crop {

    public Food yield() {

        if(hasBeenFertilized == true && hasBeenHarvested == false)
        {
            return new Tomato();
        }
        else
        {
            // TODO: We should never be passing around nulls
            return null;
        }
    }
}
