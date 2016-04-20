package com.news.tnde.newapp;

import com.news.tnde.newapp.model.ModelModule;
import com.news.tnde.newapp.presenter.MainPresenter;
import com.news.tnde.newapp.view.MainActivity;
import com.news.tnde.newapp.view.ViewModule;

import javax.inject.Singleton;

import dagger.Component;


/**
 * Created by mobsoft on 2016. 04. 18..
 */

@Singleton
@Component(modules = {ViewModule.class, ModelModule.class})
public interface NewsApplicationComponent {
    void inject(MainActivity mainActivity);

    void inject(MainPresenter mainPresenter);

    //void inject(StringInteractor stringInteractor);
}
