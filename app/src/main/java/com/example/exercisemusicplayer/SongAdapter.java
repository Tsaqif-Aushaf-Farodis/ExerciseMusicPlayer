package com.example.exercisemusicplayer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends BaseAdapter {
    private ArrayList<song> songs;
    private LayoutInflater songInflater;

    public SongAdapter(Context context, ArrayList<song> theSongs){
        songs=theSongs;
        songInflater=LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return songs.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //map to song layout
        LinearLayout songLay = (LinearLayout)songInflater.inflate
                (R.layout.activity_song, parent, false);
        //get title and artist views
        TextView songView = (TextView)songLay.findViewById(R.id.song_title);
        TextView artistView = (TextView)songLay.findViewById(R.id.song_artist);
        //get song using position
        song currSong = songs.get(position);
        //get title and artist strings
        songView.setText(currSong.get_Title());
        artistView.setText(currSong.get_Artist());
        //set position as tag
        songLay.setTag(position);
        return songLay;
    }
}
