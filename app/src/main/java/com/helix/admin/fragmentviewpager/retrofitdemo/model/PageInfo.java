package com.helix.admin.fragmentviewpager.retrofitdemo.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by HaiLS on 17/09/2017.
 */

public class PageInfo {
    @SerializedName("totalResults")
    private int totalResults;
    @SerializedName("resultsPerPage")
    private int resultsPerPage;

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public int getResultsPerPage() {
        return resultsPerPage;
    }

    public void setResultsPerPage(int resultsPerPage) {
        this.resultsPerPage = resultsPerPage;
    }

    @Override
    public String toString() {
        return "PageInfo{" +
                "totalResults=" + totalResults +
                ", resultsPerPage=" + resultsPerPage +
                '}';
    }
}
