package com.moringa.musicchat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener{
    @BindView(R.id.searchMusicButton) Button mSearchMusicButton;
    @BindView(R.id.searchMusicText) EditText mSearchMusicText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ButterKnife.bind(this);

        //set search button on clickListener
        mSearchMusicButton.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if(v == mSearchMusicButton){
            String artist = mSearchMusicText.getText().toString();
            Intent intent = new Intent(HomeActivity.this, MusicListActivity.class);
            intent.putExtra("artists", artist);
            startActivity(intent);
        }
    }
}