package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.food.Corn;
import com.zipcodewilmington.froilansfarm.food.Food;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CornStalkTest
{
    Crop testCornStalk;

    @Before
    public void setup()
    {
        testCornStalk = new CornStalk();
    }

    @Test
    public void canHarvestTest()
    {
        Boolean expected = false;

        Boolean actual = testCornStalk.canHarvest();

        assertEquals(expected, actual);
    }

    @Test
    public void canHarvestAfterFertilizing()
    {
        Boolean expected = true;

        testCornStalk.fertilize();
        Boolean actual = testCornStalk.canHarvest();

        assertEquals(expected, actual);
    }

    @Test
    public void yieldBeforeFertilizing()
    {
        Food expected = null;

        Food actual = testCornStalk.yield();

        assertEquals(expected, actual);
    }

    @Test
    public void yieldAfterFertilizing()
    {
        Food expected = new Corn();

        testCornStalk.fertilize();
        Food actual = testCornStalk.yield();

        assertTrue(actual instanceof Food);
        assertTrue(actual instanceof Corn);
    }

    @Test
    public void yieldAfterFertilizingTwice()
    {
        Food expected = new Food();
        Food secondExpected = null;

        testCornStalk.fertilize();
        Food actual = testCornStalk.yield();
        Food secondActual = testCornStalk.yield();

        assertTrue(actual instanceof Corn);
        assertNotNull(secondActual);
    }
}