package com.zipcodewilmington.froilansfarm.buildings;

import com.zipcodewilmington.froilansfarm.animals.Chicken;
import com.zipcodewilmington.froilansfarm.people.Farmer;
import com.zipcodewilmington.froilansfarm.people.Person;
import com.zipcodewilmington.froilansfarm.people.Pilot;

import java.util.ArrayList;
import java.util.List;

public class FarmHouse {
    private List<Person> persons = new ArrayList<>();
    private static FarmHouse FarmHOUSE = new FarmHouse();

    public FarmHouse() {
        this.persons = new ArrayList<>();
    }

    public FarmHouse(List<Person> persons) {
        this.persons = persons;
    }

    public List<Person> getPersons() {
        return persons;
    }

    public void addPerson1(Person person) {
        persons.add(person);
    }

    public Integer personCount() {
        return persons.size();
    }

    public static FarmHouse getInstance() {
        return FarmHOUSE;
    }

    public void removePerson(Person person) {
        this.persons.remove(person);
    }

    public boolean removePerson1(Person person) {
        return persons.remove(persons);
    }
}
