package com.sample.lemonader.di;

import com.sample.lemonader.dealer.impl.FirstLemonadeDealer;
import com.sample.lemonader.dealer.impl.SecondLemonadeDealer;
import dagger.Component;

@Component(modules = {LemonaderHelperProvider.class})
public interface LemonaderComponent {
    FirstLemonadeDealer getFirstLemonadeDealer();
    SecondLemonadeDealer getSecondLemonadeDealer();
}
