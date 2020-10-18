
package com.moringa.musicchat;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Artist {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("link")
    @Expose
    private String link;
    @SerializedName("picture")
    @Expose
    private String picture;
    @SerializedName("picture_small")
    @Expose
    private String pictureSmall;
    @SerializedName("picture_medium")
    @Expose
    private String pictureMedium;
    @SerializedName("picture_big")
    @Expose
    private String pictureBig;
    @SerializedName("picture_xl")
    @Expose
    private String pictureXl;
    @SerializedName("tracklist")
    @Expose
    private String tracklist;
    @SerializedName("type")
    @Expose
    private String type;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getPictureSmall() {
        return pictureSmall;
    }

    public void setPictureSmall(String pictureSmall) {
        this.pictureSmall = pictureSmall;
    }

    public String getPictureMedium() {
        return pictureMedium;
    }

    public void setPictureMedium(String pictureMedium) {
        this.pictureMedium = pictureMedium;
    }

    public String getPictureBig() {
        return pictureBig;
    }

    public void setPictureBig(String pictureBig) {
        this.pictureBig = pictureBig;
    }

    public String getPictureXl() {
        return pictureXl;
    }

    public void setPictureXl(String pictureXl) {
        this.pictureXl = pictureXl;
    }

    public String getTracklist() {
        return tracklist;
    }

    public void setTracklist(String tracklist) {
        this.tracklist = tracklist;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
