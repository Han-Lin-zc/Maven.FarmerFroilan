package com.zipcodewilmington.froilansfarm.people;

public class Pilot extends Person
{
    public Pilot(String initName)
    {
        super(initName);
    }

    @Override
    public String makeNoise() {
        return name + " says \"I'll be your wingman any day.\"";
    }
}
