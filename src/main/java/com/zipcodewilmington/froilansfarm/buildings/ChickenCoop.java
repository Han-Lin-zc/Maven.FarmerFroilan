package com.zipcodewilmington.froilansfarm.buildings;

import com.zipcodewilmington.froilansfarm.animals.Chicken;

import java.util.List;

public class ChickenCoop {
    private List<Chicken> chickens;

    public ChickenCoop() {

    }

    public ChickenCoop(List<Chicken> chickens) {
        this.chickens = chickens;
    }

    public List<Chicken> getChickens() {
        return chickens;
    }

    public void setChickens(List<Chicken> chickens) {
        this.chickens = chickens;
    }
}
