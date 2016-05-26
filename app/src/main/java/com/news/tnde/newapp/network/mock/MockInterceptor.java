package com.news.tnde.newapp.network.mock;

import android.net.Uri;
import android.util.Log;

import com.news.tnde.newapp.network.NetworkConfig;

import java.io.IOException;

import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by mobsoft on 2016. 05. 02..
 */

import static com.news.tnde.newapp.network.mock.MockHelper.makeResponse;


public class MockInterceptor implements Interceptor {

    @Override
    public Response intercept(Chain chain) throws IOException {
        return process(chain.request());
    }

    public Response process(Request request) {

        Uri uri = Uri.parse(request.url().toString());

        Log.d("Test Http Client", "URL call: " + uri.toString());
        Headers headers = request.headers();

        if (uri.getPath().startsWith(NetworkConfig.ENDPOINT_PREFIX + "news")) {
            return PeopleMock.process(request);
        } else if (uri.getPath().startsWith(NetworkConfig.ENDPOINT_PREFIX + "news/add")) {
            return NewsMock.process(request);
        } else {
            return makeResponse(request, headers, 404, "Unknown");
        }
    }
}