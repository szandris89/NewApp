package com.news.tnde.newapp.android;

import com.news.tnde.newapp.Interactor.InteractorModule;
import com.news.tnde.newapp.model.mock.MockModelModule;
import com.news.tnde.newapp.network.mock.MockNetworkModule;
import com.news.tnde.newapp.android.ViewModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Tünde on 2016.05.25..
 */

@Singleton
@Component(modules = {ViewModule.class, InteractorModule.class, MockModelModule.class} )
public interface MockNewsApplicationComponent extends NewsApplicationComponent {

}
