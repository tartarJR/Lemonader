package com.sample.lemonader;

import com.sample.lemonader.dealer.impl.FirstLemonadeDealer;
import com.sample.lemonader.dealer.impl.SecondLemonadeDealer;
import com.sample.lemonader.lemonader.Lemonader;
import com.sample.lemonader.util.LemonaderHelper;

public class LemonaderApp {

    public static void main(String[] args) {

        LemonaderHelper lemonaderHelper = new LemonaderHelper(); // TODO remove hard dependency via Dagger 2

        Lemonader lemonader1 = lemonaderHelper.getLemonader(3, false, 10, 1);
        Lemonader lemonader2 = lemonaderHelper.getLemonader(6, true, 20, 2);

        FirstLemonadeDealer firstDealer = new FirstLemonadeDealer(lemonader1); // TODO remove hard dependency via Dagger 2
        firstDealer.runLemonader();

        System.out.println();
        System.out.println("*******");
        System.out.println();

        SecondLemonadeDealer secondDealer = new SecondLemonadeDealer(lemonader2); // TODO remove hard dependency via Dagger 2
        secondDealer.runLemonader();
    }

}
