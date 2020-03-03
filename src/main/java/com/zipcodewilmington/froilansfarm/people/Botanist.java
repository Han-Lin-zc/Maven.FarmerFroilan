package com.zipcodewilmington.froilansfarm.people;

import com.zipcodewilmington.froilansfarm.crops.Crop;
import com.zipcodewilmington.froilansfarm.crops.CropRow;

public interface Botanist {
    Boolean plant(Crop newBush, CropRow targetCropRow);
}
