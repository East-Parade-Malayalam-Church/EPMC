package com.church.epmc;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Sermon extends AppCompatActivity {

    public static int oneTimeOnly = 0;
    final Global g = Global.getInstance();
    boolean playing = false;
    TextView done, rem;
    MediaPlayer mp;
    TextView ottv, pstv, eptv, gptv, sptv, dttv, tptv;
    private int forwardTime = 5000;
    private int backwardTime = 5000;
    private Handler myHandler = new Handler();
    private double startTime = 0;
    private double finalTime = 0;
    private Runnable UpdateSongTime = new Runnable() {
        public void run() {
            startTime = mp.getCurrentPosition();
            done.setText(String.format("%d:%d",
                    TimeUnit.MILLISECONDS.toMinutes((long) startTime),
                    TimeUnit.MILLISECONDS.toSeconds((long) startTime) -
                            TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.
                                    toMinutes((long) startTime)))
            );
            myHandler.postDelayed(this, 100);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sermon);

        ottv = findViewById(R.id.lesson1);
        pstv = findViewById(R.id.lesson2);
        eptv = findViewById(R.id.lesson3);
        gptv = findViewById(R.id.lesson4);
        sptv = findViewById(R.id.speaker);
        dttv = findViewById(R.id.date);
        tptv = findViewById(R.id.topic);
        String author = g.getAuthor();
        String date = g.getDate();
        String epistle = g.getEpistle();
        String gospel = g.getGospel();
        String ot = g.getOt();
        String psalms = g.getPsalms();
        String title = g.getTitle();
        String audio = g.getAudio();
        ottv.setText(ot);
        pstv.setText(psalms);
        eptv.setText(epistle);
        gptv.setText(gospel);
        sptv.setText(author);
        dttv.setText(date);
        tptv.setText(title);

        final ImageButton play =  findViewById(R.id.btn_play);
        final ImageButton pause = findViewById(R.id.btn_pause);
        final ImageButton fastfow = findViewById(R.id.btn_fastfow);
        final ImageButton rewind = findViewById(R.id.btn_rewind);
        final ImageButton stop = findViewById(R.id.btn_stop);

        final String url = audio;

        mp = new MediaPlayer();
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        try {
            mp.setDataSource(url);
            mp.prepare(); // might take long! (for buffering, etc)
        } catch (IOException e) {
            e.printStackTrace();
        }
        done = findViewById(R.id.done);
        rem = findViewById(R.id.rem);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!playing) {
                    mp.start();
                    playing = true;
                    finalTime = mp.getDuration();
                    startTime = mp.getCurrentPosition();
                    if (oneTimeOnly == 0) {
                        oneTimeOnly = 1;
                    }
                    done.setText(String.format("%d : %d ",
                            TimeUnit.MILLISECONDS.toMinutes((long) finalTime),
                            TimeUnit.MILLISECONDS.toSeconds((long) finalTime) -
                                    TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes((long) finalTime))));
                    rem.setText(String.format("%d:%d",
                            TimeUnit.MILLISECONDS.toMinutes((long) finalTime),
                            TimeUnit.MILLISECONDS.toSeconds((long) finalTime) -
                                    TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes((long) finalTime))));
                    myHandler.postDelayed(UpdateSongTime, 100);
                    pause.setEnabled(true);
                    rewind.setEnabled(false);
                    Snackbar snackbar = Snackbar.make(v,"Playing sermon",Snackbar.LENGTH_LONG);
                            snackbar.show();
                }
            }
        });
        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (playing) {
                    mp.pause();
                    Snackbar snackbar = Snackbar.make(v,"Pausing sermon",Snackbar.LENGTH_LONG);
                            snackbar.show();
                    pause.setEnabled(false);
                    rewind.setEnabled(true);
                    playing = false;
                }
            }
        });
        stop.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (playing) {
                    Snackbar snackbar = Snackbar.make(v,"Stopping sermon",Snackbar.LENGTH_LONG);
                    snackbar.show();
                    mp.stop();
                    mp.reset();
                    mp = new MediaPlayer();
                    mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                    try {
                        mp.setDataSource(url);
                        mp.prepare(); // might take long! (for buffering, etc)
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    playing = false;
                    startTime = 0;
                    finalTime = 0;
                    myHandler.postDelayed(UpdateSongTime,100);
                }

            }
        });
        fastfow.setOnClickListener(new View.OnClickListener() {
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
                    Toast.makeText(getApplicationContext(), "Cannot jump backward 5 seconds", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mp != null) {
            mp.stop();
        }
    }

    public void onBackPressed() {
        super.onBackPressed();
        // Write your code here
        mp.stop();
    }

    public void btbible(View v)
    {
        Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.sirma.mobile.bible.android");
        if (launchIntent != null) {
            startActivity(launchIntent);
        } else {
            Toast.makeText(Sermon.this, "Please install the YouVersion Bible app", Toast.LENGTH_LONG).show();
            Intent unrestrictedIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.sirma.mobile.bible.android"));
            startActivity(unrestrictedIntent);
        }
    }
}