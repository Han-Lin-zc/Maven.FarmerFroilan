package com.zipcodewilmington.froilansfarm.vehicles;

import com.zipcodewilmington.froilansfarm.interfaces.Rideable;


public class CropDuster extends FarmVehicle implements Rideable, AirCraft {
    public Boolean fly()
    {
        return false;
    }
}