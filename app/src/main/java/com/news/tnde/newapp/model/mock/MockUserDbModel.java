package com.news.tnde.newapp.model.mock;
import com.news.tnde.newapp.model.User;
import com.news.tnde.newapp.model.prod.UserDbModel;

import java.util.LinkedList;
import java.util.List;


/**
 * Created by Tünde on 2016.05.26..
 */
public class MockUserDbModel extends UserDbModel {

    LinkedList<User> values = new LinkedList<User>();

    public MockUserDbModel() {
        values.add(new User(0, "userName1", "password1", "Name1"));
        values.add(new User(1, "userName2", "password2", "Name2"));
    }

    @Override
    public List<User> fetchUser() {
        return values;
    }

    @Override
    public void insertUser(User toInsert) {
        values.add(toInsert);
    }
}
