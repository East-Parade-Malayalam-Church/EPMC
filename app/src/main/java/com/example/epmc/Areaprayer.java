package com.example.epmc;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Areaprayer extends AppCompatActivity {
    TextView ctp1,ctp2,ctp3,ctp4,ctp5,ctp6,ctp7,ctp8;
    FirebaseDatabase database = FirebaseDatabase.getInstance();

    DatabaseReference reff1=database.getReference().child("users").child("news").child("prayer").child("1");
    DatabaseReference reff2=database.getReference().child("users").child("news").child("prayer").child("2");
    DatabaseReference reff3=database.getReference().child("users").child("news").child("prayer").child("3");
    DatabaseReference reff4=database.getReference().child("users").child("news").child("prayer").child("4");
    DatabaseReference reff5=database.getReference().child("users").child("news").child("prayer").child("5");
    DatabaseReference reff6=database.getReference().child("users").child("news").child("prayer").child("6");
    DatabaseReference reff7=database.getReference().child("users").child("news").child("prayer").child("7");
    DatabaseReference reff8=database.getReference().child("users").child("news").child("prayer").child("8");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_areaprayer);
        ctp1 = findViewById(R.id.ctp1);
        ctp2 = findViewById(R.id.ctp2);
        ctp3 = findViewById(R.id.ctp3);
        ctp4 = findViewById(R.id.ctp4);
        ctp5 = findViewById(R.id.ctp5);
        ctp6 = findViewById(R.id.ctp6);
        ctp7 = findViewById(R.id.ctp7);
        ctp8 = findViewById(R.id.ctp8);

        reff1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String details = dataSnapshot.child("details").getValue().toString();
                ctp1.setText(details);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        reff2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String details = dataSnapshot.child("details").getValue().toString();
                ctp2.setText(details);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        reff3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String details = dataSnapshot.child("details").getValue().toString();
                ctp3.setText(details);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        reff4.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String details = dataSnapshot.child("details").getValue().toString();
                ctp4.setText(details);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        reff5.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String details = dataSnapshot.child("details").getValue().toString();
                ctp5.setText(details);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        reff6.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String details = dataSnapshot.child("details").getValue().toString();
                ctp6.setText(details);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        reff7.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String details = dataSnapshot.child("details").getValue().toString();
                ctp7.setText(details);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        reff8.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String details = dataSnapshot.child("details").getValue().toString();
                ctp8.setText(details);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }
}
