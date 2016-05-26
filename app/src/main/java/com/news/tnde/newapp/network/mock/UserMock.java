package com.news.tnde.newapp.network.mock;
import android.net.Uri;

import com.news.tnde.newapp.model.User;
import com.news.tnde.newapp.network.GsonHelper;
import com.news.tnde.newapp.network.NetworkConfig;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by Tünde on 2016.05.26..
 */
public class UserMock {

    static List<User> userList = new ArrayList<User>();
    static boolean isInitialised = false;

    public static User testU1 = new User(0,"username1","userpw1","networkusertest1");
    public static User testU2 = new User(1,"username2","userpw2","networkusertest2");

    public static Response process(Request request) {
        Uri uri = Uri.parse(request.url().toString());

        String responseString;
        int responseCode;
        Headers headers = request.headers();

        if (uri.getPath().equals(NetworkConfig.ENDPOINT_PREFIX + "user") && request.method().equals("GET")) {
            if (!isInitialised) {
                userList.add(testU1);
                userList.add(testU2);
                isInitialised = true;
            }
            responseString = GsonHelper.getGson().toJson(peopleList);
            responseCode = 200;
        } else if (uri.getPath().startsWith(NetworkConfig.ENDPOINT_PREFIX + "user/add") && request.method().equals("GET")) {
            int startOfData = uri.getPath().lastIndexOf('/');
            String name = uri.getPath().substring(startOfData + 1);
            UserList.add(new User(0,name, name, name));

            responseString = "";
            responseCode = 200;
        } else {
            responseString = "ERROR";
            responseCode = 503;
        }

        return MockHelper.makeResponse(request, headers, responseCode, responseString);
    }

    public static void resetList() {
        userList.clear();
        isInitialised = false;
    }
}

