package com.sample.lemonader;

import com.sample.lemonader.dealer.impl.FirstLemonadeDealer;
import com.sample.lemonader.dealer.impl.SecondLemonadeDealer;
import com.sample.lemonader.di.DaggerLemonaderComponent;
import com.sample.lemonader.di.LemonaderComponent;

public class LemonaderApp {

    public static void main(String[] args) {

        LemonaderComponent lemonaderComponent = DaggerLemonaderComponent.create();

        FirstLemonadeDealer firstDealer = lemonaderComponent.getFirstLemonadeDealer();
        firstDealer.runLemonader();

        System.out.println();
        System.out.println("*******");
        System.out.println();

        SecondLemonadeDealer secondDealer = lemonaderComponent.getSecondLemonadeDealer();
        secondDealer.runLemonader();
    }

}
