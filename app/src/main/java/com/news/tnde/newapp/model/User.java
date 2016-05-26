package com.news.tnde.newapp.model;

import java.util.Objects;
import com.orm.SugarRecord;

import com.google.gson.annotations.SerializedName;


/**
 * Created by mobsoft on 2016. 04. 18..
 */
public class User extends SugarRecord {

    @SerializedName("name")
    private String name = null;

    private int ID;
    private String userName;
    private String userPassword;

    public User(){ name = "Default";}
    public User(int id, String un, String up){
        ID = id; userName = un; userPassword = up;  name = "Default";
    }

    public User(int id, String un, String up, String name){
        ID = id; userName = un; userPassword = up;  this.name = name;
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

    @Override
    public String toString(){
        return name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){ this.name = name;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User)o;
        return Objects.equals(name, user.name);
    }

    @Override
    public int hashCode(){ return Objects.hash(name);}
}
