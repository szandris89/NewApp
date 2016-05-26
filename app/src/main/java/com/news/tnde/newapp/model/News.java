package com.news.tnde.newapp.model;
import java.util.Date;

import com.orm.SugarRecord;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

/**
 * Created by mobsoft on 2016. 04. 18..
 */
public class News extends SugarRecord {
    private int newsID;
    private int ownerID;
    private String title;
    private String date;
    private String text;

    @SerializedName("name")
    private String name = null;

    public News(){name = "Default";}

    public News(int id, int oid, String ti, String d, String te){
        newsID = id; ownerID = oid; title = ti; date = d; text = te;
        name = "Default";
    }

    public News(int id, int oid, String ti, String d, String te, String name){
        newsID = id; ownerID = oid; title = ti; date = d; text = te;
        this.name = name;
    }

    public int getNewsID(){
        return newsID;
    }
    public int getOwnerID(){
        return ownerID;
    }
    public String getTitle(){
        return title;
    }
    public String getDate(){
        return date;
    }
    public String getText(){
        return text;
    }

    @Override
    public String toString(){
        return name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        News news = (News)o;
        return Objects.equals(name, news.name);
    }

    @Override
    public int hashCode(){
        return Objects.hash(name);
    }

}
