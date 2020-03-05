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
    Chicken chicken = new Chicken();
    Chicken chicken1 = new Chicken();

    @Before
    public void setup() {
        testChickenCoop = new ChickenCoop();
    }

    @Test
    public void addChickenTest() {
        List<Chicken> arrayList = new ArrayList<>();
        Assert.assertTrue(arrayList.add(chicken));
    }

    @Test
    public void testArrayListAddAll() {
        List<Chicken> arrayList = new ArrayList<>();
        List<Chicken> arrayList1 = new ArrayList<>();
        arrayList1.add(chicken);
        arrayList1.add(chicken1);
        arrayList.addAll(arrayList1);
        Assert.assertEquals(arrayList, arrayList1);
    }

    @Test
    public void testArrayList() {
        Chicken chicken = new Chicken();
        List<Chicken> arrayList = new ArrayList<>();
        Assert.assertTrue(arrayList.add(chicken));
    }

    @Test
    public void testArrayListSize() {
        List<Chicken> arrayList = new ArrayList<>();
        arrayList.add(chicken);
    }
}

