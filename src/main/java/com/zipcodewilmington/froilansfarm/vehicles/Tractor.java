package com.zipcodewilmington.froilansfarm.vehicles;

import com.zipcodewilmington.froilansfarm.crops.Crop;
import com.zipcodewilmington.froilansfarm.food.Food;

public class Tractor extends FarmVehicle {

    public Crop harvest() {
        int index = 0;
        Crop crop = new Crop();
        if (crop.yield().equals(new Food())){
            return crop;
        }
        return null;
    }

    public String makeNoise()
    {
        return "Sputter putter putter";
    }
}
