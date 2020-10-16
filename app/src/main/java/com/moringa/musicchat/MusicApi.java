package com.moringa.musicchat;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MusicApi {
    @GET("search?q=artist:")
    Call<DeezerMusicSearchResponse> getMusic(
            @Query("artist") String artist,
            @Query("term")  String term
    );
}
