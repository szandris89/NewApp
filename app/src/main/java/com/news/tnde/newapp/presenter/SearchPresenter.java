package com.news.tnde.newapp.presenter;

import com.news.tnde.newapp.NewsApplication;
import com.news.tnde.newapp.model.HandlerModel;
import com.news.tnde.newapp.model.News;
import com.news.tnde.newapp.view.ListView;
import com.news.tnde.newapp.view.SearchView;

import java.util.ArrayList;

import javax.inject.Inject;

/**
 * Created by Tünde on 2016.04.30..
 */
public class SearchPresenter extends Presenter<SearchView> {
    @Inject
    public HandlerModel model;

    public SearchPresenter(){
        NewsApplication.injector.inject(this);
    }

    public ArrayList<News> getSearchList(){
        ArrayList<News> ul = model.getNewsList();
        return ul;
    }
}



