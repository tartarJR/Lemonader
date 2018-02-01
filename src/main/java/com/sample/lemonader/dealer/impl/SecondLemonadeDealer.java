package com.sample.lemonader.dealer.impl;

import com.sample.lemonader.di.DaggerLemonaderComponent;
import com.sample.lemonader.di.LemonaderComponent;
import com.sample.lemonader.lemonader.Lemonader;
import com.sample.lemonader.dealer.Dealer;
import com.sample.lemonader.util.LemonaderHelper;

import javax.inject.Inject;

public class SecondLemonadeDealer implements Dealer {

    private static final String CLASS_NAME = SecondLemonadeDealer.class.getSimpleName();

    private LemonaderHelper lemonaderHelper;
    private Lemonader lemonader;

    @Inject
    public SecondLemonadeDealer() {

    }

    @Override
    public void runLemonader() {
        lemonader = lemonaderHelper.getLemonader(6, true, 20, 2);

        System.out.println(CLASS_NAME + " is making lemonade..");
        lemonader.makeLemonade();
        System.out.println(CLASS_NAME + " has made lemonade");
    }

    @Inject
    public void setLemonaderHelper(LemonaderHelper lemonaderHelper) {
        this.lemonaderHelper = lemonaderHelper;
    }
}
