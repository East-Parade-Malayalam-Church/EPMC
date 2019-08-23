package com.example.epmc;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Home extends AppCompatActivity {
    Button min;
    Button abt;
    Button vision;
    Button con;
    Button qa;
    Button life;
    Button ann;
    Button upcom;
    Button sched;
    Button his;
    Button visit;
    Button lead;
    Button mal;
    Button fb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        min = (Button) findViewById(R.id.button3);
        abt = (Button) findViewById(R.id.button4);
        vision = (Button) findViewById(R.id.button16);
        con = (Button) findViewById(R.id.button7);
        qa = (Button) findViewById(R.id.button2);
        life = (Button) findViewById(R.id.button8);
        upcom = (Button) findViewById(R.id.button11);
        sched = (Button) findViewById(R.id.button9);
        his = (Button) findViewById(R.id.button13);
        ann = (Button) findViewById(R.id.button14);
        visit = (Button) findViewById(R.id.button5);
        lead = (Button) findViewById(R.id.button12);
        mal = (Button) findViewById(R.id.button6);
        fb = (Button) findViewById(R.id.button19);
    }
    public void btnmin(View view)
    {
        Intent i = new Intent(this,Ministries.class);
        startActivity(i);
    }
    public void btnabt(View view)
    {
        Intent i = new Intent(this,Aboutus.class);
        startActivity(i);
    }
    public void btnvis(View view)
    {
        Intent i = new Intent(this,Visitus.class);
        startActivity(i);
    }
    public void btncon(View view)
    {
        Intent i = new Intent(this,Contactus.class);
        startActivity(i);
    }
    public void btnqa(View view)
    {
        Intent i = new Intent(this,QandA.class);
        startActivity(i);
    }
    public void btnlife(View view)
    {
        Intent i = new Intent(this,LifeatEastparade.class);
        startActivity(i);
    }
    public void btnupcom(View view)
    {
        Intent i = new Intent(this,UpcomingEvents.class);
        startActivity(i);
    }
    public void btnschedcom(View view)
    {
        Intent i = new Intent(this,Scheduledevents.class);
        startActivity(i);
    }
    public void btnhis(View view)
    {
        Intent i = new Intent(this,History.class);
        startActivity(i);
    }
    public void btnmis(View view)
    {
        Intent i = new Intent(this,Mission.class);
        startActivity(i);
    }
    public void btnlead(View view)
    {
        Intent i = new Intent(this,ChurchLeaders.class);
        startActivity(i);
    }
    public void btnmal(View view)
    {
        Intent i = new Intent(this,CSIMalayalamChurches.class);
        startActivity(i);
    }
    public void btnann(View view)
    {
        Intent i = new Intent(this,Announcements.class);
        startActivity(i);
    }
    public void btnfb(View view)
    {
        Intent i = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/EPMCBLR/"));
        i.setPackage("com.google.android.apps.facebook");
        try {
            startActivity(i);
        } catch (ActivityNotFoundException ex) {
            try {
                Intent unrestrictedIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/EPMCBLR/"));
                startActivity(unrestrictedIntent);
            } catch (ActivityNotFoundException innerEx) {
                Toast.makeText(this, "Please install Facebook", Toast.LENGTH_LONG).show();
            }
        }
    }
}
