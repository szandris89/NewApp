package com.news.tnde.newapp.android;

import android.content.Context;

import com.news.tnde.newapp.presenter.AddPresenter;
import com.news.tnde.newapp.presenter.DetailsPresenter;
import com.news.tnde.newapp.presenter.ListPresenter;
import com.news.tnde.newapp.presenter.LoginPresenter;
import com.news.tnde.newapp.presenter.MainPresenter;
import com.news.tnde.newapp.presenter.SearchPresenter;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;


/**
 * Created by mobsoft on 2016. 04. 18..
 */
@Module
public class ViewModule {
    private Context context;

    public ViewModule(Context context) {
        this.context = context;
    }

    @Provides
    public Context provideContext() {
        return context;
    }

    @Provides
    @Singleton
    public MainPresenter getMainPresenter() {
        return new MainPresenter();
    }

    @Provides
    @Singleton
    public LoginPresenter getLoginPresenter() { return new LoginPresenter(); }

    @Provides
    @Singleton
    public ListPresenter getListPresenter() { return new ListPresenter(); }

    @Provides
    @Singleton
    public SearchPresenter getSearchPresenter() { return new SearchPresenter(); }

    @Provides
    @Singleton
    public DetailsPresenter getDetailsPresenter() { return new DetailsPresenter(); }

    @Provides
    @Singleton
    public AddPresenter getAddPresenter() { return new AddPresenter(); }
}
