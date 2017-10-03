package com.helix.admin.fragmentviewpager.retrofitdemo;


import com.helix.admin.fragmentviewpager.retrofitdemo.model.GoogleApiModel;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by HaiLS on 17/09/2017.
 */

public interface YoutubeService {
    //  @GET("video) dang nhe chi co the nay thoi may cai kia custom de truyen vao
    @GET("videos?part=contentDetails&chart=mostPopular&regionCode=VN&maxResults=25&key=AIzaSyD4Mb3dc6aVhbmES4WrMNfgtA4VV4ncGi4")
    Call<GoogleApiModel> getVideo();
}
