package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.food.Corn;
import com.zipcodewilmington.froilansfarm.food.Food;

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
            return null;
        }
    }
}
