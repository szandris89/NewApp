package com.news.tnde.newapp.model.prod;

import dagger.Module;
import dagger.Provides;
/**
 * Created by mobsoft on 2016. 05. 02..
 */

@Module
public class ModelModule {
    @Provides
    public NewsDbModel provideNewsDbModel() {
        return new NewsDbModel();
    }
}