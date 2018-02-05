package com.sample.lemonader.dealer.impl;

import com.sample.lemonader.dealer.Dealer;
import com.sample.lemonader.ingredient.Lemon;
import com.sample.lemonader.ingredient.Sugar;
import com.sample.lemonader.ingredient.Water;
import com.sample.lemonader.lemonader.Lemonader;

import javax.inject.Inject;

public class SecondLemonadeDealer implements Dealer {

    private static final String CLASS_NAME = SecondLemonadeDealer.class.getSimpleName();

    private Lemonader lemonader;

    @Inject // we don't have provider for SecondLemonadeDealer so we put @Inject annotation here
    public SecondLemonadeDealer() {

    }

    @Override
    public void runLemonader(Water water, Lemon lemon, Sugar sugar) {
        System.out.println(CLASS_NAME + " is making lemonade..");
        lemonader.makeLemonade(water, lemon, sugar);
        System.out.println(CLASS_NAME + " has made lemonade");
    }

    // setter/method injection of Lemonader via Dagger 2, method must be public
    @Inject
    public void setLemonaderHelper(Lemonader lemonader) {
        this.lemonader = lemonader;
    }
}
