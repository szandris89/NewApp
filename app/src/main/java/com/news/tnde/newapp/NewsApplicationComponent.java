package com.news.tnde.newapp;

import com.news.tnde.newapp.model.ModelModule;
import com.news.tnde.newapp.presenter.AddPresenter;
import com.news.tnde.newapp.presenter.DetailsPresenter;
import com.news.tnde.newapp.presenter.ListPresenter;
import com.news.tnde.newapp.presenter.LoginPresenter;
import com.news.tnde.newapp.presenter.MainPresenter;
import com.news.tnde.newapp.presenter.SearchPresenter;
import com.news.tnde.newapp.view.AddActivity;
import com.news.tnde.newapp.view.DetailsActivity;
import com.news.tnde.newapp.view.ListActivity;
import com.news.tnde.newapp.view.LoginActivity;
import com.news.tnde.newapp.view.MainActivity;
import com.news.tnde.newapp.view.SearchActivity;
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

    void inject(LoginActivity loginActivity);
    void inject(LoginPresenter loginPresenter);

    void inject(ListActivity listActivity);
    void inject(ListPresenter listPresenter);

    void inject(SearchActivity searchActivity);
    void inject(SearchPresenter searchPresenter);

    void inject(DetailsActivity detailsActivity);
    void inject(DetailsPresenter detailsPresenter);

    void inject(AddActivity addActivity);
    void inject(AddPresenter addPresenter);



    // void inject(LoginActivity loginActivity);
   // void inject(LoginPresenter loginPresenter);


}
