package com.news.tnde.newapp.android;

import android.app.Application;

import com.news.tnde.newapp.BuildConfig;
import com.news.tnde.newapp.android.ViewModule;


/**
 * Created by mobsoft on 2016. 04. 18..
 */
public class NewsApplication extends Application{

    public static NewsApplicationComponent injector;

    @Override
    public void onCreate() {
        super.onCreate();
        if (BuildConfig.FLAVOR.equals("mock")) {
            injector = DaggerMockNewsApplicationComponent.builder().viewModule(new ViewModule(this)).build();
        }else {
            injector = DaggerNewsApplicationComponent.builder().viewModule(new ViewModule(this)).build();
        }
    }

    public void setInjector(NewsApplicationComponent appComponent) {
        injector = appComponent;
        injector.inject(this);
    }


}
