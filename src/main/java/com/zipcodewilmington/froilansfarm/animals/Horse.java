package com.zipcodewilmington.froilansfarm.animals;

import com.zipcodewilmington.froilansfarm.interfaces.Rideable;

public class Horse extends Animal implements Rideable
{
    public Horse(String inputName)
    {
        super(inputName);
    }

    public Horse()
    {
        this("");
    }

    @Override
    public String makeNoise() {
        return "Neigh!";
    }

}