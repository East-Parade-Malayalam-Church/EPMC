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

public class Ministries extends AppCompatActivity {
    Button ss;
    Button youth;
    Button choir;
    Button wf;
    Button scf;
    Button mm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ministries);
        ss = findViewById(R.id.button15);
        youth = findViewById(R.id.button17);
        choir = findViewById(R.id.button10);
        wf = findViewById(R.id.button19);
        scf = findViewById(R.id.button20);
        mm = findViewById(R.id.button18);
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
    public void btnss(View view)
    {
        Intent i = new Intent(this,Sundayschool.class);
        startActivity(i);
    }
    public void btnyouth(View view)
    {
        Intent i = new Intent(this,Youth.class);
        startActivity(i);
    }
    public void btnchoir(View view)
    {
        Intent i = new Intent(this,Choir.class);
        startActivity(i);
    }
    public void btnwf(View view)
    {
        Intent i = new Intent(this,WomensFellowship.class);
        startActivity(i);
    }
    public void btnscf(View view)
    {
        Intent i = new Intent(this,SeniorChristianFellowship.class);
        startActivity(i);
    }
    public void btnmm(View view)
    {
        Intent i = new Intent(this,MissandMin.class);
        startActivity(i);
    }
}
