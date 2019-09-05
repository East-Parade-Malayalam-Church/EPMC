package com.example.epmc;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

public class Youth extends AppCompatActivity {
    Button ym;
    Button inreach;
    Button outreach;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ym = findViewById(R.id.button23);
        inreach = findViewById(R.id.button22);
        outreach = findViewById(R.id.button24);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youth);
    }
    public void btym(View view)
    {
        Intent i = new Intent(this,Youthmeet.class);
        startActivity(i);
    }
    public void btinreach(View view)
    {
        Intent i = new Intent(this,Youthinreach.class);
        startActivity(i);
    }
    public void btoutreach(View view)
    {
        Intent i = new Intent(this,Youthoutreach.class);
        startActivity(i);
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
