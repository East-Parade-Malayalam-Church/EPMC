package com.example.epmc;

import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.concurrent.TimeUnit;


public class UpcomingEvents extends AppCompatActivity {
    boolean playing = false;
    private MediaPlayer mp;

    ImageButton play;
    ImageButton pause;
    ImageButton stop;
    ImageButton forward;
    ImageButton rewind;
    ImageButton youbible;
    ImageButton childbible;
    ImageView iv;
    private double startTime = 0;
    private double finalTime = 0;
    private Handler myHandler = new Handler();
    private int forwardTime = 5000;
    private int backwardTime = 5000;
    private SeekBar seekbar;
    private TextView tx1;
    private TextView tx2;
    private TextView tx3;
    public static int oneTimeOnly = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upcoming_events);
        play = findViewById(R.id.imageButton15);
        pause = findViewById(R.id.imageButton16);
        stop = findViewById(R.id.imageButton17);
        youbible = findViewById(R.id.imageButton18);
        childbible = findViewById(R.id.imageButton20);
        forward = findViewById(R.id.imageButton21);
        rewind = findViewById(R.id.imageButton22);
        tx1 = findViewById(R.id.textView99);
        tx2 = findViewById(R.id.textView97);
        tx3 = findViewById(R.id.textView98);
        seekbar = findViewById(R.id.seekBar);
        seekbar.setClickable(false);
        pause.setEnabled(false);
        mp = MediaPlayer.create(this,R.raw.vijiachen);


        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!playing) {
                    mp.start();
                    playing = true;
                    finalTime = mp.getDuration();
                    startTime = mp.getCurrentPosition();

                    if (oneTimeOnly == 0) {
                        seekbar.setMax((int) finalTime);
                        oneTimeOnly = 1;
                    }

                    tx2.setText(String.format("%d min, %d sec",
                            TimeUnit.MILLISECONDS.toMinutes((long) finalTime),
                            TimeUnit.MILLISECONDS.toSeconds((long) finalTime) -
                                    TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes((long) finalTime)))
                    );

                    tx3.setText(String.format("%d min, %d sec",
                            TimeUnit.MILLISECONDS.toMinutes((long) startTime),
                            TimeUnit.MILLISECONDS.toSeconds((long) startTime) -
                                    TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes((long) startTime)))
                    );

                    seekbar.setProgress((int) startTime);
                    myHandler.postDelayed(UpdateSongTime, 100);
                    pause.setEnabled(true);
                    rewind.setEnabled(false);

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
                if (playing) {
                    Toast.makeText(getApplicationContext(), "Pausing Sermon", Toast.LENGTH_SHORT).show();
                    mp.pause();
                    pause.setEnabled(false);
                    rewind.setEnabled(true);
                    playing = false;
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
        forward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int temp = (int) startTime;

                if ((temp + forwardTime) <= finalTime) {
                    startTime = startTime + forwardTime;
                    mp.seekTo((int) startTime);
                    Toast.makeText(getApplicationContext(), "You have Jumped forward 5 seconds", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Cannot jump forward 5 seconds", Toast.LENGTH_SHORT).show();
                }
            }
        });
        rewind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int temp = (int) startTime;

                if ((temp - backwardTime) > 0) {
                    startTime = startTime - backwardTime;
                    mp.seekTo((int) startTime);
                    Toast.makeText(getApplicationContext(), "You have Jumped backward 5 seconds", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Cannot jump backward 5  seconds", Toast.LENGTH_SHORT).show();

                }
            }
        });
    }
    private Runnable UpdateSongTime = new Runnable() {
        public void run() {
            startTime = mp.getCurrentPosition();
            tx1.setText(String.format("%d min, %d sec",
                    TimeUnit.MILLISECONDS.toMinutes((long) startTime),
                    TimeUnit.MILLISECONDS.toSeconds((long) startTime) -
                            TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.
                                    toMinutes((long) startTime)))
            );
            seekbar.setProgress((int) startTime);
            myHandler.postDelayed(this, 100);
        }
    };

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