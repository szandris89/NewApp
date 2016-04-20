package com.news.tnde.newapp.presenter;


import com.news.tnde.newapp.model.News;
import com.news.tnde.newapp.view.MainView;

/**
 * Created by mobsoft on 2016. 04. 18..
 */
public class MainPresenter extends Presenter<MainView> {

   // @Inject
   // public StringInteractor interactor;

    public MainPresenter(){
        //NewsApplication.injector.inject(this);
    }

    public void doStuff() {
        view.updateView( new News(1, 2, "bla", "bla", "bla"));
    }
}
