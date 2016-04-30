package com.news.tnde.newapp.presenter;

import com.news.tnde.newapp.NewsApplication;
import com.news.tnde.newapp.model.HandlerModel;
import com.news.tnde.newapp.model.News;
import com.news.tnde.newapp.model.User;
import com.news.tnde.newapp.view.ListView;
import com.news.tnde.newapp.view.LoginView;
import com.news.tnde.newapp.view.MainView;

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




