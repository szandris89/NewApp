package com.news.tnde.newapp.presenter;

import com.news.tnde.newapp.Interactor.UserInteractor;
import com.news.tnde.newapp.android.NewsApplication;
import com.news.tnde.newapp.Interactor.NewsInteractor;
import com.news.tnde.newapp.model.HandlerModel;
import com.news.tnde.newapp.model.News;
import com.news.tnde.newapp.view.ListView;

import java.util.ArrayList;

import javax.inject.Inject;

/**
 * Created by Tünde on 2016.04.30..
 */
public class ListPresenter extends  Presenter<ListView> {

    /*Regi kod:*/
    /*
    @Inject
    public HandlerModel model;

    public ListPresenter(){
        NewsApplication.injector.inject(this);
    }

    public ArrayList<News> getNewsList(){
        ArrayList<News> ul = model.getNewsList();
        return ul;
    }
    */

    @Inject
    public NewsInteractor interactor;

    public ListPresenter(){
        NewsApplication.injector.inject(this);
    }

    public void addNews(News toAdd){
        try{
            interactor.addNewsToNetwork(toAdd);
        } catch (Exception e) {
            //e.printStackTrace();
            interactor.addNewsToDb(toAdd);
            view.showMessage(e.getMessage());
        }
    }

    public void refreshNews(){
        try{
            view.showNews(interactor.getNewsFromNetwork());
        } catch (Exception e) {
            //e.printStackTrace();
            view.showNews(interactor.getNewsFromDb());
            view.showMessage(e.getMessage());
        }
    }
}




