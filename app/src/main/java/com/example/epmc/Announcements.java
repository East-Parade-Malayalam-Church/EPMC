package com.example.epmc;

import android.Manifest;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

public class Announcements extends AppCompatActivity {
    ImageView iv35;
    private void requestPermission() {
        ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CALL_PHONE},1);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_announcements);
        iv35 = findViewById(R.id.imageView35);
        registerForContextMenu(iv35);
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
    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.context_save:
                Toast.makeText(getApplicationContext(), "Picture Saved", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.context_sharepic:
                Intent i = new Intent(Intent.ACTION_SEND);
                i.setType("image/*");
                Uri uri = Uri.parse("android.resource.//com..example.epmc/drawable" + R.drawable.old2);
                i.putExtra(Intent.EXTRA_STREAM, uri);
                startActivity(i);
                return true;
            case R.id.context_copy:
                Toast.makeText(getApplicationContext(), "Copied to Clipboard", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onContextItemSelected(item);

        }
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
