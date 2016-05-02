package com.news.tnde.newapp.presenter;

import com.news.tnde.newapp.android.NewsApplication;
import com.news.tnde.newapp.model.HandlerModel;
import com.news.tnde.newapp.model.News;
import com.news.tnde.newapp.view.ListView;

import java.util.ArrayList;

import javax.inject.Inject;

/**
 * Created by Tünde on 2016.04.30..
 */
public class ListPresenter extends  Presenter<ListView> {

    @Inject
    public HandlerModel model;

    public ListPresenter(){
        NewsApplication.injector.inject(this);
    }

    public ArrayList<News> getNewsList(){
        ArrayList<News> ul = model.getNewsList();
        return ul;
    }

}




