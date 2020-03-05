package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.food.Tomato;
import com.zipcodewilmington.froilansfarm.food.Food;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TomatoPlantTest 
{
    Crop testTomatoPlant;

    @Before
    public void setup()
    {
        testTomatoPlant = new TomatoPlant();
    }

    @Test
    public void canHarvestTest()
    {
        Boolean expected = false;

        Boolean actual = testTomatoPlant.canHarvest();

        assertEquals(expected, actual);
    }

    @Test
    public void canHarvestAfterFertilizing()
    {
        Boolean expected = true;

        testTomatoPlant.fertilize();
        Boolean actual = testTomatoPlant.canHarvest();

        assertEquals(expected, actual);
    }

    @Test
    public void yieldBeforeFertilizing()
    {
        Food expected = null;

        Food actual = testTomatoPlant.yield();

        assertEquals(expected, actual);
    }

    @Test
    public void yieldAfterFertilizing()
    {
        Food expected = new Tomato();

        testTomatoPlant.fertilize();
        Food actual = testTomatoPlant.yield();

        assertTrue(actual instanceof Food);
        assertTrue(actual instanceof Tomato);
    }

    @Test
    public void yieldAfterFertilizingTwice()
    {
        Food expected = new Tomato();
        Food secondExpected = null;

        testTomatoPlant.fertilize();
        Food actual = testTomatoPlant.yield();
        Food secondActual = testTomatoPlant.yield();

        assertTrue(actual instanceof Tomato);
        assertNotNull(secondActual);
    }
}