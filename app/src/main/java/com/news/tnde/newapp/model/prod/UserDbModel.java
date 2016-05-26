package com.news.tnde.newapp.model.prod;

import com.news.tnde.newapp.model.User;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Tünde on 2016.05.26..
 */
public class UserDbModel {

    public UserDbModel() {

    }

    public List<User> fetchNews() {
        List<User> values = User.listAll(User.class);
        return values;
    }

    public void insertNews(User toInsert) {
        toInsert.save();
    }

}



