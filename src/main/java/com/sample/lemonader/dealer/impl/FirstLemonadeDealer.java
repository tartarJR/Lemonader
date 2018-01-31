package com.sample.lemonader.dealer.impl;

import com.sample.lemonader.di.DaggerLemonaderComponent;
import com.sample.lemonader.di.LemonaderComponent;
import com.sample.lemonader.lemonader.Lemonader;
import com.sample.lemonader.dealer.Dealer;
import com.sample.lemonader.util.LemonaderHelper;

import javax.inject.Inject;

public class FirstLemonadeDealer implements Dealer {

    private static final String CLASS_NAME = SecondLemonadeDealer.class.getSimpleName();

    @Inject
    LemonaderHelper lemonaderHelper;

    private Lemonader lemonader;

    public FirstLemonadeDealer() {
        injectDependency();
    }

    @Override
    public void runLemonader() {
        lemonader = lemonaderHelper.getLemonader(3, false, 10, 1);

        System.out.println(CLASS_NAME + " is making lemonade..");
        lemonader.makeLemonade();
        System.out.println(CLASS_NAME + " has made lemonade");
    }

    private void injectDependency() {
        LemonaderComponent component = DaggerLemonaderComponent.create();
        component.provideLemonaderHelper(this);
    }
}
