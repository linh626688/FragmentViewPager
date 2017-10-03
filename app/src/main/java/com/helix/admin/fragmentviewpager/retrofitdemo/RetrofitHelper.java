package com.helix.admin.fragmentviewpager.retrofitdemo;


import com.helix.admin.fragmentviewpager.retrofitdemo.model.GoogleApiModel;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by HaiLS on 17/09/2017.
 */

public class RetrofitHelper {
    private static final String BASE_URL = "https://www.googleapis.com/youtube/v3/";

    public static final Retrofit VIDEO = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    public static Call<GoogleApiModel> getVideo() {
        return VIDEO.create(YoutubeService.class).getVideo();
    }
}
