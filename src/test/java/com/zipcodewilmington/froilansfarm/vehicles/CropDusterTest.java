package com.zipcodewilmington.froilansfarm.vehicles;

import com.zipcodewilmington.froilansfarm.people.Pilot;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CropDusterTest {

    @Test
    public void flyTest() {
        CropDuster cropDuster = new CropDuster();

        Assert.assertTrue(cropDuster.fly());
    }

    @Test
    public void flyTest2() {
        CropDuster cropDuster = new CropDuster();

        cropDuster.fly();

        Assert.assertFalse(cropDuster.fly());
    }


    @Test
    public void landTest() {
        CropDuster cropDuster = new CropDuster();
        cropDuster.fly();
        Assert.assertTrue(cropDuster.land());
    }

    @Test
    public void landTest2() {
        CropDuster cropDuster = new CropDuster();
        Assert.assertFalse(cropDuster.land());
    }

    @Test
    public void makeNoise() {
        CropDuster cropDuster = new CropDuster();
        String expected = "Zoom!";
        Assert.assertEquals(expected, cropDuster.makeNoise());
    }
}