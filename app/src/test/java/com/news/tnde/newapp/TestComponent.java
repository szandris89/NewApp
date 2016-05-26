package com.news.tnde.newapp;

import com.news.tnde.newapp.android.NewsApplicationComponent;
import com.news.tnde.newapp.Interactor.InteractorModule;
import com.news.tnde.newapp.network.mock.MockNetworkModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Tünde on 2016.05.27..
 */

@Singleton
@Component(modules = {MockNetworkModule.class, TestModule.class, InteractorModule.class})
public interface TestComponent extends NewsApplicationComponent {
}