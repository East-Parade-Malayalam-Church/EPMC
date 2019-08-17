package com.example.epmc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Choir extends AppCompatActivity {
    Button chg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choir);
        chg = (Button) findViewById(R.id.button26);
    }
    public void btchg(View view)
    {
        Intent i = new Intent(this,Choirgoals.class);
        startActivity(i);
    }
}
