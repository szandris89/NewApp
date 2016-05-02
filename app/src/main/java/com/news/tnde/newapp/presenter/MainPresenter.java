package com.news.tnde.newapp.presenter;


import com.news.tnde.newapp.android.NewsApplication;
import com.news.tnde.newapp.model.HandlerModel;
import com.news.tnde.newapp.model.News;
import com.news.tnde.newapp.view.MainView;

import java.util.ArrayList;

import javax.inject.Inject;

/**
 * Created by mobsoft on 2016. 04. 18..
 */
public class MainPresenter extends Presenter<MainView> {

    @Inject
    public HandlerModel model;

    public MainPresenter(){
        NewsApplication.injector.inject(this);
    }

    public void doStuff() {

        //view.updateView( new News(1, 2, "bla", "bla", "bla"));
        ArrayList<News> list = model.getNewsList();
        if (list.size() > 0) {
            view.updateView(list.get(0));
        }
    }

}
