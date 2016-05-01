package com.news.tnde.newapp.model;

/**
 * Created by mobsoft on 2016. 04. 18..
 */
public class User extends SugarRecord<User>{

    private int ID;
    private String userName;
    private String userPassword;

    public User(){}
    public User(int id, String un, String up){
        ID = id; userName = un; userPassword = up;
    }
    public String getUserName(){
        return userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public int getID(){
        return ID;
    }


}
