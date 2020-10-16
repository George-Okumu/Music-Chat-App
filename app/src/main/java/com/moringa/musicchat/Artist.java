
package com.moringa.musicchat;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Artist {

    @SerializedName("id")
    @Expose
    public Integer id;
    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("link")
    @Expose
    public String link;
    @SerializedName("picture")
    @Expose
    public String picture;
    @SerializedName("picture_small")
    @Expose
    public String pictureSmall;
    @SerializedName("picture_medium")
    @Expose
    public String pictureMedium;
    @SerializedName("picture_big")
    @Expose
    public String pictureBig;
    @SerializedName("picture_xl")
    @Expose
    public String pictureXl;
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
    public Artist() {
    }

    /**
     * 
     * @param tracklist
     * @param pictureBig
     * @param pictureSmall
     * @param name
     * @param link
     * @param id
     * @param type
     * @param picture
     * @param pictureMedium
     * @param pictureXl
     */
    public Artist(Integer id, String name, String link, String picture, String pictureSmall, String pictureMedium, String pictureBig, String pictureXl, String tracklist, String type) {
        super();
        this.id = id;
        this.name = name;
        this.link = link;
        this.picture = picture;
        this.pictureSmall = pictureSmall;
        this.pictureMedium = pictureMedium;
        this.pictureBig = pictureBig;
        this.pictureXl = pictureXl;
        this.tracklist = tracklist;
        this.type = type;
    }

}
