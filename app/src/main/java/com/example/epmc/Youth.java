package com.example.epmc;

import android.Manifest;
import android.content.Intent;
import android.net.Uri;
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
    Button ycal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ym = findViewById(R.id.button23);
        inreach = findViewById(R.id.button22);
        outreach = findViewById(R.id.button24);
        ycal = findViewById(R.id.button30);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youth);
        Toast.makeText(this,"Click on Home Button for song List",Toast.LENGTH_LONG).show();
    }
    public void btycal(View view)
    {
        Toast.makeText(this, "Coming Soon!", Toast.LENGTH_SHORT).show();
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
            case R.id.context_home:
                Intent i3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://emy-pwa.web.app/"));
                startActivity(i3);
                return true;
            default:
                return super.onOptionsItemSelected(items);
        }
    }
}
