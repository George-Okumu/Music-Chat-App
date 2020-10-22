package com.moringa.musicchat.adapters;

import android.content.Context;
import android.widget.ArrayAdapter;

public class SongsArrayAdapter extends ArrayAdapter{
    private Context mContext;
    private String[] mArtists;

    public SongsArrayAdapter(Context mContext, int resource, String[] mArtists) {
        super(mContext, resource);
        this.mContext = mContext;
        this.mArtists = mArtists;
       // this.songs = songs;
    }

    @Override
    public Object getItem(int position) {

        String songs = mArtists[position];
      return String.format("%s \nSong", songs);

    }

    @Override
    public int getCount() {
       return  mArtists.length;
    }
}
