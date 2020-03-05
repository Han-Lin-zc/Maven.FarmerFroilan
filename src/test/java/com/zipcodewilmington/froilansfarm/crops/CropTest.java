package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.food.Food;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CropTest
{
    Crop testCrop;

    @Before
    public void setup()
    {
        testCrop = new Crop();
    }

    @Test
    public void canHarvestTest()
    {
        Boolean expected = false;

        Boolean actual = testCrop.canHarvest();

        assertEquals(expected, actual);
    }

    @Test
    public void canHarvestAfterFertilizing()
    {
        Boolean expected = true;

        testCrop.fertilize();
        Boolean actual = testCrop.canHarvest();

        assertEquals(expected, actual);
    }

    @Test
    public void yieldBeforeFertilizing()
    {
        Food expected = null;

        Food actual = testCrop.yield();

        assertEquals(expected, actual);
    }

    @Test
    public void yieldAfterFertilizing()
    {
        Food expected = new Food();

        testCrop.fertilize();
        Food actual = testCrop.yield();

        assertTrue(actual instanceof Food);
    }

    @Test
    public void yieldAfterFertilizingTwice()
    {
        Food expected = new Food();
        Food secondExpected = null;

        testCrop.fertilize();
        Food actual = testCrop.yield();
        Food secondActual = testCrop.yield();

        assertTrue(actual instanceof Food);
        assertNotNull(secondActual);
    }
}