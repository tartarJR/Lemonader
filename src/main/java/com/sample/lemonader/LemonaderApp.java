package com.sample.lemonader;

import com.sample.lemonader.dealer.Dealer;
import com.sample.lemonader.dealer.impl.ThirdLemonadeDealer;
import com.sample.lemonader.di.AppComponent;
import com.sample.lemonader.di.DaggerAppComponent;
import com.sample.lemonader.ingredient.Lemon;
import com.sample.lemonader.ingredient.Sugar;
import com.sample.lemonader.ingredient.Water;

public class LemonaderApp {

    public static void main(String[] args) {

        AppComponent appComponent = DaggerAppComponent.create();

        // no need to create newables via Dagger 2
        Water w1 = new Water();
        w1.setAmount(5);
        w1.setCold(false);

        Lemon l1 = new Lemon();
        l1.setQuantity(2);

        Sugar s1 = new Sugar();
        s1.setAmount(1);

        Dealer firstDealer = appComponent.getFirstLemonadeDealer();
        firstDealer.runLemonader(w1, l1, s1);

        System.out.println();
        System.out.println("*******");
        System.out.println();

        // no need to create newables via Dagger 2
        Water w2 = new Water();
        w2.setAmount(15);
        w2.setCold(false);

        Lemon l2 = new Lemon();
        l2.setQuantity(6);

        Sugar s2 = new Sugar();
        s2.setAmount(3);

        Dealer secondDealer = appComponent.getSecondLemonadeDealer();
        secondDealer.runLemonader(w2, l2, s2);

        System.out.println();
        System.out.println("*******");
        System.out.println();

        // no need to create newables via Dagger 2
        Water w3 = new Water();
        w3.setAmount(12);
        w3.setCold(true);

        Lemon l3 = new Lemon();
        l3.setQuantity(4);

        Sugar s3 = new Sugar();
        s3.setAmount(2);

        Dealer thirdDealer = appComponent.getThirdLemonadeDealer();
        // inject field of ThirdLemonadeDealer
        appComponent.injectLemonader((ThirdLemonadeDealer) thirdDealer);
        thirdDealer.runLemonader(w3, l3, s3);
    }

}
