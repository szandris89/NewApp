package com.news.tnde.newapp;

import android.content.Context;

import com.news.tnde.newapp.Interactor.InteractorModule;
import com.news.tnde.newapp.model.prod.ModelModule;
import com.news.tnde.newapp.model.prod.NewsDbModel;
import com.news.tnde.newapp.model.prod.UserDbModel;
import com.news.tnde.newapp.presenter.MainPresenter;
import com.news.tnde.newapp.presenter.AddPresenter;
import com.news.tnde.newapp.presenter.DetailsPresenter;
import com.news.tnde.newapp.presenter.ListPresenter;
import com.news.tnde.newapp.presenter.LoginPresenter;
import com.news.tnde.newapp.presenter.SearchPresenter;
import com.news.tnde.newapp.android.ViewModule;

import java.util.concurrent.Executor;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Tünde on 2016.05.27..
 */
@Module
public class TestModule {

    private final ViewModule viewModule;
    private final ModelModule modelModule;

    public TestModule(Context context) {

        this.viewModule = new ViewModule(context);
        this.modelModule = new ModelModule();
    }

    @Provides
    public Context provideContext() {
        return viewModule.provideContext();
    }

    @Provides
    public NewsDbModel provideNewsPresenter() {
        return modelModule.provideNewsDbModel();
    }

    @Provides
    public UserDbModel provideUserPresenter(){
        return modelModule.provideUserDbModel();
    }

    @Provides
    public MainPresenter provideMainPresenter() {
        //return viewModule.provideMainPresenter();
        return viewModule.getMainPresenter();
    }

    @Provides
    public AddPresenter provideAddPresenter(){
        return viewModule.getAddPresenter();
    }

    @Provides
    public DetailsPresenter provideDetailsPresenter(){
        return viewModule.getDetailsPresenter();
    }

    @Provides
    public ListPresenter provideListPresenter(){
        return viewModule.getListPresenter();
    }

    @Provides
    public LoginPresenter provideLoginPresenter(){
        return viewModule.getLoginPresenter();
    }

    @Provides
    public SearchPresenter provideSearchPresenter(){
        return viewModule.getSearchPresenter();
    }
}