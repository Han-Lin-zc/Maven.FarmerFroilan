package com.zipcodewilmington.froilansfarm.buildings;

import com.zipcodewilmington.froilansfarm.animals.Horse;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class StableTest {
    Stable testStable;

    @Before
    public void setup() {
        testStable = new Stable();
    }

    @Test
    public void addHorseTest(){
        Horse horse1= new Horse();
        Horse actual = horse1;
        testStable.addHorse(horse1);
        Horse expected = testStable.getHorse(0);
        Assert.assertEquals(expected,actual);

    }
    @Test
    public void removeHorseTest(){
        Horse horse1= new Horse();
        Horse actual=horse1;
        Integer actualSize =0;
        testStable.addHorse(horse1);
        testStable.removeHorse(horse1);

        Integer expectedSize= testStable.horseCount();

        Assert.assertEquals(expectedSize,actualSize);

    }
}