package com.zipcodewilmington.froilansfarm.crops;


import com.zipcodewilmington.froilansfarm.food.Food;

import java.util.HashMap;
import java.util.Map;

public class CropRow {

    Map<Crop, Food> cropStorage;

    public CropRow() {
        this.cropStorage = new HashMap<>();
    }


    public Map<Crop, Food> storage() {

        Crop crop = new Crop();
        if (crop.yield().equals(new Food())) {
            cropStorage.put(crop,crop.yield());
        }
        return null;
    }
}
