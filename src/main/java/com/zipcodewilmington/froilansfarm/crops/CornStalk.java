package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.food.Corn;
import com.zipcodewilmington.froilansfarm.food.Food;
import com.zipcodewilmington.froilansfarm.food.Tomato;

public class CornStalk extends Crop
{
    @Override
    public Food yield() {
        if(hasBeenFertilized == true && hasBeenHarvested == false)
        {
            return new Corn();
        }
        else
        {
            // TODO: We should never be passing around nulls
            return null;
        }
    }
}
