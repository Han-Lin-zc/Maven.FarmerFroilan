package com.zipcodewilmington.froilansfarm.buildings;

import com.zipcodewilmington.froilansfarm.animals.Horse;

import java.util.ArrayList;
import java.util.List;

public class Stable{
    private List<Horse>horses;

    public Stable(){
        this.horses = new ArrayList<>();
    }

    public Stable(List<Horse>horses){
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public void addHorse(Horse addHorse1){

        this.horses.add(addHorse1);
    }

    public void removeHorse(Horse horse) {
        this.horses.remove(horse);
    }

    public Integer horseCount() {
        return horses.size();
    }

    public Horse getHorse(Integer i) {
        return horses.get(i);
    }

}


