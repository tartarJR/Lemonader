package com.sample.lemonader.di;

import com.sample.lemonader.dealer.impl.ThirdLemonadeDealer;
import dagger.Module;
import dagger.Provides;

@Module
public class ThirdLemonadeDealerProvider {

    @Provides
    public ThirdLemonadeDealer getThirdLemonaderDealer() {
        return new ThirdLemonadeDealer();
    }
}
