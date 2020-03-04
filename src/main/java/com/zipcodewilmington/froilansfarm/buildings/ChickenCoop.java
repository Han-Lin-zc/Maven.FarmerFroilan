package com.zipcodewilmington.froilansfarm.buildings;

import com.zipcodewilmington.froilansfarm.animals.Chicken;

import java.util.ArrayList;
import java.util.List;

public class ChickenCoop {
    private List<Chicken> chickens;

    public ChickenCoop() {
        this.chickens = new ArrayList<>();

    }

    public ChickenCoop(List<Chicken> chickens) {
        this.chickens = chickens;
    }

    public List<Chicken> getChickens() {
        return chickens;
    }

    public Boolean addChicken(Chicken addedChicken) {
        if (chickens.contains(addedChicken)) {
            return true;
        } else {
            return false;
        }
    }
}
