package com.example.epmc;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class Directory extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private DatabaseReference reff;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_directory);
        reff=FirebaseDatabase.getInstance().getReference().child("users").child("Directory").child("-M2n2S2tfi-nBiIDaW7k");
        reff.keepSynced(true);

        mRecyclerView = findViewById(R.id.myrecyclerview);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
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