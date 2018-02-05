package com.sample.lemonader.cooler;

import com.sample.lemonader.ingredient.Water;

import javax.inject.Inject;

public class WaterCooler {

    @Inject
    public WaterCooler() {
    }

    public void coolItUpTheWater(Water water) {
        if (!water.isCold()) {
            System.out.println("Water has been cooled up!");
        } else {
            System.out.println("Water is already cold!");
        }
    }
}
