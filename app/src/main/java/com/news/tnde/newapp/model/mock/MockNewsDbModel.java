package com.news.tnde.newapp.model.mock;

import com.news.tnde.newapp.model.News;
import com.news.tnde.newapp.model.prod.NewsDbModel;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by mobsoft on 2016. 05. 02..
 */
public class MockNewsDbModel extends NewsDbModel{

    LinkedList<News> values = new LinkedList<>();

    public MockNewsDbModel() {
        values.add(new News(0,0,"cim1","2016","valami"));
        values.add(new News(1,0,"cim2","2016","valami2"));
    }

    @Override
    public List<News> fetchNews() {
        return values;
    }

    @Override
    public void insertNews(News toInsert) {
        values.add(toInsert);
    }
}
