package com.zipcodewilmington.froilansfarm.vehicles;

public abstract class FarmVehicle extends Vehicle
{
    public boolean isOnFarm = true;

    public void leaveFarm() {
        this.isOnFarm = false;
    }

    public void returnToFarm() {
        this.isOnFarm = true;
    }

    public boolean operate() {
        return true;
    }
}
