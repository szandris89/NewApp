package com.news.tnde.newapp.presenter;

import com.news.tnde.newapp.android.NewsApplication;
import com.news.tnde.newapp.model.HandlerModel;
import com.news.tnde.newapp.model.News;
import com.news.tnde.newapp.view.DetailsView;

import javax.inject.Inject;

/**
 * Created by Tünde on 2016.04.30..
 */
public class DetailsPresenter extends Presenter<DetailsView> {
    @Inject
    public HandlerModel model;

    public DetailsPresenter(){
        NewsApplication.injector.inject(this);
    }

    public void modifyNews(News n){
        //ahol a newsID es a userID megegyezik ott toltse fel
    }

}
