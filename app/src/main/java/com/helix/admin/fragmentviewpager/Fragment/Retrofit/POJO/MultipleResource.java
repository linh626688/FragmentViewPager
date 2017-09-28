package com.helix.admin.fragmentviewpager.Fragment.Retrofit.POJO;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by admin on 09/10/2017.
 */
public class MultipleResource extends Object{
    @SerializedName("page")
    public Integer page;
    @SerializedName("per_page")
    public Integer perPage;
    @SerializedName("total")
    public Integer total;
    @SerializedName("total_pages")
    public Integer totalPages;
    @SerializedName("data")
    public List data = null;

    public class Datum extends Object {

        @SerializedName("id")
        public Integer id;
        @SerializedName("name")
        public String name;
        @SerializedName("year")
        public Integer year;
        @SerializedName("pantone_value")
        public String pantoneValue;

    }
}
