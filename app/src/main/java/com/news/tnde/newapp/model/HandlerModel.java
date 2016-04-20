package com.news.tnde.newapp.model;


import java.util.ArrayList;

/**
 * Created by mobsoft on 2016. 04. 18..
 */
public class HandlerModel {

    private int userSize = 0;
    private int newsSize = 0;
    private ArrayList<User> userList = new ArrayList<User>();
    private ArrayList<News> newsList = new ArrayList<News>();

    HandlerModel(ArrayList<User> u, ArrayList<News> n){
        userList = u;
        userSize = u.size();
        newsList = n;
        newsSize = n.size();
    }
    HandlerModel(){
        userList = null; newsList = null;
    }

    void addUser(User u){
        userList.add(u);
    }

    void addNews(News n){
        newsList.add(n);
    }

    ArrayList<User> getUserList(){
        return userList;
    }

    ArrayList<News> getNewsList(){
        return newsList;
    }
}
