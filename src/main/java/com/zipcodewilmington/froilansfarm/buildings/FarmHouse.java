package com.zipcodewilmington.froilansfarm.buildings;

import com.zipcodewilmington.froilansfarm.people.Person;

import java.util.ArrayList;
import java.util.List;

public class FarmHouse {
    private List<Person> persons;

    public FarmHouse(){
        this.persons = new ArrayList<>();
}

    public FarmHouse(List<Person> persons) {
        this.persons = persons;
    }

    public List<Person> getPersons() {
        return persons;
    }

    public Boolean addPerson(Person addedPerson) {
        if (persons.contains(addedPerson)) {
            return true;
        } else {
            return false;
        }
    }
}