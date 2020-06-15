package com.example.epmc;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

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
    public void btsong(View view)
    {
        Intent i3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://emy-pwa.web.app/"));
        startActivity(i3);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
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
