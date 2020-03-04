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
    public Boolean addHorse(Horse addedHorse){
        if(horses.contains(addedHorse)) {
            return true;
        }else {
            return false;
        }
    }
}


