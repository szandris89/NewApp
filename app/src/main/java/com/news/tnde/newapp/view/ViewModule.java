package com.news.tnde.newapp.view;

import android.content.Context;

//import javax.inject.Singleton;

//import dagger.Module;
//import dagger.Provides;

/**
 * Created by mobsoft on 2016. 04. 18..
 */
public class ViewModule {
    private Context context;

    public ViewModule(Context context) {
        this.context = context;
    }

    //@Provides
    public Context provideContext() {
        return context;
    }

    /*@Provides
    @Singleton
    public MainPresenter getMainPresenter() {
        return new MainPresenter();
    }*/
}
