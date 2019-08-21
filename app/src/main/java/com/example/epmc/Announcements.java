package com.example.epmc;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class Announcements extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_announcements);
    }

    public void btan1(View view)
    {
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/CLHFzgwNu7Y5Eiej6"));
        intent.setPackage("com.google.android.apps.maps");
        try {
            startActivity(intent);
        } catch (ActivityNotFoundException ex) {
            try {
                Intent unrestrictedIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/CLHFzgwNu7Y5Eiej6"));
                startActivity(unrestrictedIntent);
            } catch (ActivityNotFoundException innerEx) {
                Toast.makeText(this, "Please install a maps application", Toast.LENGTH_LONG).show();
            }
        }
    }

    public void btan1call(View view)
    {
        Uri uri = Uri.parse("tel:9980800135");
        Intent callIntent = new Intent(Intent.ACTION_DIAL,uri);
        startActivity(callIntent);
    }
    public void btan2(View view)
    {
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/PQ7MZbGCxSosY2g89"));
        intent.setPackage("com.google.android.apps.maps");
        try {
            startActivity(intent);
        } catch (ActivityNotFoundException ex) {
            try {
                Intent unrestrictedIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/PQ7MZbGCxSosY2g89"));
                startActivity(unrestrictedIntent);
            } catch (ActivityNotFoundException innerEx) {
                Toast.makeText(this, "Please install a maps application", Toast.LENGTH_LONG).show();
            }
        }
    }
    public void btan2call(View view)
    {
        Uri uri = Uri.parse("tel:9611972200");
        Intent callIntent = new Intent(Intent.ACTION_DIAL,uri);
        startActivity(callIntent);
    }
    public void btan3(View view)
    {
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/ZiCbcjeTRpBWXvAm8"));
        intent.setPackage("com.google.android.apps.maps");
        try {
            startActivity(intent);
        } catch (ActivityNotFoundException ex) {
            try {
                Intent unrestrictedIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/ZiCbcjeTRpBWXvAm8"));
                startActivity(unrestrictedIntent);
            } catch (ActivityNotFoundException innerEx) {
                Toast.makeText(this, "Please install a maps application", Toast.LENGTH_LONG).show();
            }
        }
    }
    public void btan3call(View view)
    {
        Uri uri = Uri.parse("tel:9901893119");
        Intent callIntent = new Intent(Intent.ACTION_DIAL,uri);
        startActivity(callIntent);
    }
    public void btan4(View view)
    {
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/VWLETMGDs9EqA4ok9"));
        intent.setPackage("com.google.android.apps.maps");
        try {
            startActivity(intent);
        } catch (ActivityNotFoundException ex) {
            try {
                Intent unrestrictedIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/VWLETMGDs9EqA4ok9"));
                startActivity(unrestrictedIntent);
            } catch (ActivityNotFoundException innerEx) {
                Toast.makeText(this, "Please install a maps application", Toast.LENGTH_LONG).show();
            }
        }
    }
    public void btan4call(View view)
    {
        Uri uri = Uri.parse("tel:98450688295");
        Intent callIntent = new Intent(Intent.ACTION_DIAL,uri);
        startActivity(callIntent);
    }
    public void btan5(View view)
    {
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/7L1pxJnmmzCxHfd18"));
        intent.setPackage("com.google.android.apps.maps");
        try {
            startActivity(intent);
        } catch (ActivityNotFoundException ex) {
            try {
                Intent unrestrictedIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/7L1pxJnmmzCxHfd18"));
                startActivity(unrestrictedIntent);
            } catch (ActivityNotFoundException innerEx) {
                Toast.makeText(this, "Please install a maps application", Toast.LENGTH_LONG).show();
            }
        }
    }
    public void btan5call(View view)
    {
        Uri uri = Uri.parse("tel:9448353735");
        Intent callIntent = new Intent(Intent.ACTION_DIAL,uri);
        startActivity(callIntent);
    }
}
