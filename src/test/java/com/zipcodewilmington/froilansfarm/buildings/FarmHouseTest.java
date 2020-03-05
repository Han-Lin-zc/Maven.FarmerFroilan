package com.zipcodewilmington.froilansfarm.buildings;

import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.animals.Chicken;
import com.zipcodewilmington.froilansfarm.people.Farmer;
import com.zipcodewilmington.froilansfarm.people.Person;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class FarmHouseTest {
    private FarmHouse testFarmHouse;
    String FARMHOUSE;
    Person farmer;
    Person pilot;

    public FarmHouseTest() {
        FarmHouse testFarmHouse = new FarmHouse();
        FarmHouse testFarmHouse1;
    }

    @Before
    public void setup() {
        testFarmHouse = new FarmHouse();
        farmer = new Person("Froilan");
        pilot = new Person("Frolinda");
    }

    @Test
    public void personCountTest() {
        List<Person> arrayList = new ArrayList<>();
        arrayList.add(farmer);
        arrayList.add(pilot);

        Assert.assertEquals(2, arrayList.size());
    }

    @Test
    public void FarmHouseConstructorTest() {
        List<Person> expected = new ArrayList<>();
        expected.add(farmer);
        FarmHouse testedFilled = new FarmHouse((expected));
        List<Person> actual = testedFilled.getPersons();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getPersons() {
        //Given


    }

    @Test
    public void addPerson1() {
        List<Person> arrayList = new ArrayList<>();


    }

    @Test
    public void FarmHouseTest1() {
        List<Person> list = new ArrayList<>();
        List<Person> expected = new ArrayList<>();
        expected.add(pilot);
        FarmHouse testedFilled = new FarmHouse((expected));
        List<Person> actual = testedFilled.getPersons();
        Assert.assertEquals(expected, actual);

        }

    @Test
    public void addPerson2() {
        List<Person> arrayList = new ArrayList<>();
        Assert.assertTrue(arrayList.add(pilot));
    }

    @Test
    public void getList() {

    }

    @Test
    public void getInstance() {
        testFarmHouse = new FarmHouse();
        FarmHouse expected = FarmHouse.getInstance();
        FarmHouse actual = FarmHouse.getInstance();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void removePersonTest() {
        Person person1 = new Person("");
        Person actual = person1;
        Integer actualSize = 0;
        testFarmHouse.addPerson1(person1);
        testFarmHouse.removePerson(person1);

        Integer expectedSize = testFarmHouse.personCount();
        Assert.assertEquals(expectedSize, actualSize);
    }
}