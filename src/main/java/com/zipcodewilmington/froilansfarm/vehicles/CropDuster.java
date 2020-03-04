package com.zipcodewilmington.froilansfarm.vehicles;


import com.zipcodewilmington.froilansfarm.crops.CropRow;
import com.zipcodewilmington.froilansfarm.people.Pilot;


public class CropDuster extends FarmVehicle implements AirCraft {

    private boolean isFlying = false;
    Pilot pilot = new Pilot("Froilanda");


    public Boolean fly() {
        if (isFlying == false && pilot.unmount() == false) {
            this.isFlying = true;
            return true;
        }
        return false;
    }

    public Boolean land() {
        if (isFlying == true) {
            this.isFlying = false;
            return true;
        }
        return false;
    }

    public boolean isFertilized(CropRow cropRow) {
        if (isFlying == true) {
            return true;
        }
        return false;
    }

    public String makeNoise()
    {
        return "Zoom!";
    }
}