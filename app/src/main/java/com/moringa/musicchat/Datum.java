
package com.moringa.musicchat;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Datum {

    @SerializedName("id")
    @Expose
    public Integer id;
    @SerializedName("readable")
    @Expose
    public Boolean readable;
    @SerializedName("title")
    @Expose
    public String title;
    @SerializedName("title_short")
    @Expose
    public String titleShort;
    @SerializedName("title_version")
    @Expose
    public String titleVersion;
    @SerializedName("link")
    @Expose
    public String link;
    @SerializedName("duration")
    @Expose
    public Integer duration;
    @SerializedName("rank")
    @Expose
    public Integer rank;
    @SerializedName("explicit_lyrics")
    @Expose
    public Boolean explicitLyrics;
    @SerializedName("explicit_content_lyrics")
    @Expose
    public Integer explicitContentLyrics;
    @SerializedName("explicit_content_cover")
    @Expose
    public Integer explicitContentCover;
    @SerializedName("preview")
    @Expose
    public String preview;
    @SerializedName("md5_image")
    @Expose
    public String md5Image;
    @SerializedName("artist")
    @Expose
    public Artist artist;
    @SerializedName("album")
    @Expose
    public Album album;
    @SerializedName("type")
    @Expose
    public String type;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Datum() {
    }

    /**
     * 
     * @param readable
     * @param preview
     * @param artist
     * @param album
     * @param explicitContentLyrics
     * @param link
     * @param md5Image
     * @param title
     * @param type
     * @param duration
     * @param titleVersion
     * @param rank
     * @param titleShort
     * @param explicitLyrics
     * @param id
     * @param explicitContentCover
     */
    public Datum(Integer id, Boolean readable, String title, String titleShort, String titleVersion, String link, Integer duration, Integer rank, Boolean explicitLyrics, Integer explicitContentLyrics, Integer explicitContentCover, String preview, String md5Image, Artist artist, Album album, String type) {
        super();
        this.id = id;
        this.readable = readable;
        this.title = title;
        this.titleShort = titleShort;
        this.titleVersion = titleVersion;
        this.link = link;
        this.duration = duration;
        this.rank = rank;
        this.explicitLyrics = explicitLyrics;
        this.explicitContentLyrics = explicitContentLyrics;
        this.explicitContentCover = explicitContentCover;
        this.preview = preview;
        this.md5Image = md5Image;
        this.artist = artist;
        this.album = album;
        this.type = type;
    }

}
