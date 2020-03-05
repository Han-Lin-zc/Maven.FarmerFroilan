package com.zipcodewilmington.froilansfarm.animals;

public class Horse extends Animal
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