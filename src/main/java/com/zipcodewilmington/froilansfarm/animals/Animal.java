package com.zipcodewilmington.froilansfarm.animals;

import com.zipcodewilmington.froilansfarm.interfaces.NoiseMaker;

public abstract class Animal implements NoiseMaker {
    private String name;

    public Animal(String inputName)
    {
        this.name = inputName;
    }
}