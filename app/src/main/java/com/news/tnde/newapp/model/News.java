package com.news.tnde.newapp.model;
import java.util.Date;

/**
 * Created by mobsoft on 2016. 04. 18..
 */
public class News {
    private int newsID;
    private int ownerID;
    private String title;
    private String date;
    private String text;

    public News(int id, int oid, String ti, String d, String te){
        newsID = id; ownerID = oid; title = ti; date = d; text = te;
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

}
