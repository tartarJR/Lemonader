package com.sample.lemonader.di;

import com.sample.lemonader.util.LemonaderHelper;
import dagger.Module;
import dagger.Provides;

@Module
public class LemonaderHelperProvider {

    @Provides
    public LemonaderHelper getLemonaderHelper(){
        return new LemonaderHelper();
    }

}
