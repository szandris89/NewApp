package com.news.tnde.newapp.model;

import java.util.ArrayList;

//import dagger.Module;
//import dagger.Provides;

import java.util.Date;

/**
 * Created by mobsoft on 2016. 04. 18..
 */
public class ModelModule {
    //@Provides
    public HandlerModel getHandlerModel() {

        User u = new User(0,"sanyi", "012");
        ArrayList<User> uList = new ArrayList<User>();
        uList.add(u);
        Date d = new Date();
        News n = new News(0,0,"beszamolo",d.toString(),"Jol ereztem magam a hetvegen.");
        News n2 = new News(1,0,"beszamolo",d.toString(),"Bringaztam a hetvegen.");
        ArrayList<News> nList = new ArrayList<News>();
        nList.add(n); nList.add(n2);

        // ide kene csinalni vmi dummy data-t

        return new HandlerModel(uList, nList);
    }
}
