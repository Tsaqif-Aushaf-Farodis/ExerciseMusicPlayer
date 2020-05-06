package com.example.exercisemusicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class song extends AppCompatActivity {
    private long id;
    private String title;
    private String artis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song);
    }

    public song(long songID, String songTitle, String songArtis){
        id=songID;
        title=songTitle;
        artis=songArtis;
    }

    public long get_ID(){return id;}
    public String get_Title(){return title;}
    public String get_Artist(){return artis;}
}
