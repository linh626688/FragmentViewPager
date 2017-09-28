package com.helix.admin.fragmentviewpager.Fragment.Retrofit.POJO;

import com.google.gson.annotations.SerializedName;

/**
 * Created by admin on 09/10/2017.
 */

public class CreateUserResponse extends Object {
    @SerializedName("name")
    public String name;
    @SerializedName("job")
    public String job;
    @SerializedName("id")
    public String id;
    @SerializedName("createdAt")
    public String createdAt;
}
