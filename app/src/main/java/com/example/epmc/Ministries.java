package com.example.epmc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

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
        ss = (Button) findViewById(R.id.button15);
        youth = (Button) findViewById(R.id.button17);
        choir = (Button) findViewById(R.id.button10);
        wf = (Button) findViewById(R.id.button19);
        scf = (Button) findViewById(R.id.button20);
        mm = (Button) findViewById(R.id.button18);
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
