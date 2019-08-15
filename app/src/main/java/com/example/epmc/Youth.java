package com.example.epmc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Youth extends AppCompatActivity {
    Button ym;
    Button inreach;
    Button outreach;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ym = (Button) findViewById(R.id.button23);
        inreach = (Button) findViewById(R.id.button22);
        outreach = (Button) findViewById(R.id.button24);
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
}
