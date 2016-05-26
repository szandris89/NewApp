package com.news.tnde.newapp.model;
import java.util.Date;

import com.orm.SugarRecord;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by mobsoft on 2016. 04. 18..
 */
public class News extends SugarRecord {

    @SerializedName("newsid")
    private int newsID;
    @SerializedName("ownerid")
    private int ownerID;
    @SerializedName("title")
    private String title;
    @SerializedName("date")
    private String date;
    @SerializedName("text")
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
    public void setNewsID(int id) {this.newsID = id; }
    public void setOwnerID(int id) {this.ownerID = id;}
    public void setTitle(String s) {this.title = s;}
    public void setDate(String s) {this.date = s;}
    public void setText(String s) {this.text = s;}

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        News news = (News)o;
        return Objects.equals(name, news.name) && Objects.equals(newsID, news.newsID);
    }

    @Override
    public int hashCode(){
        return Objects.hash(name);
    }

}
