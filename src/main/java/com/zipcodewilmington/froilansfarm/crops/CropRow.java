package com.zipcodewilmington.froilansfarm.crops;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CropRow<CropType extends Crop> implements Iterable<CropType>
{
    private List<CropType> plants;

    public CropRow(List<CropType> startingCrops)
    {
        plants = new ArrayList<>();
        plants.addAll(startingCrops);
    }

    public CropRow()
    {
        this(new ArrayList<CropType>());
    }

    public Boolean plantInRow(CropType addedPlant)
    {
        plants.add(addedPlant);

        return plants.contains(addedPlant);
    }

    @Override
    public Iterator<CropType> iterator() {
        return plants.iterator();
    }
}