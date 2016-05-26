package com.news.tnde.newapp.view;

import com.news.tnde.newapp.model.News;

import java.util.List;

/**
 * Created by Tünde on 2016.04.30..
 */
public interface ListView {
    void updateView();

    void showMessage(String message);

    void showNews(List<News> newsFromNetwork);
    //void addNews();
    //void search();
}
