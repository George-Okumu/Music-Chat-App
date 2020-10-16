
package com.moringa.musicchat;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Album {

    @SerializedName("id")
    @Expose
    public Integer id;
    @SerializedName("title")
    @Expose
    public String title;
    @SerializedName("cover")
    @Expose
    public String cover;
    @SerializedName("cover_small")
    @Expose
    public String coverSmall;
    @SerializedName("cover_medium")
    @Expose
    public String coverMedium;
    @SerializedName("cover_big")
    @Expose
    public String coverBig;
    @SerializedName("cover_xl")
    @Expose
    public String coverXl;
    @SerializedName("md5_image")
    @Expose
    public String md5Image;
    @SerializedName("tracklist")
    @Expose
    public String tracklist;
    @SerializedName("type")
    @Expose
    public String type;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Album() {
    }

    /**
     * 
     * @param cover
     * @param coverSmall
     * @param coverBig
     * @param tracklist
     * @param coverMedium
     * @param coverXl
     * @param md5Image
     * @param id
     * @param title
     * @param type
     */
    public Album(Integer id, String title, String cover, String coverSmall, String coverMedium, String coverBig, String coverXl, String md5Image, String tracklist, String type) {
        super();
        this.id = id;
        this.title = title;
        this.cover = cover;
        this.coverSmall = coverSmall;
        this.coverMedium = coverMedium;
        this.coverBig = coverBig;
        this.coverXl = coverXl;
        this.md5Image = md5Image;
        this.tracklist = tracklist;
        this.type = type;
    }

}
