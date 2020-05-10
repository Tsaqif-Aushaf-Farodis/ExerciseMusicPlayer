package com.example.exercisemusicplayer;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.MediaController;

public class MusicController extends MediaController {
    public MusicController(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public void hide(){}
}
