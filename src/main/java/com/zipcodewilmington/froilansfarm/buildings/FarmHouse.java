package com.zipcodewilmington.froilansfarm.buildings;

import com.zipcodewilmington.froilansfarm.people.Farmer;
import com.zipcodewilmington.froilansfarm.people.Person;
import com.zipcodewilmington.froilansfarm.people.Pilot;

import java.util.ArrayList;
import java.util.List;

public class FarmHouse {
    private List<Person> persons;
    private static FarmHouse FARMHOUSE = new FarmHouse();
    ;

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

    public void FarmHouse1(){
        persons = new ArrayList<Person>();
        persons.add(new Farmer("Froilan"));
        persons.add(new Pilot("Frolinda"));
    }

    public void addPerson1(Person person){
        persons.add(person);
    }

    public Integer getCount(){
        return persons.size();
    }

    public ArrayList<Person> getList(){
        return (ArrayList<Person>) persons;
    }

    public static FarmHouse getInstance(){
        return FARMHOUSE;
    }
}