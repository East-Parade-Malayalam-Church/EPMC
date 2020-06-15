package com.example.epmc;

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

public class Youthmeet extends AppCompatActivity {

    ImageButton btlinkym;
    TextView yminfo;

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference reff=database.getReference().child("users").child("youthmeet");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youthmeet);
        btlinkym = findViewById(R.id.btlinkym);
        yminfo = findViewById(R.id.yminfo);

        reff.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String meetinfo = dataSnapshot.child("details").getValue().toString();
                String link = dataSnapshot.child("link").getValue().toString();
                yminfo.setText(meetinfo);
                btlinkym.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(link));
                        intent.setPackage("us.zoom.videomeetings&hl=en");
                        try {
                            startActivity(intent);
                        } catch (ActivityNotFoundException ex) {
                            try {
                                Intent unrestrictedIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(link));
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
