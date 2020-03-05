package com.zipcodewilmington.froilansfarm.buildings;

import com.zipcodewilmington.froilansfarm.animals.Chicken;

import java.util.ArrayList;
import java.util.List;

public class ChickenCoop  {

        private List<Chicken> chickens = new ArrayList<Chicken>();

    public ChickenCoop() {
        this.chickens = new ArrayList<>();

    }

    public ChickenCoop(List<Chicken> chickens) {
        this.chickens = chickens;
    }

    public List<Chicken> getChickens() {
        return chickens;
    }

    public Boolean addChicken(int addedChicken) {
        if (chickens.contains(addedChicken)) {
            return true;
        } else {
            return false;
        }
    }

    public void addChicken(Chicken chicken) {
        this.chickens.add(chicken);
    }

    public void removeChicken(Chicken chicken) {
        this.chickens.remove(chicken);
    }

    public Integer chickenCount() {
        return chickens.size();
    }

    public Chicken getChicken(Integer index) {
        return chickens.get(index);
    }

    public boolean remove(Chicken chicken) {
        return chickens.remove(chickens);
    }
}

