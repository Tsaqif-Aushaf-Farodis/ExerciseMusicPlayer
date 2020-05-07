package com.example.exercisemusicplayer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

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
        return null;
    }
}
