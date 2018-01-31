package com.sample.lemonader.lemonader;

import com.sample.lemonader.cooler.WaterCooler;
import com.sample.lemonader.ingredient.Lemon;
import com.sample.lemonader.ingredient.Sugar;
import com.sample.lemonader.ingredient.Water;

import javax.inject.Inject;

public class Lemonader {
    private Water water;
    private Lemon lemon;
    private Sugar sugar;

    private WaterCooler waterCooler;

    public Lemonader(Water water, Lemon lemon, Sugar sugar) {
        this.water = water;
        this.lemon = lemon;
        this.sugar = sugar;
        this.waterCooler = new WaterCooler(water); // TODO remove hard dependency via Dagger 2
    }

    public void makeLemonade() {
        System.out.println("Making lemonade..");
        waterCooler.coolItUpTheWater();
        System.out.println("Lemonade has been made with " + water.getAmount() + " liters of water, " + sugar.getAmount() + " kilograms of sugar and " + lemon.getQuantity() + " lemons.");
    }
}
