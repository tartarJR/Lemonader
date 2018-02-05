package com.sample.lemonader.dealer;

import com.sample.lemonader.ingredient.Lemon;
import com.sample.lemonader.ingredient.Sugar;
import com.sample.lemonader.ingredient.Water;

public interface Dealer {
    void runLemonader(Water water, Lemon lemon, Sugar sugar);
}
