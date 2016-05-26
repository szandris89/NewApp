package com.news.tnde.newapp.network;

import java.util.List;

//import com.mtomoskozi.sugarapp.model.Person;
import com.news.tnde.newapp.model.News;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * Created by mobsoft on 2016. 05. 02..
 */
public interface NewsApi {
    /**
     *
     *
     * @return Call<List<News>>
     */
    @GET("news")
    Call<List<News>> newsGet();

    /**
     *
     *
     * @param data
     * @return Call<Void>
     */

    @GET("news/add/{data}")
    Call<Void> newsAddDataGet(
            @Path("data") String data
    );
}

