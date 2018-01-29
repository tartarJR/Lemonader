package com.sample.lemonader.cooler;

import com.sample.lemonader.ingredient.Water;

public class WaterCooler {

    private Water water;

    // TODO constructor injection needed
    public WaterCooler(Water water) {
        this.water = water;
    }

    public void coolItUpTheWater() {
        if (!water.isCold()) {
            System.out.println("Water has been cooled up!");
        } else {
            System.out.println("Water is already cold!");
        }
    }
}
