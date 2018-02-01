package com.sample.lemonader.util;

import com.sample.lemonader.di.LemonaderComponent;
import com.sample.lemonader.lemonader.Lemonader;
import com.sample.lemonader.ingredient.Lemon;
import com.sample.lemonader.ingredient.Sugar;
import com.sample.lemonader.ingredient.Water;

import javax.inject.Inject;

public class LemonaderHelper {

    public Lemonader getLemonader(int waterAmount, boolean isWaterHot, int lemonQuantity, int sugarAmount) {
        Water w = new Water(); // TODO remove hard dependency via Dagger 2
        w.setAmount(waterAmount);
        w.setCold(isWaterHot);

        Lemon l = new Lemon(); // TODO remove hard dependency via Dagger 2
        l.setQuantity(lemonQuantity);

        Sugar s = new Sugar(); // TODO remove hard dependency via Dagger 2
        s.setAmount(sugarAmount);

        Lemonader lemonader = new Lemonader(w, l, s); // TODO remove hard dependency via Dagger 2

        return lemonader;
    }

}
