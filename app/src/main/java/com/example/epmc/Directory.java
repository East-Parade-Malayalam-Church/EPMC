package com.example.epmc;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


public class Directory extends AppCompatActivity {

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    TextView cvhead,area,homep;
    ImageView fampic;

    DatabaseReference reff=database.getReference().child("users").child("Directory").child("-M2Oau6oiiyBodmWJf9D").child("1");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_directory);
        cvhead = findViewById(R.id.name);
        area = findViewById(R.id.email);
        homep = findViewById(R.id.uid);
        fampic = findViewById(R.id.pic);

        reff.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String name = dataSnapshot.child("Name").getValue().toString();
                cvhead.setText(name);
                String pg = dataSnapshot.child("Area").getValue().toString();
                area.setText(pg);
                String hparish = dataSnapshot.child("Home Parish").getValue().toString();
                homep.setText(hparish);
                String famimage = dataSnapshot.child("Picture").getValue().toString();
                Glide.with(getApplicationContext()).load(famimage).into(fampic);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }
}
