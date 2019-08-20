package com.example.epmc;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class UpcomingEvents extends AppCompatActivity {
    boolean playing = false;
    ImageButton play;
    ImageButton pause;
    ImageButton stop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upcoming_events);
        play = (ImageButton) findViewById(R.id.imageButton15);
        pause = (ImageButton) findViewById(R.id.imageButton16);
        stop = (ImageButton) findViewById(R.id.imageButton17);
        final MediaPlayer
                mp = MediaPlayer.create(getBaseContext(),R.raw.appaudio);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!playing) {
                    mp.start();
                    playing=true;
                    ProgressDialog pds = new ProgressDialog(UpcomingEvents.this);
                    pds.setProgressStyle(ProgressDialog.STYLE_SPINNER);
                    pds.setMessage("Playing sermon");
                    pds.setIndeterminate(true);
                    pds.setCancelable(true);
                    pds.show();
                }
            }
        });
        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(playing){
                    mp.pause();
                    playing=false;
                }
            }
        });
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (playing) {
                    mp.stop();
                    playing = false;
                }
            }
        });
    }
}
