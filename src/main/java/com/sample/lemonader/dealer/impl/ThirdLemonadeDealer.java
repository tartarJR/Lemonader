package com.sample.lemonader.dealer.impl;

import com.sample.lemonader.dealer.Dealer;
import com.sample.lemonader.ingredient.Lemon;
import com.sample.lemonader.ingredient.Sugar;
import com.sample.lemonader.ingredient.Water;
import com.sample.lemonader.lemonader.Lemonader;

import javax.inject.Inject;

public class ThirdLemonadeDealer implements Dealer {

    private static final String CLASS_NAME = ThirdLemonadeDealer.class.getSimpleName();

    // field injection of Lemonader via Dagger 2
    @Inject
    public Lemonader lemonader;

    public ThirdLemonadeDealer() {

    }

    //@Inject
    //public ThirdLemonadeDealer(Lemonader lemonader) {
    //this.lemonader = lemonader;
    //}

    @Override
    public void runLemonader(Water water, Lemon lemon, Sugar sugar) {
        System.out.println(CLASS_NAME + " is making lemonade..");
        lemonader.makeLemonade(water, lemon, sugar);
        System.out.println(CLASS_NAME + " has made lemonade");
    }
}
