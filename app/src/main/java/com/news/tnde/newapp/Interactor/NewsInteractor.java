package com.news.tnde.newapp.Interactor;
import com.mtomoskozi.sugarapp.android.SugarAppApplication;
import com.mtomoskozi.sugarapp.model.prod.PeopleDbModel;
import com.mtomoskozi.sugarapp.model.Person;
import com.mtomoskozi.sugarapp.network.PeopleApi;
import com.news.tnde.newapp.android.NewsApplication;
import com.news.tnde.newapp.model.News;
import com.news.tnde.newapp.model.prod.NewsDbModel;
import com.news.tnde.newapp.network.NewsApi;

import java.util.List;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Response;

/**
 * Created by mobsoft on 2016. 05. 02..
 */
public class NewsInteractor {
    @Inject
    NewsDbModel model;

    @Inject
    NewsApi newsApi;

    public NewsInteractor() {
        NewsApplication.injector.inject(this);
    }

    public void addNewsToDb(News toAdd) {
        model.insertNews(toAdd);
    }

    public void addNewsToNetwork(News toAdd) throws Exception {
        Response response = null;

        Call call = NewsApi.newsAddDataGet(toAdd.getName());
        try {
            response = call.execute();
        } catch (Exception e) {
            throw new Exception("Network error on execute with post!");
        }
        if (response.code() != 200) {
            throw new Exception("Network error with post!");
        }
    }

    public List<News> getPeopleFromDb() {
        return model.fetchNews();
    }

    public List<News> getNewsFromNetwork() throws Exception {
        Response<List<News>> response = null;

        Call<List<News>> call = newsApi.peopleGet();
        try {
            response = call.execute();
        } catch (Exception e) {
            throw new Exception("Network error on execute with get!");
        }
        if (response.code() != 200) {
            throw new Exception("Network error with get!");
        }

        return response.body();
    }
}

