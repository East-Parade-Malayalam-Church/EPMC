package com.church.epmc;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class Directory extends AppCompatActivity {

    //CardView cv;
    ProgressDialog progressBar;
    DatabaseReference reff;
    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_directory);
        reff = FirebaseDatabase.getInstance().getReference().child("users").child("Directory").child("-M2xpvU-2jNmmIRJ51ea");
        reff.keepSynced(true);
        mRecyclerView = findViewById(R.id.myrecyclerview);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        //cv = findViewById(R.id.cvdir);
        final Intent i = new Intent(getApplicationContext(), Dirscreen.class);

        /*

        cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addListenerOnClick(v);
                final Dirglob d = Dirglob.getInstance();
                startActivity(i);

                reff.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        int fid = (int) dataSnapshot.child("0").child("fid").getValue();
                        String name = dataSnapshot.child("0").child("name").getValue().toString();
                        String address = dataSnapshot.child("0").child("address").getValue().toString();
                        String wedding = dataSnapshot.child("0").child("wedding").getValue().toString();
                        long cell = (long) dataSnapshot.child("0").child("cell").getValue();
                        String bgroup = dataSnapshot.child("0").child("bgroup").getValue().toString();
                        String hparish = dataSnapshot.child("0").child("hparish").getValue().toString();
                        String fname = dataSnapshot.child("0").child("fname").getValue().toString();
                        String profession = dataSnapshot.child("0").child("profession").getValue().toString();
                        String email = dataSnapshot.child("0").child("email").getValue().toString();
                        String picture = dataSnapshot.child("0").child("picture").getValue().toString();
                        d.setData(fid,name,address,wedding,cell,bgroup,hparish,fname,profession,email,picture);
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

    */
    }

    @Override
    protected void onStart() {
        super.onStart();
        FirebaseRecyclerAdapter<Dirglob,ViewHolder> firebaseRecyclerAdapter = new FirebaseRecyclerAdapter<Dirglob, ViewHolder>
                (Dirglob.class,R.layout.dir_row,ViewHolder.class,reff) {
            @Override
            protected void populateViewHolder(ViewHolder viewHolder, Dirglob dirglob, int i) {
                viewHolder.setName(dirglob.getName());
                viewHolder.setHparish(dirglob.getHparish());
                viewHolder.setArea(dirglob.getArea());
                viewHolder.setPicture(dirglob.getPicture());
            }
        };
        mRecyclerView.setAdapter(firebaseRecyclerAdapter);
    }
}