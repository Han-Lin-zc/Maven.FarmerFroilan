package com.zipcodewilmington.froilansfarm.vehicles;

import com.zipcodewilmington.froilansfarm.crops.Crop;


public class Tractor extends FarmVehicle {

    private boolean canHarvest = false;


    public Crop harvest() {
        if (isOnFarm == true) {
            this.canHarvest = true;
        }
        return null;
    }

    public String makeNoise()
    {
        return "Sputter putter putter";
    }
}
