package com.example.epmc;

import android.Manifest;
import android.content.Intent;
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

public class Youthoutreach extends AppCompatActivity {
    ImageView iv14;
    ImageView iv15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youthoutreach);
        iv14 = findViewById(R.id.imageView14);
        iv15 = findViewById(R.id.imageView15);
        registerForContextMenu(iv14);
        registerForContextMenu(iv15);
    }
    private void requestPermission() {
        ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CALL_PHONE},1);
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
    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.context_save:
                Toast.makeText(getApplicationContext(),"Picture Saved",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.context_sharepic:
                Intent i = new Intent(Intent.ACTION_SEND);
                i.setType("image/*");
                Uri uri = Uri.parse("android.resource.//com..example.epmc/drawable"+R.drawable.outreach292c448a9acb14d19e273e2e);
                Uri uri2 = Uri.parse("android.resource.//com..example.epmc/drawable"+R.drawable.outreach2fb54bfeba3a71321a3c146d);
                i.putExtra(Intent.EXTRA_STREAM,uri);
                i.putExtra(Intent.EXTRA_STREAM,uri2);
                startActivity(i);
                return true;
            case R.id.context_copy:
                Toast.makeText(getApplicationContext(),"Copied to Clipboard",Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onContextItemSelected(item);

        }
    }
}
