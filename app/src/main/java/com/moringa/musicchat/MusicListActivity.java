package com.moringa.musicchat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.moringa.musicchat.adapters.MusicListAdapter;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MusicListActivity extends AppCompatActivity {

  private static final String TAG = MusicListActivity.class.getSimpleName();

  @BindView(R.id.recycler_View) RecyclerView mRecyclerView;
  private MusicListAdapter mAdapter;
  public List<Datum> data;

//    @BindView(R.id.musicTextView) TextView mMusicTextView;
//    //Declaring list of Datum from DeezerMusicResponse class
//    @BindView(R.id.listView) ListView mListView;

    //for progress and error
    @BindView(R.id.errorTextView) TextView mErrorTextView;
    @BindView(R.id.progressBar) ProgressBar mProgressBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_list);

        ButterKnife.bind(this);


//        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, restaurants);
//        mListView.setAdapter(adapter);

        //gathering information from the home activity
        Intent intent = getIntent();
        String artist = intent.getStringExtra("artists");


        MusicApi client = MusicClient.getClient();

        Call<DeezerMusicSearchResponse> call = client.getMusic(artist);

        call.enqueue(new Callback<DeezerMusicSearchResponse>() {
            @Override
            public void onResponse(Call<DeezerMusicSearchResponse> call, Response<DeezerMusicSearchResponse> response) {
                hideProgressBar();
                if(response.isSuccessful()){
                    data = response.body().getData();
                    mAdapter = new MusicListAdapter(MusicListActivity.this, data);
                    mRecyclerView.setAdapter(mAdapter);
                    RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MusicListActivity.this);
                    mRecyclerView.setLayoutManager(layoutManager);
                    Log.d(TAG, "onResponse: " + mAdapter);
                    //Setting the recycle view height/width the same
                    mRecyclerView.setHasFixedSize(true);

                    showSearchResponse();
                }else{
                    showUnsuccessfulMessage();
                }

            }

            @Override
            public void onFailure(Call<DeezerMusicSearchResponse> call, Throwable t) {
                hideProgressBar();
                showFailureMessage();
            }
        });

    }
    private void showFailureMessage() {
        mErrorTextView.setText("Something went wrong. Please check your Internet connection and try again later");
        mErrorTextView.setVisibility(View.VISIBLE);
    }

    private void showUnsuccessfulMessage() {
        mErrorTextView.setText("Something went wrong. Please try again later");
        mErrorTextView.setVisibility(View.VISIBLE);
    }

    private void showSearchResponse() {

        mRecyclerView.setVisibility(View.VISIBLE);
    }

    private void hideProgressBar() {
        mProgressBar.setVisibility(View.GONE);
    }
}