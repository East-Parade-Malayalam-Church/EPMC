package com.example.epmc;

import android.Manifest;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

public class Visitus extends AppCompatActivity {
    Button vtcu;
    ImageButton locn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visitus);
        vtcu = findViewById(R.id.button21);
        locn = findViewById(R.id.imageButton4);
    }

    public void btcu(View view) {
        Intent i = new Intent(this, Contactus.class);
        startActivity(i);
    }

    public void btloc(View view) {
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/eUP8m24Vcjnze2bM8"));
        intent.setPackage("com.google.android.apps.maps");
        try {
            startActivity(intent);
        } catch (ActivityNotFoundException ex) {
            try {
                Intent unrestrictedIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/eUP8m24Vcjnze2bM8"));
                startActivity(unrestrictedIntent);
            } catch (ActivityNotFoundException innerEx) {
                Toast.makeText(this, "Please install a maps application", Toast.LENGTH_LONG).show();
            }
        }
    }
    private void requestPermission() {
        ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CALL_PHONE},1);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem items) {
        switch (items.getItemId()) {
            case R.id.context_help:
                Toast.makeText(getApplicationContext(), "Help", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.context_logout:
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
                return true;
            case R.id.context_home:
                Intent i2 = new Intent(getApplicationContext(), Home.class);
                startActivity(i2);
                return true;
            case R.id.context_contact:
                Intent i3 = new Intent(Intent.ACTION_DIAL);
                if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    Toast.makeText(this, "Please grant the permission to call", Toast.LENGTH_SHORT).show();
                    requestPermission();
                } else {
                    startActivity(i3);
                }
                return true;
            default:
                return super.onOptionsItemSelected(items);
        }
    }
}

