package com.news.tnde.newapp.Interactor;

import com.news.tnde.newapp.android.NewsApplication;
import com.news.tnde.newapp.model.User;
import com.news.tnde.newapp.model.prod.UserDbModel;
import com.news.tnde.newapp.network.UserApi;

import java.util.List;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Response;

/**
 * Created by Tünde on 2016.05.25..
 */
public class UserInteractor {

    @Inject
    UserDbModel model;

    @Inject
    UserApi newsApi;

    public UserInteractor() {
        NewsApplication.injector.inject(this);
    }

    public void addUserToDb(User toAdd) {
        model.insertUser(toAdd);
    }

    public void addUserToNetwork(User toAdd) throws Exception {
        Response response = null;

        Call call = UserApi.userAddDataGet(toAdd.getName());
        try {
            response = call.execute();
        } catch (Exception e) {
            throw new Exception("Network error on execute with post!");
        }
        if (response.code() != 200) {
            throw new Exception("Network error with post!");
        }
    }

    public List<User> getUserFromDb() {
        return model.fetchUser();
    }

    public List<User> getUserFromNetwork() throws Exception {
        Response<List<User>> response = null;

        Call<List<User>> call = userApi.userGet();
        try {
            response = call.execute();
        } catch (Exception e) {
            throw new Exception("Network error on execute with get!");
        }
        if (response.code() != 200) {
            throw new Exception("Network error with get!");
        }

        return response.body();
    }

}
