package com.sample.lemonader.di;

import com.sample.lemonader.dealer.impl.ThirdLemonadeDealer;
import com.sample.lemonader.lemonader.Lemonader;
import dagger.Module;
import dagger.Provides;

@Module
public class ThirdLemonadeDealerProvider {

    @Provides
    public ThirdLemonadeDealer getThirdLemonaderDealer(Lemonader lemonader) {
        return new ThirdLemonadeDealer();
    }
}
