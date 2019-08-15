package com.example.epmc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Visitus extends AppCompatActivity {
    Button vtcu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visitus);
        vtcu = (Button) findViewById(R.id.button21);
    }

    public void btcu(View view)
    {
        Intent i = new Intent(this,Contactus.class);
        startActivity(i);
    }
}
