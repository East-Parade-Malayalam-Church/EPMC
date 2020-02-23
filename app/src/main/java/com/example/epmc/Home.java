package com.example.epmc;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Home extends AppCompatActivity {
    Button min;
    Button log;
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
    Button fb;
    Button dir;
    Button cal;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        min = findViewById(R.id.button3);
        abt = findViewById(R.id.button4);
        vision = findViewById(R.id.button16);
        con = findViewById(R.id.button7);
        qa = findViewById(R.id.button2);
        life = findViewById(R.id.button8);
        upcom = findViewById(R.id.button11);
        sched = findViewById(R.id.button9);
        his = findViewById(R.id.button13);
        ann = findViewById(R.id.button14);
        visit = findViewById(R.id.button5);
        lead = findViewById(R.id.button12);
        fb = findViewById(R.id.button19);
        dir = findViewById(R.id.button25);
        cal = findViewById(R.id.button6);
        //log = (Button) findViewById(R.id.button35);
        tv = findViewById(R.id.textView126);
        getdata();
    }
    public void leave(View v)
    {
        Intent lv = new Intent(this,Signup.class);
        startActivity(lv);
        finish();
    }
    public void getdata()
    {
        SharedPreferences sp= this.getSharedPreferences("file1",MODE_PRIVATE);
        String s1 = sp.getString("fname","N/A");
        //tv.setText("Welcome "+s1);
    }
    public void btncal(View view)
    {
        //Intent cali = new Intent(this,Calendar.class);
        //startActivity(cali);
        Toast.makeText(this, "Coming Soon!", Toast.LENGTH_SHORT).show();
    }
    public void btndir(View view)
    {
        //Intent di = new Intent(this,Directory.class);
        //startActivity(di);
        Toast.makeText(this, "Coming Soon!", Toast.LENGTH_SHORT).show();
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
        Toast.makeText(this, "Please wait for the sermons to load from our database!", Toast.LENGTH_LONG).show();
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
    public void btnann(View view)
    {
        Intent i = new Intent(this,Announcements.class);
        startActivity(i);
    }
    public void cot(View view)
    {
        Intent i = new Intent(this,Areaprayer.class);
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
