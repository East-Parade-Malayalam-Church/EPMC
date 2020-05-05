package com.example.epmc;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.bumptech.glide.Glide;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


public class UpcomingEvents extends AppCompatActivity {

    ProgressDialog progressBar;
    private Handler progressBarHandler = new Handler();

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    CardView cv1,cv2,cv3,cv4,cv5,cv6;
    TextView cv1tt1,cv1auth1,cv1dt1;
    TextView cv2tt2,cv2auth2,cv2dt2;
    TextView cv3tt3,cv3auth3,cv3dt3;
    TextView cv4tt4,cv4auth4,cv4dt4;
    TextView cv5tt5,cv5auth5,cv5dt5;
    TextView cv6tt6,cv6auth6,cv6dt6;
    ImageView iv1,iv2,iv3,iv4,iv5,iv6;

    DatabaseReference reff1=database.getReference().child("users").child("sermons").child("1");
    DatabaseReference reff2=database.getReference().child("users").child("sermons").child("2");
    DatabaseReference reff3=database.getReference().child("users").child("sermons").child("3");
    DatabaseReference reff4=database.getReference().child("users").child("sermons").child("4");
    DatabaseReference reff5=database.getReference().child("users").child("sermons").child("5");
    DatabaseReference reff6=database.getReference().child("users").child("sermons").child("6");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upcoming_events);
        cv1 = findViewById(R.id.cd1);
        cv2 = findViewById(R.id.cd2);
        cv3 = findViewById(R.id.cd3);
        cv4 = findViewById(R.id.cd4);
        cv5 = findViewById(R.id.cd5);
        cv6 = findViewById(R.id.cd6);
        cv1tt1 = findViewById(R.id.cv1tt1);
        cv1auth1 = findViewById(R.id.cv1auth1);
        cv1dt1 = findViewById(R.id.cv1dt1);
        cv2tt2 = findViewById(R.id.cv2tt2);
        cv2auth2 = findViewById(R.id.cv2auth2);
        cv2dt2 = findViewById(R.id.cv2dt2);
        cv3tt3 = findViewById(R.id.cv3tt3);
        cv3auth3 = findViewById(R.id.cv3auth3);
        cv3dt3 = findViewById(R.id.cv3dt3);
        cv4tt4 = findViewById(R.id.cv4tt4);
        cv4auth4 = findViewById(R.id.cv4auth4);
        cv4dt4 = findViewById(R.id.cv4dt4);
        cv5tt5 = findViewById(R.id.cv5tt5);
        cv5auth5 = findViewById(R.id.cv5auth5);
        cv5dt5 = findViewById(R.id.cv5dt5);
        cv6tt6 = findViewById(R.id.cv6tt6);
        cv6auth6 = findViewById(R.id.cv6auth6);
        cv6dt6 = findViewById(R.id.cv6dt6);
        iv1 = findViewById(R.id.cv1img1);
        iv2 = findViewById(R.id.cv2img2);
        iv3 = findViewById(R.id.cv3img3);
        iv4 = findViewById(R.id.cv4img4);
        iv5 = findViewById(R.id.cv5img5);
        iv6 = findViewById(R.id.cv6img6);

        reff1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String author = dataSnapshot.child("author").getValue().toString();
                String date = dataSnapshot.child("date").getValue().toString();
                String title = dataSnapshot.child("title").getValue().toString();
                String image = dataSnapshot.child("image").getValue().toString();
                cv1tt1.setText(title);
                cv1auth1.setText(author);
                cv1dt1.setText(date);
                Glide.with(getApplicationContext()).load(image).into(iv1);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });

        reff2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String author = dataSnapshot.child("author").getValue().toString();
                String date = dataSnapshot.child("date").getValue().toString();
                String title = dataSnapshot.child("title").getValue().toString();
                String image = dataSnapshot.child("image").getValue().toString();
                cv2tt2.setText(title);
                cv2auth2.setText(author);
                cv2dt2.setText(date);
                Glide.with(getApplicationContext()).load(image).into(iv2);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        reff3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String author = dataSnapshot.child("author").getValue().toString();
                String date = dataSnapshot.child("date").getValue().toString();
                String title = dataSnapshot.child("title").getValue().toString();
                String image = dataSnapshot.child("image").getValue().toString();
                cv3tt3.setText(title);
                cv3auth3.setText(author);
                cv3dt3.setText(date);
                Glide.with(getApplicationContext()).load(image).into(iv3);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        reff4.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String author = dataSnapshot.child("author").getValue().toString();
                String date = dataSnapshot.child("date").getValue().toString();
                String title = dataSnapshot.child("title").getValue().toString();
                String image = dataSnapshot.child("image").getValue().toString();
                cv4tt4.setText(title);
                cv4auth4.setText(author);
                cv4dt4.setText(date);
                Glide.with(getApplicationContext()).load(image).into(iv4);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        reff5.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String author = dataSnapshot.child("author").getValue().toString();
                String date = dataSnapshot.child("date").getValue().toString();
                String title = dataSnapshot.child("title").getValue().toString();
                String image = dataSnapshot.child("image").getValue().toString();
                cv5tt5.setText(title);
                cv5auth5.setText(author);
                cv5dt5.setText(date);
                Glide.with(getApplicationContext()).load(image).into(iv5);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        reff6.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String author = dataSnapshot.child("author").getValue().toString();
                String date = dataSnapshot.child("date").getValue().toString();
                String title = dataSnapshot.child("title").getValue().toString();
                String image = dataSnapshot.child("image").getValue().toString();
                cv6tt6.setText(title);
                cv6auth6.setText(author);
                cv6dt6.setText(date);
                Glide.with(getApplicationContext()).load(image).into(iv6);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        final Intent i = new Intent(getApplicationContext(), Sermon.class);
        cv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                addListenerOnClick(v);
                final Global g1 = Global.getInstance();
                startActivity(i);

                reff1.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String author = dataSnapshot.child("author").getValue().toString();
                        String date = dataSnapshot.child("date").getValue().toString();
                        String title = dataSnapshot.child("title").getValue().toString();
                        String ot = dataSnapshot.child("ot").getValue().toString();
                        String psalms = dataSnapshot.child("psalms").getValue().toString();
                        String epistle = dataSnapshot.child("epistle").getValue().toString();
                        String gospel = dataSnapshot.child("gospel").getValue().toString();
                        String audio = dataSnapshot.child("audio").getValue().toString();

                        g1.setData(author,date,epistle,gospel,ot,psalms,title,audio);

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
            }
        });
        cv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addListenerOnClick(v);
                final Global g2 = Global.getInstance();
                startActivity(i);

                reff2.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String author = dataSnapshot.child("author").getValue().toString();
                        String date = dataSnapshot.child("date").getValue().toString();
                        String title = dataSnapshot.child("title").getValue().toString();
                        String ot = dataSnapshot.child("ot").getValue().toString();
                        String psalms = dataSnapshot.child("psalms").getValue().toString();
                        String epistle = dataSnapshot.child("epistle").getValue().toString();
                        String gospel = dataSnapshot.child("gospel").getValue().toString();
                        String audio = dataSnapshot.child("audio").getValue().toString();

                        g2.setData(author,date,epistle,gospel,ot,psalms,title,audio);

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
            }
        });
        cv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addListenerOnClick(v);
                final Global g3 = Global.getInstance();
                startActivity(i);

                reff3.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String author = dataSnapshot.child("author").getValue().toString();
                        String date = dataSnapshot.child("date").getValue().toString();
                        String title = dataSnapshot.child("title").getValue().toString();
                        String ot = dataSnapshot.child("ot").getValue().toString();
                        String psalms = dataSnapshot.child("psalms").getValue().toString();
                        String epistle = dataSnapshot.child("epistle").getValue().toString();
                        String gospel = dataSnapshot.child("gospel").getValue().toString();
                        String audio = dataSnapshot.child("audio").getValue().toString();

                        g3.setData(author,date,epistle,gospel,ot,psalms,title,audio);

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
            }
        });
        cv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addListenerOnClick(v);
                final Global g4 = Global.getInstance();
                startActivity(i);

                reff4.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String author = dataSnapshot.child("author").getValue().toString();
                        String date = dataSnapshot.child("date").getValue().toString();
                        String title = dataSnapshot.child("title").getValue().toString();
                        String ot = dataSnapshot.child("ot").getValue().toString();
                        String psalms = dataSnapshot.child("psalms").getValue().toString();
                        String epistle = dataSnapshot.child("epistle").getValue().toString();
                        String gospel = dataSnapshot.child("gospel").getValue().toString();
                        String audio = dataSnapshot.child("audio").getValue().toString();

                        g4.setData(author,date,epistle,gospel,ot,psalms,title,audio);

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {
                    }
                });
            }
        });
        cv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addListenerOnClick(v);
                final Global g5 = Global.getInstance();
                startActivity(i);

                reff5.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String author = dataSnapshot.child("author").getValue().toString();
                        String date = dataSnapshot.child("date").getValue().toString();
                        String title = dataSnapshot.child("title").getValue().toString();
                        String ot = dataSnapshot.child("ot").getValue().toString();
                        String psalms = dataSnapshot.child("psalms").getValue().toString();
                        String epistle = dataSnapshot.child("epistle").getValue().toString();
                        String gospel = dataSnapshot.child("gospel").getValue().toString();
                        String audio = dataSnapshot.child("audio").getValue().toString();

                        g5.setData(author,date,epistle,gospel,ot,psalms,title,audio);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {
                    }
                });
            }
        });

        cv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addListenerOnClick(v);
                final Global g6 = Global.getInstance();
                startActivity(i);

                reff6.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String author = dataSnapshot.child("author").getValue().toString();
                        String date = dataSnapshot.child("date").getValue().toString();
                        String title = dataSnapshot.child("title").getValue().toString();
                        String ot = dataSnapshot.child("ot").getValue().toString();
                        String psalms = dataSnapshot.child("psalms").getValue().toString();
                        String epistle = dataSnapshot.child("epistle").getValue().toString();
                        String gospel = dataSnapshot.child("gospel").getValue().toString();
                        String audio = dataSnapshot.child("audio").getValue().toString();

                        g6.setData(author,date,epistle,gospel,ot,psalms,title,audio);

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {
                    }
                });
            }
        });

    }

    public void addListenerOnClick(View v) {
        progressBar = new ProgressDialog(v.getContext());
        progressBar.setCancelable(true);
        progressBar.setMessage("Loading Sermon Info....");
        progressBar.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        progressBar.setIndeterminate(true);
        progressBar.setProgress(0);
        progressBar.show();
        final int totalProgressTime = 100;
        final Thread t = new Thread() {
            @Override
            public void run() {
                int jumpTime = 0;
                while(jumpTime < totalProgressTime) {
                    try {
                        sleep(200);
                        jumpTime += 5;
                        progressBar.setProgress(jumpTime);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    progressBar.dismiss();
                }
            }
        };
        t.start();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.contextmenu, menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem items) {
        switch (items.getItemId()) {
            case R.id.context_home:
                Intent i2 = new Intent(getApplicationContext(), Home.class);
                startActivity(i2);
                return true;
            default:
                return super.onOptionsItemSelected(items);
        }
    }
}