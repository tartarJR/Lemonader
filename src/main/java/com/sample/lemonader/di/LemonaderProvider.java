package com.sample.lemonader.di;

import com.sample.lemonader.cooler.WaterCooler;
import com.sample.lemonader.lemonader.Lemonader;
import dagger.Module;
import dagger.Provides;

@Module
public class LemonaderProvider {

    @Provides
    public Lemonader getLemonader(WaterCooler waterCooler) {
        return new Lemonader(waterCooler);
    }
}
