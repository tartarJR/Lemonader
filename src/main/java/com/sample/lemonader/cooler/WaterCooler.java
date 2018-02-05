package com.sample.lemonader.cooler;

import com.sample.lemonader.ingredient.Water;

import javax.inject.Inject;

public class WaterCooler {

    @Inject // use inject annotation or a module with provider method (module must be added to AppComponent)
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
