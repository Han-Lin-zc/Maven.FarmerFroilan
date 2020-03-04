package com.zipcodewilmington.froilansfarm.vehicles;


public class CropDuster extends FarmVehicle implements AirCraft {

    public Boolean fly()
    {
        return true;
    }

    public String makeNoise()
    {
        return "Zoom!";
    }
}