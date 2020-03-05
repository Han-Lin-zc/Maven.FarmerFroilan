package com.zipcodewilmington.froilansfarm.buildings;

import com.zipcodewilmington.froilansfarm.animals.Chicken;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ChickenCoopTest {
    Chicken chicken1;
    Chicken chicken2;
    Chicken chicken3;
    Chicken chicken4;
    Chicken chicken5;
    private ChickenCoop testChickenCoop;


    public ChickenCoopTest() {
        ChickenCoop testChickenCoop = new ChickenCoop();
        ChickenCoop testChickenCoop1;
    }

    @Before
    public void setup() {
        testChickenCoop = new ChickenCoop();
        chicken1 = new Chicken();
        chicken2 = new Chicken();
        Chicken chicken3 = new Chicken();
        Chicken chicken4 = new Chicken();
        Chicken chicken5 = new Chicken();
    }

    @Test
    public void ChickenCoopTest(){
        Assert.assertNotNull(testChickenCoop);
    }

    @Test
    public void ChickenCoopConstructorTest() {
        List<Chicken> expected = new ArrayList<>();
        expected.add(chicken1);
        ChickenCoop testedFilled = new ChickenCoop(expected);
        List<Chicken> actual = testedFilled.getChickens();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void addChickenTest() {
        List<Chicken> arrayList = new ArrayList<>();
        Assert.assertTrue(arrayList.add(chicken1));
    }

    @Test
    public void testArrayListAddAll() {
        List<Chicken> expected = new ArrayList<>();
        expected.add(chicken1);
        testChickenCoop.addChicken(chicken1);
        List<Chicken> actual = testChickenCoop.getChickens();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testArrayList() {
        Chicken chicken = new Chicken();
        List<Chicken> arrayList = new ArrayList<>();
        Assert.assertTrue(arrayList.add(chicken));
    }

    @Test
    public void getChickenTest() {
        Chicken chicken = new Chicken();
        testChickenCoop.addChicken(new Chicken());
        testChickenCoop.addChicken(new Chicken());
        testChickenCoop.addChicken(chicken);

        Chicken actual = chicken;
        Chicken expected = testChickenCoop.getChicken(2);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testArrayListSize5() {
        List<Chicken> arrayList = new ArrayList<>();
        arrayList.add(chicken1);
        arrayList.add(chicken2);
        arrayList.add(chicken3);
        arrayList.add(chicken4);
        arrayList.add(chicken5);

        Assert.assertEquals(5, arrayList.size());
    }

    @Test
    public void testArrayListSize4() {
        List<Chicken> arrayList = new ArrayList<>();
        arrayList.add(chicken1);
        arrayList.add(chicken2);
        arrayList.add(chicken3);
        arrayList.add(chicken4);

        Assert.assertEquals(4, arrayList.size());
    }

    @Test
    public void testArrayListRemoveAll() {
        List<Chicken> arrayList1 = new ArrayList<>();
        List<Chicken> arrayList2 = new ArrayList<>();
        arrayList2.remove(chicken1);
        arrayList2.remove(chicken2);
        arrayList1.removeAll(arrayList2);
        Assert.assertEquals(arrayList1, arrayList2);
    }

    @Test
    public void testArrayListAddIndex() {
        List<Chicken> arrayList = new ArrayList<>();
        arrayList.add(chicken1);
        arrayList.add(0, chicken1);
        Assert.assertEquals(chicken1, arrayList.get(0));
    }

    @Test
    public void testArrayListRemove() {
        List<Chicken> arrayList = new ArrayList<>();
        arrayList.add(chicken1);
        Assert.assertTrue(arrayList.remove(chicken1));
    }

    @Test
    public void removeChickensTest() {
        testChickenCoop.addChicken(new Chicken());
        testChickenCoop.remove(testChickenCoop.getChicken(0));

        Integer actual = 1;
        Integer expected = testChickenCoop.chickenCount();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeChickenTest() {
        Chicken chicken1 = new Chicken();
        Chicken actual = chicken1;
        Integer actualSize = 1;
        testChickenCoop.addChicken(chicken1);
        testChickenCoop.remove(chicken1);

        Integer expectedSize = testChickenCoop.chickenCount();

        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void removeChickenTestMultiple() {
        testChickenCoop.addChicken(new Chicken());
        testChickenCoop.addChicken(new Chicken());
        testChickenCoop.addChicken(new Chicken());
        testChickenCoop.addChicken(new Chicken());

        testChickenCoop.removeChicken(testChickenCoop.getChicken(0));

        Integer actual = 3;
        Integer expected = testChickenCoop.chickenCount();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeChickenTestMultipleTest() {
        testChickenCoop.addChicken(new Chicken());
        testChickenCoop.addChicken(new Chicken());
        testChickenCoop.addChicken(new Chicken());
        testChickenCoop.addChicken(new Chicken());

        testChickenCoop.removeChicken(testChickenCoop.getChicken(0));

        Integer actual = 3;
        Integer expected = testChickenCoop.chickenCount();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void chickenCountTest() {
        testChickenCoop.addChicken(new Chicken());
        testChickenCoop.addChicken(new Chicken());
        testChickenCoop.addChicken(new Chicken());
        testChickenCoop.addChicken(new Chicken());

        Integer actual = 4;
        Integer expected = testChickenCoop.chickenCount();

        Assert.assertEquals(expected, actual);
    
    }
}