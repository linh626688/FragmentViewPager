package com.helix.admin.fragmentviewpager.retrofitdemo.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by HaiLS on 17/09/2017.
 */

public class GoogleApiModel implements Serializable {
    @SerializedName("kind")
    private String kind;
    @SerializedName("etag")
    private String etag;
    @SerializedName("nextPageToken")
    private String nextPageToken;
    @SerializedName("pageInfo")
    private PageInfo pageInfo;
    @SerializedName("items")
    private ArrayList<Video> videos;

    public GoogleApiModel() {
    }

    @Override
    public String toString() {
        return "GoogleApiModel{" +
                "kind='" + kind + '\'' +
                ", etag='" + etag + '\'' +
                ", nextPageToken='" + nextPageToken + '\'' +
                ", pageInfo=" + pageInfo +
                ", videos=" + videos +
                '}';
    }
}
