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
    Chicken chicken1 = new Chicken();
    Chicken chicken2 = new Chicken();
    Chicken chicken3 = new Chicken();
    Chicken chicken4 = new Chicken();
    Chicken chicken5 = new Chicken();

    @Before
    public void setup() {
        testChickenCoop = new ChickenCoop();
    }

    @Test
    public void addChickenTest() {
        List<Chicken> arrayList = new ArrayList<>();
        Assert.assertTrue(arrayList.add(chicken1));
    }

    @Test
    public void testArrayListAddAll() {
        List<Chicken> arrayList = new ArrayList<>();
        List<Chicken> arrayList1 = new ArrayList<>();
        arrayList1.add(chicken1);
        arrayList1.add(chicken2);
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
        arrayList.add(chicken1);
        arrayList.add(chicken2);
        arrayList.add(chicken3);
        arrayList.add(chicken4);
        arrayList.add(chicken5);

        Assert.assertEquals(5, arrayList.size());
    }

    @Test
    public void testArrayListAddIndex() {
        List<Chicken> arrayList = new ArrayList<>();
        arrayList.add(chicken1);
        arrayList.add(0, chicken1);
        Assert.assertEquals(chicken1,arrayList.get(0));
    }

    @Test
    public void testArrayListRemove() {
        List<Chicken> arrayList = new ArrayList<>();
        arrayList.add(chicken1);
        Assert.assertTrue(arrayList.remove(chicken1));
    }
}

