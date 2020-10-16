
package com.moringa.musicchat;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DeezerMusicSearchResponse {

    @SerializedName("data")
    @Expose
    public List<Datum> data = null;
    @SerializedName("total")
    @Expose
    public Integer total;
    @SerializedName("next")
    @Expose
    public String next;

    /**
     * No args constructor for use in serialization
     * 
     */
    public DeezerMusicSearchResponse() {
    }

    /**
     * 
     * @param next
     * @param total
     * @param data
     */
    public DeezerMusicSearchResponse(List<Datum> data, Integer total, String next) {
        super();
        this.data = data;
        this.total = total;
        this.next = next;
    }

}
