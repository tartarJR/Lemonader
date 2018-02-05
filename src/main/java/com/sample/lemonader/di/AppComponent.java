package com.sample.lemonader.di;

import com.sample.lemonader.dealer.impl.FirstLemonadeDealer;
import com.sample.lemonader.dealer.impl.SecondLemonadeDealer;
import com.sample.lemonader.dealer.impl.ThirdLemonadeDealer;
import dagger.Component;

@Component(modules = {LemonaderProvider.class, ThirdLemonadeDealerProvider.class})
public interface AppComponent {
    FirstLemonadeDealer getFirstLemonadeDealer();

    SecondLemonadeDealer getSecondLemonadeDealer();

    ThirdLemonadeDealer getThirdLemonadeDealer();

    void injectLemonader(ThirdLemonadeDealer thirdLemonadeDealer);
}
