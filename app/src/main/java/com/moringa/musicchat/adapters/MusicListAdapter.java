package com.moringa.musicchat.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.moringa.musicchat.R;
import com.moringa.musicchat.Datum;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MusicListAdapter extends RecyclerView.Adapter<MusicListAdapter.DataViewHolder> {
    private List<Datum> mData;
    private Context mContext;

    public MusicListAdapter(Context context, List<Datum> data) {
        mContext = context;
        mData = data;
    }

    @NonNull
    @Override
    public MusicListAdapter.DataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_music_list_details, parent, false);
        DataViewHolder  viewHolder = new DataViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull DataViewHolder holder, int position) {
        holder.bindMusic(mData.get(position));

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class DataViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.artistsNameTextView) TextView mArtistNameTextView;

        private Context mContext;

        public DataViewHolder(View itemView){
            super(itemView);
            ButterKnife.bind(this, itemView);
            mContext = itemView.getContext();
        }

        public void bindMusic (Datum gettingArtist){
            mArtistNameTextView.setText(gettingArtist.getTitle());

        }

    }


}
