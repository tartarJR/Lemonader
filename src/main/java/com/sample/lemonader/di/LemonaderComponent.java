package com.sample.lemonader.di;

import com.sample.lemonader.dealer.impl.FirstLemonadeDealer;
import com.sample.lemonader.dealer.impl.SecondLemonadeDealer;
import dagger.Component;

@Component(modules = {LemonaderHelperProvider.class})
public interface LemonaderComponent {
    void provideLemonaderHelper(FirstLemonadeDealer firstLemonadeDealer);

    void provideLemonaderHelper(SecondLemonadeDealer secondLemonadeDealer);

    FirstLemonadeDealer getFirstLemonadeDealer();

    SecondLemonadeDealer getSecondLemonadeDealer();
}
