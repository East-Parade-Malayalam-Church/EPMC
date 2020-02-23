package com.example.epmc;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Announcements extends AppCompatActivity {
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    TextView at1,at2,at3,at4,at5,at6;

    DatabaseReference reff1=database.getReference().child("users").child("news").child("weekly");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_announcements);
        at1 = findViewById(R.id.at1);
        at2 = findViewById(R.id.at2);
        at3 = findViewById(R.id.at3);
        at4 = findViewById(R.id.at4);
        at5 = findViewById(R.id.at5);
        at6 = findViewById(R.id.at6);

        reff1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String classes = dataSnapshot.child("classes").getValue().toString();
                String fast = dataSnapshot.child("fast").getValue().toString();
                String service = dataSnapshot.child("service").getValue().toString();
                String ss = dataSnapshot.child("ss").getValue().toString();
                String youth = dataSnapshot.child("youth").getValue().toString();
                String choir = dataSnapshot.child("choir").getValue().toString();
                at1.setText(classes);
                at2.setText(fast);
                at3.setText(service);
                at4.setText(ss);
                at5.setText(youth);
                at6.setText(choir);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });
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