package com.moringa.musicchat;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;

public class MusicListActivity extends AppCompatActivity {
    @BindView(R.id.musicTextView) TextView mMusicTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_list);

        ButterKnife.bind(this);
        //gathering information from the home activity
        Intent intent = getIntent();
        String artist = intent.getStringExtra("artist");
        mMusicTextView.setText("Here are all music of: " + artist);

        //Making a request to the Api
        MusicApi client = MusicClient.getClient();

        Call<DeezerMusicSearchResponse> call = client.getMusic(artist);
    }
}