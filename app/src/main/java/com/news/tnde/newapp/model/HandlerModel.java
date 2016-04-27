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

    public HandlerModel(ArrayList<User> u, ArrayList<News> n){
        userList = u;
        userSize = u.size();
        newsList = n;
        newsSize = n.size();
    }
    public HandlerModel(){
        userList = null; newsList = null;
    }

    public void addUser(User u){
        userList.add(u);
    }

    public void addNews(News n){
        newsList.add(n);
    }

    public ArrayList<User> getUserList(){
        return userList;
    }

    public ArrayList<News> getNewsList(){
        return newsList;
    }
}
