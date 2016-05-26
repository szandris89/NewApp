package com.news.tnde.newapp;

import com.news.tnde.newapp.android.NewsApplication;
import com.news.tnde.newapp.android.NewsApplicationComponent;

import org.robolectric.RuntimeEnvironment;
import org.robolectric.shadows.ShadowLog;


/**
 * Created by Tünde on 2016.05.27..
 */
public class TestHelper {
    public static void setTestInjector() {
        NewsApplication application = (NewsApplication)RuntimeEnvironment.application;
        NewsApplicationComponent injector = DaggerTestComponent.builder().testModule(
                new TestModule(application.getApplicationContext())).build();
        application.setInjector(injector);
    }

}
