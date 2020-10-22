package com.moringa.musicchat;

import com.moringa.musicchat.DeezerMusicSearchResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MusicApi {
    @GET("search?q=King Kaka:")
    Call<DeezerMusicSearchResponse> getMusic(
            @Query("artists") String artist
    );
}
