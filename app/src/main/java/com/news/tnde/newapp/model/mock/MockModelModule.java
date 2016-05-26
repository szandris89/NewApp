package com.news.tnde.newapp.model.mock;

import com.news.tnde.newapp.model.prod.NewsDbModel;
import com.news.tnde.newapp.model.prod.UserDbModel;

import dagger.Module;
import dagger.Provides;

/**
 * Created by mobsoft on 2016. 05. 02..
 */

@Module
public class MockModelModule {

    @Provides
    public NewsDbModel provideMockNewsDbModel() {
        return new MockNewsDbModel();
    }
    public UserDbModel provideMockUserDbModel() { return new MockUserDbModel(); }
}