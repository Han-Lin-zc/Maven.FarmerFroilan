package com.zipcodewilmington.froilansfarm.vehicles;


public class CropDuster extends FarmVehicle implements AirCraft {

    private boolean isFlying = false;

    public Boolean fly() {
        if (!isFlying) {
            this.isFlying = true;
            return true;
        }
        return false;
    }

    public Boolean land() {
        if (isFlying) {
            this.isFlying = false;
            return true;
        }
        return false;
    }

    public String makeNoise()
    {
        return "Zoom!";
    }
}