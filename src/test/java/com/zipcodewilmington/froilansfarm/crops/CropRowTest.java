package com.zipcodewilmington.froilansfarm.crops;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CropRowTest {
    private CropRow<CornStalk> testCornRow;
    private CropRow<TomatoPlant> testTomatoRow;
    private CropRow<Crop> testGenericCrop;

    @Before
    public void setup()
    {
        testCornRow = new CropRow<>();
        testTomatoRow = new CropRow<>();
        testGenericCrop = new CropRow<>();
    }

    @Test
    public void addTomatoTest()
    {
        testTomatoRow.plantInRow(new TomatoPlant());

        Integer expected = 1;
        Integer actual = 0;
        for(Crop plant : testTomatoRow)
        {
            actual++;
        }

        assertEquals(expected, actual);
    }
}
