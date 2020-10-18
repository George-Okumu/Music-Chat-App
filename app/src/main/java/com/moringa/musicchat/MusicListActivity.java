package com.moringa.musicchat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MusicListActivity extends AppCompatActivity {
    private TextView mMusicTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_list);
        //gathering information from the home activity
        Intent intent = getIntent();
        String artist = intent.getStringExtra("artist");
        mMusicTextView.setText("Here are all music of: " + artist);
    }
}