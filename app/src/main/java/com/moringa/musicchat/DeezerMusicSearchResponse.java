
package com.moringa.musicchat;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DeezerMusicSearchResponse {

    @SerializedName("data")
    @Expose
    private List<Datum> data = null;
    @SerializedName("total")
    @Expose
    private Integer total;

    /**
     * No args constructor for use in serialization
     * 
     */
    public DeezerMusicSearchResponse() {
    }

    /**
     * 
     * @param total
     * @param data
     */
    public DeezerMusicSearchResponse(List<Datum> data, Integer total) {
        super();
        this.data = data;
        this.total = total;
    }

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

}
