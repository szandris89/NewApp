package com.news.tnde.newapp.model.prod;

import com.mtomoskozi.sugarapp.model.Person;
import com.news.tnde.newapp.model.News;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by mobsoft on 2016. 05. 02..
 */
public class NewsDbModel {

    public NewsDbModel() {

    }

    public List<News> fetchNews() {
        List<News> values = News.listAll(News.class);
        return values;
    }

    public void insertNews(News toInsert) {
        toInsert.save();
    }
}


