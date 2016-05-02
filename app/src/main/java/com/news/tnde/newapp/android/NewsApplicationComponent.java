package com.news.tnde.newapp.android;

import com.news.tnde.newapp.Interactor.InteractorModule;
import com.news.tnde.newapp.Interactor.NewsInteractor;
import com.news.tnde.newapp.model.ModelModule;
import com.news.tnde.newapp.presenter.AddPresenter;
import com.news.tnde.newapp.presenter.DetailsPresenter;
import com.news.tnde.newapp.presenter.ListPresenter;
import com.news.tnde.newapp.presenter.LoginPresenter;
import com.news.tnde.newapp.presenter.MainPresenter;
import com.news.tnde.newapp.presenter.SearchPresenter;
import com.news.tnde.newapp.android.AddActivity;
import com.news.tnde.newapp.android.DetailsActivity;
import com.news.tnde.newapp.android.ListActivity;
import com.news.tnde.newapp.android.LoginActivity;
import com.news.tnde.newapp.android.MainActivity;
import com.news.tnde.newapp.android.SearchActivity;
import com.news.tnde.newapp.android.ViewModule;
/*
import com.mtomoskozi.sugarapp.interactor.InteractorModule;
import com.mtomoskozi.sugarapp.interactor.PeopleInteractor;
import com.mtomoskozi.sugarapp.model.prod.ModelModule;
import com.mtomoskozi.sugarapp.network.prod.NetworkModule;
import com.mtomoskozi.sugarapp.presenter.MainPresenter;
import com.mtomoskozi.sugarapp.view.ViewModule;
*/
import javax.inject.Singleton;

import dagger.Component;


/**
 * Created by mobsoft on 2016. 04. 18..
 */

@Singleton
@Component(modules = {ViewModule.class, InteractorModule.class, ModelModule.class, NetworkModule.class})
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

    void inject(NewsInteractor interactor);

    //void inject(SugarAppApplication app); ???

    // void inject(LoginActivity loginActivity);
   // void inject(LoginPresenter loginPresenter);


}







