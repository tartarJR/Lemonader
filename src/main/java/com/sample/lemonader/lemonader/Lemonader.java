package com.sample.lemonader.lemonader;

import com.sample.lemonader.cooler.WaterCooler;
import com.sample.lemonader.ingredient.Lemon;
import com.sample.lemonader.ingredient.Sugar;
import com.sample.lemonader.ingredient.Water;

public class Lemonader {

    private WaterCooler waterCooler;

    public Lemonader(WaterCooler waterCooler) {
        this.waterCooler = waterCooler;
    }

    public void makeLemonade(Water water, Lemon lemon, Sugar sugar) {
        waterCooler.coolItUpTheWater(water);
        System.out.println("Lemonade has been made with " + water.getAmount() + " liters of water, " + sugar.getAmount() + " kilograms of sugar and " + lemon.getQuantity() + " lemons.");
    }
}
