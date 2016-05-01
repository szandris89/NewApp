package com.news.tnde.newapp.presenter;

import com.news.tnde.newapp.NewsApplication;
import com.news.tnde.newapp.model.HandlerModel;
import com.news.tnde.newapp.model.News;
import com.news.tnde.newapp.presenter.Presenter;
import com.news.tnde.newapp.view.AddView;

import javax.inject.Inject;

/**
 * Created by Tünde on 2016.04.30..
 */
public class AddPresenter extends Presenter<AddView> {
    @Inject
    public HandlerModel model;

    public AddPresenter(){
        NewsApplication.injector.inject(this);
    }

    public void uploadNews(News n){
        // news feltoltese
    }
}
