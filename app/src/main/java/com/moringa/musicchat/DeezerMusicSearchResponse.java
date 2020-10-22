package com.moringa.musicchat;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DeezerMusicSearchResponse {

    @SerializedName("data")
    @Expose
    private List<Datum> data;
    @SerializedName("total")
    @Expose
    private int total;
    @SerializedName("next")
    @Expose
    private String next;

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
    public DeezerMusicSearchResponse(List<Datum> data, int total, String next) {
        super();
        this.data = data;
        this.total = total;
        this.next = next;
    }

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

}
