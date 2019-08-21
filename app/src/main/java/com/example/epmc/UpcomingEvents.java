package com.example.epmc;

import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Color;
import android.media.Image;
import android.media.MediaPlayer;
import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class UpcomingEvents extends AppCompatActivity {
    boolean playing = false;
    ImageButton play;
    ImageButton pause;
    ImageButton stop;
    ImageButton youbible;
    ImageButton childbible;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upcoming_events);
        play = (ImageButton) findViewById(R.id.imageButton15);
        pause = (ImageButton) findViewById(R.id.imageButton16);
        stop = (ImageButton) findViewById(R.id.imageButton17);
        youbible = (ImageButton) findViewById(R.id.imageButton18);
        childbible = (ImageButton) findViewById(R.id.imageButton20);
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
    public void btyoubible(View view)
    {
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.sirma.mobile.bible.android"));
        intent.setPackage("com.sirma.mobile.bible.android");
        try {
            startActivity(intent);
        } catch (ActivityNotFoundException ex) {
            try {
                Intent unrestrictedIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.sirma.mobile.bible.android"));
                startActivity(unrestrictedIntent);
            } catch (ActivityNotFoundException innerEx) {
                Toast.makeText(this, "Please install the YouVersion Bible app", Toast.LENGTH_LONG).show();
            }
        }
    }
    public void btchildbible(View view)
    {
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.bible.kids"));
        intent.setPackage("com.bible.kids");
        try {
            startActivity(intent);
        } catch (ActivityNotFoundException ex) {
            try {
                Intent unrestrictedIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.bible.kids"));
                startActivity(unrestrictedIntent);
            } catch (ActivityNotFoundException innerEx) {
                Toast.makeText(this, "Please install the Bible app for kids", Toast.LENGTH_LONG).show();
            }
        }
    }
}
