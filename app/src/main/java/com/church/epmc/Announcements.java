package com.church.epmc;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Announcements extends AppCompatActivity {
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    TextView at1,at2,at,at4,at5,at6,at7,at8;
    ImageButton bslinkbt;

    DatabaseReference reff1=database.getReference().child("users").child("news").child("weekly");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_announcements);
        at1 = findViewById(R.id.at1);
        at2 = findViewById(R.id.at2);
        at = findViewById(R.id.at);
        at4 = findViewById(R.id.at4);
        at5 = findViewById(R.id.at5);
        at6 = findViewById(R.id.at6);
        at7 = findViewById(R.id.at7);
        at8 = findViewById(R.id.at8);
        bslinkbt = findViewById(R.id.bslinkbt);

        reff1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String classes = dataSnapshot.child("classes").getValue().toString();
                String fast = dataSnapshot.child("fast").getValue().toString();
                String service = dataSnapshot.child("service").getValue().toString();
                String ss = dataSnapshot.child("ss").getValue().toString();
                String youth = dataSnapshot.child("youth").getValue().toString();
                String choir = dataSnapshot.child("choir").getValue().toString();
                String gen1 = dataSnapshot.child("angen").getValue().toString();
                String gen2 = dataSnapshot.child("angen2").getValue().toString();
                String bslink = dataSnapshot.child("bslink").getValue().toString();
                at1.setText(classes);
                at2.setText(fast);
                at.setText(service);
                at4.setText(ss);
                at5.setText(youth);
                at6.setText(choir);
                at7.setText(gen1);
                at8.setText(gen2);
                bslinkbt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(bslink));
                        intent.setPackage("us.zoom.videomeetings&hl=en");
                        try {
                            startActivity(intent);
                        } catch (ActivityNotFoundException ex) {
                            try {
                                Intent unrestrictedIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(bslink));
                                startActivity(unrestrictedIntent);
                            } catch (ActivityNotFoundException innerEx) {
                                Toast.makeText(getApplicationContext(),"Waiting for Link....Please make sure you have downloaded the app",Toast.LENGTH_LONG).show();
                                Intent unrestrictedIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=us.zoom.videomeetings"));
                                startActivity(unrestrictedIntent);
                            }
                        }
                    }
                });
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