package com.news.tnde.newapp.Interactor;

import dagger.Module;
import dagger.Provides;
/**
 * Created by mobsoft on 2016. 05. 02..
 */
@Module
public class InteractorModule {
    @Provides
    public NewsInteractor provideNewsDbInteractor() {
        return new NewsInteractor();
    }
}




