package com.sample.lemonader.dealer.impl;

import com.sample.lemonader.lemonader.Lemonader;
import com.sample.lemonader.dealer.Dealer;

public class FirstLemonadeDealer implements Dealer {

    private static final String CLASS_NAME = SecondLemonadeDealer.class.getSimpleName();

    private Lemonader lemonader;

    // TODO constructor injection needed
    public FirstLemonadeDealer(Lemonader lemonader) {
        this.lemonader = lemonader;
    }

    @Override
    public void runLemonader() {
        System.out.println(CLASS_NAME + " is making lemonade..");
        lemonader.makeLemonade();
        System.out.println(CLASS_NAME + " has made lemonade");
    }
}
