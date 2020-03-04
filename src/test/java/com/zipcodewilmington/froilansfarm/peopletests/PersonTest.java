package com.zipcodewilmington.froilansfarm.peopletests;

import com.zipcodewilmington.froilansfarm.animals.Horse;
import com.zipcodewilmington.froilansfarm.people.Pilot;
import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

    @Test
    public void isMountedTest(){
        Horse horse = new Horse();
        String name = "Zeth";
        Pilot pilot = new Pilot(name);

        Assert.assertTrue(pilot.mount(horse));

    }

    @Test
    public void isMountedTest2(){
        Horse horse = new Horse();
        String name = "Zeth";
        Pilot pilot = new Pilot(name);
        pilot.mount(horse);

        Assert.assertFalse(pilot.mount(horse));

    }

    @Test
    public void unMountTest(){
        Horse horse = new Horse();
        String name = "Zeth";
        Pilot pilot = new Pilot(name);
        pilot.mount(horse);

        Assert.assertTrue(pilot.unmount());

    }

    @Test
    public void unMountTest2(){
        Horse horse = new Horse();
        String name = "Zeth";
        Pilot pilot = new Pilot(name);

        Assert.assertFalse(pilot.unmount());

    }

}
