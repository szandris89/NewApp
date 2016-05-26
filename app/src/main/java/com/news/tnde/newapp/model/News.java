package com.news.tnde.newapp.model;

//package io.swagger.client.model;

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
@ApiModel(description = "")
public class News extends SugarRecord {

    @SerializedName("newsId")
    private int newsId=null;
    @SerializedName("ownerId")
    private int ownerId=null;
    @SerializedName("title")
    private String title=null;
    @SerializedName("date")
    private String date=null;
    @SerializedName("text")
    private String text=null;

    @SerializedName("name")
    private String name = null;

    public News(){name = "Default";}

    public News(int id, int oid, String ti, String d, String te){
        newsId = id; ownerId = oid; title = ti; date = d; text = te;
        name = "Default";
    }

    public News(int id, int oid, String ti, String d, String te, String name){
        newsId = id; ownerId = oid; title = ti; date = d; text = te;
        this.name = name;
    }

    /*public int getNewsID(){
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
    }*/

    // Generalt kod:
    /**
     **/
    @ApiModelProperty(value = "")
    public Integer getNewsId() {
        return newsId;
    }
    public void setNewsId(Integer newsId) {
        this.newsId = newsId;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public Integer getOwnerId() {
        return ownerId;
    }
    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        News news = (News) o;
        return Objects.equals(newsId, news.newsId) &&
                Objects.equals(ownerId, news.ownerId) &&
                Objects.equals(title, news.title) &&
                Objects.equals(date, news.date) &&
                Objects.equals(text, news.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(newsId, ownerId, title, date, text);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class News {\n");

        sb.append("    newsId: ").append(toIndentedString(newsId)).append("\n");
        sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
        sb.append("    text: ").append(toIndentedString(text)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
