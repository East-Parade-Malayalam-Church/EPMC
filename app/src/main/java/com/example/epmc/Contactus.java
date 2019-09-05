package com.example.epmc;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

public class Contactus extends AppCompatActivity {
    private ImageButton imageCall;
    private TextView pic;
    ImageView iv32;
    private void requestPermission() {
        ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CALL_PHONE},1);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactus);
        imageCall = findViewById(R.id.imageButton);
        pic = findViewById(R.id.textView36);
        iv32 = findViewById(R.id.imageView32);
        registerForContextMenu(iv32);
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
                Toast.makeText(getApplicationContext(),"Picture Saved",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.context_sharepic:
                Intent i = new Intent(Intent.ACTION_SEND);
                i.setType("image/*");
                Uri uri = Uri.parse("android.resource.//com..example.epmc/drawable"+R.drawable.angle);
                i.putExtra(Intent.EXTRA_STREAM,uri);
                startActivity(i);
                return true;
            case R.id.context_copy:
                Toast.makeText(getApplicationContext(),"Copied to Clipboard",Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onContextItemSelected(item);

        }

    }
    public void btcall(View view)
    {
        Uri uri = Uri.parse("tel:9901801555");
        Intent callIntent = new Intent(Intent.ACTION_DIAL,uri);
        startActivity(callIntent);
    }
    public void btcallass(View view)
    {
        Uri uri = Uri.parse("tel:8971357074");
        Intent i = new Intent(Intent.ACTION_DIAL,uri);
        startActivity(i);
    }
    public void btcalloff(View view)
    {
        Uri uri = Uri.parse("tel:8025582867");
        Intent i = new Intent(Intent.ACTION_DIAL,uri);
        if (i.resolveActivity(getPackageManager()) != null) {
            startActivity(i);
        }
    }
}
