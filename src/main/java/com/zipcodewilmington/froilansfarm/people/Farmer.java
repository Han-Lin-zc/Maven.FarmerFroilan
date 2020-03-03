package com.zipcodewilmington.froilansfarm.people;

import com.sun.org.apache.xpath.internal.operations.Bool;
import com.zipcodewilmington.froilansfarm.crops.Crop;
import com.zipcodewilmington.froilansfarm.crops.CropRow;
import com.zipcodewilmington.froilansfarm.food.Food;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;

public class Farmer extends Person implements Botanist
{
    public Farmer(String initName)
    {
        super(initName);
    }

    @Override
    public String makeNoise() {
        return "Angry farmer noises.";
    }

    @Override
    public Boolean plant(Crop newBush, CropRow targetCropRow) {
        return null;
    }
}
