package com.news.tnde.newapp;

import android.app.Application;
import com.news.tnde.newapp.view.ViewModule;


/**
 * Created by mobsoft on 2016. 04. 18..
 */
public class NewsApplication extends Application{

    public static NewsApplicationComponent injector;

    @Override
    public void onCreate() {
        super.onCreate();
        injector = DaggerNewsApplicationComponent.builder().viewModule(new ViewModule(this)).build();
    }
}
