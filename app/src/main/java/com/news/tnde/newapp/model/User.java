package com.news.tnde.newapp.model;

//package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.orm.SugarRecord;

import com.google.gson.annotations.SerializedName;


/**
 * Created by mobsoft on 2016. 04. 18..
 */
@ApiModel(description = "")
public class User extends SugarRecord {
    // Generalt kod:
    @SerializedName("id")
    private Integer id = null;

    @SerializedName("userName")
    private String userName = null;

    @SerializedName("userPassword")
    private String userPassword = null;



    /**
     **/
    @ApiModelProperty(value = "")
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public String getUserPassword() {
        return userPassword;
    }
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(id, user.id) &&
                Objects.equals(userName, user.userName) &&
                Objects.equals(userPassword, user.userPassword);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userName, userPassword);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class User {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    userPassword: ").append(toIndentedString(userPassword)).append("\n");
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



/*
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
*/

}
