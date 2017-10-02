package com.helix.admin.fragmentviewpager.retrofitdemo.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by HaiLS on 17/09/2017.
 */

public class Video {
    @SerializedName("kind")
    private String kind;
    @SerializedName("etag")
    private String etag;
    @SerializedName("id")
    private String id;
    @SerializedName("contentDetails")
    private VideoDetails videoDetails;

    @Override
    public String toString() {
        return "Video{" +
                "kind='" + kind + '\'' +
                ", etag='" + etag + '\'' +
                ", id='" + id + '\'' +
                ", videoDetails=" + videoDetails +
                '}';
    }
}
