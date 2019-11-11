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

public class Aboutus extends AppCompatActivity {
    ImageView iv8;
    ImageView iv9;
    ImageView iv10;
    private void requestPermission() {
        ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CALL_PHONE},1);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutus);
        iv8 = findViewById(R.id.imageView8);
        iv9 = findViewById(R.id.imageView9);
        iv10 = findViewById(R.id.imageView10);
        registerForContextMenu(iv8);
        registerForContextMenu(iv9);
        registerForContextMenu(iv10);
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
        if (items.getItemId() == R.id.context_home) {
            Intent i2 = new Intent(getApplicationContext(), Home.class);
            startActivity(i2);
        }
        return super.onOptionsItemSelected(items);
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
                Uri uri = Uri.parse("android.resource.//com..example.epmc/drawable"+R.drawable.side);
                Uri uri2 = Uri.parse("android.resource.//com..example.epmc/drawable"+R.drawable.color);
                Uri uri3 = Uri.parse("android.resource.//com..example.epmc/drawable"+R.drawable.dis);
                i.putExtra(Intent.EXTRA_STREAM,uri);
                i.putExtra(Intent.EXTRA_STREAM,uri2);
                i.putExtra(Intent.EXTRA_STREAM,uri3);
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
