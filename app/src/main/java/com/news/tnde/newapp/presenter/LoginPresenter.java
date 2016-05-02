package com.news.tnde.newapp.presenter;

import com.news.tnde.newapp.android.NewsApplication;
import com.news.tnde.newapp.model.HandlerModel;
import com.news.tnde.newapp.model.User;
import com.news.tnde.newapp.view.LoginView;

import java.util.ArrayList;

import javax.inject.Inject;

/**
 * Created by Tünde on 2016.04.30..
 */
public class LoginPresenter extends Presenter<LoginView> {

    @Inject
    public HandlerModel model;

    public LoginPresenter(){
        NewsApplication.injector.inject(this);
    }

    public int logIn(String uname, String pw){
        //model.getUserList()
        ArrayList<User> ul = model.getUserList();
        for (User u:ul) {
            if (uname == u.getUserName() && pw == u.getUserPassword()) {
                return u.getID();
            }
        }
        return -1;
    }
}
