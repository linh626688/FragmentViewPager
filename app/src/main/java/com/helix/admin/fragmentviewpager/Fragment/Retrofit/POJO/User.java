package com.helix.admin.fragmentviewpager.Fragment.Retrofit.POJO;

import com.google.gson.annotations.SerializedName;

/**
 * Created by admin on 09/10/2017.
 */

public class User extends Object{
    @SerializedName("name")
    public String name;
    @SerializedName("job")
    public String job;
    @SerializedName("id")
    public String id;
    @SerializedName("createdAt")
    public String createdAt;

    public User(String name, String job) {
        this.name = name;
        this.job = job;
    }

}
