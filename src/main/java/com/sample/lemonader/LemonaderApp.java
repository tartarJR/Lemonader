package com.sample.lemonader;

import com.sample.lemonader.dealer.impl.FirstLemonadeDealer;
import com.sample.lemonader.dealer.impl.SecondLemonadeDealer;

public class LemonaderApp {

    public static void main(String[] args) {

        FirstLemonadeDealer firstDealer = new FirstLemonadeDealer(); // TODO remove hard dependency via Dagger 2
        firstDealer.runLemonader();

        System.out.println();
        System.out.println("*******");
        System.out.println();

        SecondLemonadeDealer secondDealer = new SecondLemonadeDealer(); // TODO remove hard dependency via Dagger 2
        secondDealer.runLemonader();
    }

}
