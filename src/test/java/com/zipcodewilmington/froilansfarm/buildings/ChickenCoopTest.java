package com.zipcodewilmington.froilansfarm.buildings;

import com.zipcodewilmington.froilansfarm.animals.Chicken;
import com.zipcodewilmington.froilansfarm.animals.Horse;
import com.zipcodewilmington.froilansfarm.people.Pilot;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ChickenCoopTest {
    ChickenCoop testChickenCoop = new ChickenCoop();



    @Before
    public void setup() {
        testChickenCoop = new ChickenCoop();
    }

    @Test
    public void addChickenTest() {
        Chicken chicken = new Chicken();
    }

    @Test
     public void testArrayList() {
        Chicken chicken = new Chicken();
        List<Chicken> arrayList = new ArrayList<>();
        Assert.assertTrue(arrayList.add(chicken));
    }
    }
