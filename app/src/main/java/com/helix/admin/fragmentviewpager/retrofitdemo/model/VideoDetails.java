package com.helix.admin.fragmentviewpager.retrofitdemo.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by HaiLS on 17/09/2017.
 */

public class VideoDetails {
    @SerializedName("duration")
    private String duration;
    @SerializedName("dimension")
    private String dimension;
    @SerializedName("definition")
    private String definition;
    @SerializedName("caption")
    private String caption;
    @SerializedName("licensedContent")
    private boolean licensedContent;
    @SerializedName("projection")
    private String projection;

    @Override
    public String toString() {
        return "VideoDetails{" +
                "duration='" + duration + '\'' +
                ", dimension='" + dimension + '\'' +
                ", definition='" + definition + '\'' +
                ", caption='" + caption + '\'' +
                ", licensedContent='" + licensedContent + '\'' +
                ", projection='" + projection + '\'' +
                '}';
    }
}
