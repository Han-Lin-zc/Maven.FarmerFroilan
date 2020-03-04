package com.zipcodewilmington.froilansfarm.vehicles;

import com.zipcodewilmington.froilansfarm.people.Pilot;
import org.junit.Assert;
import org.junit.Test;


public class CropDusterTest {

    @Test
    public void flyTest() {
        CropDuster cropDuster = new CropDuster();
        Pilot pilot = new Pilot("Zeth");
        pilot.mount(cropDuster);
        Assert.assertTrue(cropDuster.fly());
    }

    @Test
    public void flyTest2() {
        CropDuster cropDuster = new CropDuster();
        Pilot pilot = new Pilot("Zeth");
        pilot.mount(cropDuster);
        cropDuster.fly();
        Assert.assertFalse(cropDuster.fly());
    }


    @Test
    public void landTest() {
        CropDuster cropDuster = new CropDuster();
        Pilot pilot = new Pilot("Zeth");
        pilot.mount(cropDuster);
        cropDuster.fly();
        Assert.assertTrue(cropDuster.land());
    }


    @Test
    public void landTest2() {
        CropDuster cropDuster = new CropDuster();
        Pilot pilot = new Pilot("Zeth");
        pilot.mount(cropDuster);
        Assert.assertFalse(cropDuster.land());
    }


    @Test
    public void makeNoise() {
        CropDuster cropDuster = new CropDuster();
        String expected = "Zoom!";
        Assert.assertEquals(expected, cropDuster.makeNoise());
    }
}