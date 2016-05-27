package com.news.tnde.newapp.android;

import android.app.Application;

//package com.google.samples.quickstart.analytics;

        //import android.app.Application;
import com.crashlytics.android.Crashlytics;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.Tracker;


import android.app.Application;

import com.news.tnde.newapp.BuildConfig;
import com.news.tnde.newapp.android.ViewModule;
import com.orm.SugarContext;
import io.fabric.sdk.android.Fabric;


/**
 * Created by mobsoft on 2016. 04. 18..
 */
public class NewsApplication extends Application {

    private Tracker mTracker;


    public static NewsApplicationComponent injector;

    @Override
    public void onCreate() {
        super.onCreate();
        Fabric.with(this, new Crashlytics());
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

    @Override
    public void onTerminate(){
        super.onTerminate();

        if(BuildConfig.FLAVOR.equals("mock")){
            SugarContext.terminate();
        }
    }

    synchronized public Tracker getDefaultTracker() {
        if (mTracker == null) {
            GoogleAnalytics analytics = GoogleAnalytics.getInstance(this);
            // To enable debug logging use: adb shell setprop log.tag.GAv4 DEBUG
            mTracker = analytics.newTracker(R.xml.global_tracker);
        }
        return mTracker;
    }


}
