package com.news.tnde.newapp.network.mock;

import android.net.Uri;
/*
import com.mtomoskozi.sugarapp.model.Person;
import com.mtomoskozi.sugarapp.network.GsonHelper;
import com.mtomoskozi.sugarapp.network.NetworkConfig;*/

import com.news.tnde.newapp.model.News;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
/**
 * Created by mobsoft on 2016. 05. 02..
 */

public class NewsMock {

    static List<News> newsList = new ArrayList<>();
    static boolean isInitialised = false;

    public static News testN1 = new News(0,0,"title1","2016","text1");
    public static News testN2 = new News(1,0,"title2","2016","text2");

    public static Response process(Request request) {
        Uri uri = Uri.parse(request.url().toString());

        String responseString;
        int responseCode;
        Headers headers = request.headers();

        if (uri.getPath().equals(NetworkConfig.ENDPOINT_PREFIX + "people") && request.method().equals("GET")) {
            if (!isInitialised) {
                newsList.add(testN1);
                newsList.add(testN2);
                isInitialised = true;
            }
            responseString = GsonHelper.getGson().toJson(peopleList);
            responseCode = 200;
        } else if (uri.getPath().startsWith(NetworkConfig.ENDPOINT_PREFIX + "people/add") && request.method().equals("GET")) {
            int startOfData = uri.getPath().lastIndexOf('/');
            String name = uri.getPath().substring(startOfData + 1);
            newsList.add(new News(2,1,name, name, name));

            responseString = "";
            responseCode = 200;
        } else {
            responseString = "ERROR";
            responseCode = 503;
        }

        return MockHelper.makeResponse(request, headers, responseCode, responseString);
    }

    public static void resetList() {
        newsList.clear();
        isInitialised = false;
    }
}