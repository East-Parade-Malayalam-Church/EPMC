package com.example.epmc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Signup extends AppCompatActivity {
    Button mn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        mn = (Button) findViewById(R.id.button28);
    }

    public void btmn(View view)
    {
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
}
