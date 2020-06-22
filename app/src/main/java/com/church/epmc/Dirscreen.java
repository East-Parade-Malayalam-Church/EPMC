package com.church.epmc;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class Dirscreen extends AppCompatActivity {

    final Dirglob d = Dirglob.getInstance();
    TextView famheadtv,headproftv,famfidtv,famnametv,headbgtv,headhptv,famwatv,wifedisptv,childdisptv,childdisp2tv,childdisp3tv,childdisp4tv;
    ImageView fampiciv;
    ImageButton call,emailbt,home;
    String email,name,address;
    long cell;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dirscreen);
        int fid = d.getFid();
        name = d.getName();
        String dob = d.getDob();
        address = d.getAddress();
        String area = d.getArea();
        String rel = d.getRelation();
        String wed = d.getWedding();
        cell = d.getCell();
        String bgroup = d.getBgroup();
        String hparish = d.getHparish();
        String fname = d.getFname();
        String profession = d.getProfession();
        email = d.getEmail();
        String picture = d.getPicture();
        fampiciv = findViewById(R.id.fampic);
        famheadtv = findViewById(R.id.famhead);
        headproftv = findViewById(R.id.headprof);
        famfidtv = findViewById(R.id.famfid);
        famnametv = findViewById(R.id.famname);
        headbgtv = findViewById(R.id.headbg);
        headhptv = findViewById(R.id.headhp);
        famwatv = findViewById(R.id.famwa);
        wifedisptv = findViewById(R.id.wifedisp);
        childdisptv = findViewById(R.id.childdisp);
        childdisp2tv = findViewById(R.id.childdisp2);
        childdisp3tv = findViewById(R.id.childdisp3);
        childdisp4tv = findViewById(R.id.childdisp4);
        call = findViewById(R.id.callhead);
        emailbt = findViewById(R.id.emailhead);
        home = findViewById(R.id.headhome);
        Glide.with(getApplicationContext()).load(picture).into(fampiciv);
        famheadtv.setText(name);
        headproftv.setText(profession);
        famfidtv.setText("FID: "+fid);
        famnametv.setText(fname);
        headbgtv.setText(bgroup);
        headhptv.setText(hparish);
        famwatv.setText(wed);
    }
    public void btemailhead(View v)
    {
        Intent ieh = new Intent(Intent.ACTION_SEND);
        ieh.setType("message/rfc822");
        ieh.putExtra(Intent.EXTRA_EMAIL  , new String[]{email});
        ieh.putExtra(Intent.EXTRA_SUBJECT, "Insert Subject here");
        ieh.putExtra(Intent.EXTRA_TEXT   , "Respected "+name+",");
        try {
            startActivity(Intent.createChooser(ieh, "Send mail..."));
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(Dirscreen.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
        }
    }
    public void btcallhead(View v)
    {
        Uri uri = Uri.parse(String.valueOf(cell));
        Intent callIntent = new Intent(Intent.ACTION_DIAL,uri);
        startActivity(callIntent);
    }
    public void btheadhome(View v)
    {
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(address));
        intent.setPackage("com.google.android.apps.maps");
        try {
            startActivity(intent);
        } catch (ActivityNotFoundException ex) {
            try {
                Intent unrestrictedIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(address));
                startActivity(unrestrictedIntent);
            } catch (ActivityNotFoundException innerEx) {
                Toast.makeText(this, "Please install a maps application", Toast.LENGTH_LONG).show();
            }
        }
    }
}
