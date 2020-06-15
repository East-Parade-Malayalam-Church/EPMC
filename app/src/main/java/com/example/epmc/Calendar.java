package com.example.epmc;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Calendar extends AppCompatActivity {

    FirebaseDatabase database = FirebaseDatabase.getInstance();

    TextView sunw1,sunw2,sunw3,sunw4,sunw5,
            monw1,monw2,monw3,monw4,monw5,
            tuew1,tuew2,tuew3,tuew4,tuew5,
            wedw1,wedw2,wedw3,wedw4,wedw5,
            thursw1,thursw2,thursw3,thursw4,thursw5,
            friw1,friw2,friw3,friw4,friw5,
            satw1,satw2,satw3,satw4,satw5,
            monthnm;

    DatabaseReference reff1 = database.getReference().child("users").child("Calendar").child("w1");
    DatabaseReference reff2 = database.getReference().child("users").child("Calendar").child("w2");
    DatabaseReference reff3 = database.getReference().child("users").child("Calendar").child("w3");
    DatabaseReference reff4 = database.getReference().child("users").child("Calendar").child("w4");
    DatabaseReference reff5 = database.getReference().child("users").child("Calendar").child("w5");
    DatabaseReference reff6 = database.getReference().child("users").child("Calendar").child("month");

    /*
    Activity activity;
    private WebView webView;
    private ProgressDialog progDailog;

     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        sunw1 = findViewById(R.id.sunw1);
        sunw2 = findViewById(R.id.sunw2);
        sunw3 = findViewById(R.id.sunw3);
        sunw4 = findViewById(R.id.sunw4);
        sunw5 = findViewById(R.id.sunw5);
        monw1 = findViewById(R.id.monw1);
        monw2 = findViewById(R.id.monw2);
        monw3 = findViewById(R.id.monw3);
        monw4 = findViewById(R.id.monw4);
        monw5 = findViewById(R.id.monw5);
        tuew1 = findViewById(R.id.tuew1);
        tuew2 = findViewById(R.id.tuew2);
        tuew3 = findViewById(R.id.tuew3);
        tuew4 = findViewById(R.id.tuew4);
        tuew5 = findViewById(R.id.tuew5);
        wedw1 = findViewById(R.id.wedw1);
        wedw2 = findViewById(R.id.wedw2);
        wedw3 = findViewById(R.id.wedw3);
        wedw4 = findViewById(R.id.wedw4);
        wedw5 = findViewById(R.id.wedw5);
        thursw1 = findViewById(R.id.thursw1);
        thursw2 = findViewById(R.id.thursw2);
        thursw3 = findViewById(R.id.thursw3);
        thursw4 = findViewById(R.id.thursw4);
        thursw5 = findViewById(R.id.thursw5);
        friw1 = findViewById(R.id.friw1);
        friw2 = findViewById(R.id.friw2);
        friw3 = findViewById(R.id.friw3);
        friw4 = findViewById(R.id.friw4);
        friw5 = findViewById(R.id.friw5);
        satw1 = findViewById(R.id.satw1);
        satw2 = findViewById(R.id.satw2);
        satw3 = findViewById(R.id.satw3);
        satw4 = findViewById(R.id.satw4);
        satw5 = findViewById(R.id.satw5);
        monthnm = findViewById(R.id.monthtv);

        reff6.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String mnthnm = dataSnapshot.getValue().toString();
                monthnm.setText(mnthnm);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        reff1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String sun = dataSnapshot.child("sun").getValue().toString();
                String mon = dataSnapshot.child("mon").getValue().toString();
                String tue = dataSnapshot.child("tue").getValue().toString();
                String wed = dataSnapshot.child("wed").getValue().toString();
                String thurs = dataSnapshot.child("thurs").getValue().toString();
                String fri = dataSnapshot.child("fri").getValue().toString();
                String sat = dataSnapshot.child("sat").getValue().toString();
                sunw1.setText(sun);
                monw1.setText(mon);
                tuew1.setText(tue);
                wedw1.setText(wed);
                thursw1.setText(thurs);
                friw1.setText(fri);
                satw1.setText(sat);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        reff2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String sun = dataSnapshot.child("sun").getValue().toString();
                String mon = dataSnapshot.child("mon").getValue().toString();
                String tue = dataSnapshot.child("tue").getValue().toString();
                String wed = dataSnapshot.child("wed").getValue().toString();
                String thurs = dataSnapshot.child("thurs").getValue().toString();
                String fri = dataSnapshot.child("fri").getValue().toString();
                String sat = dataSnapshot.child("sat").getValue().toString();
                sunw2.setText(sun);
                monw2.setText(mon);
                tuew2.setText(tue);
                wedw2.setText(wed);
                thursw2.setText(thurs);
                friw2.setText(fri);
                satw2.setText(sat);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        reff3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String sun = dataSnapshot.child("sun").getValue().toString();
                String mon = dataSnapshot.child("mon").getValue().toString();
                String tue = dataSnapshot.child("tue").getValue().toString();
                String wed = dataSnapshot.child("wed").getValue().toString();
                String thurs = dataSnapshot.child("thurs").getValue().toString();
                String fri = dataSnapshot.child("fri").getValue().toString();
                String sat = dataSnapshot.child("sat").getValue().toString();
                sunw3.setText(sun);
                monw3.setText(mon);
                tuew3.setText(tue);
                wedw3.setText(wed);
                thursw3.setText(thurs);
                friw3.setText(fri);
                satw3.setText(sat);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        reff4.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String sun = dataSnapshot.child("sun").getValue().toString();
                String mon = dataSnapshot.child("mon").getValue().toString();
                String tue = dataSnapshot.child("tue").getValue().toString();
                String wed = dataSnapshot.child("wed").getValue().toString();
                String thurs = dataSnapshot.child("thurs").getValue().toString();
                String fri = dataSnapshot.child("fri").getValue().toString();
                String sat = dataSnapshot.child("sat").getValue().toString();
                sunw4.setText(sun);
                monw4.setText(mon);
                tuew4.setText(tue);
                wedw4.setText(wed);
                thursw4.setText(thurs);
                friw4.setText(fri);
                satw4.setText(sat);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        reff5.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String sun = dataSnapshot.child("sun").getValue().toString();
                String mon = dataSnapshot.child("mon").getValue().toString();
                String tue = dataSnapshot.child("tue").getValue().toString();
                String wed = dataSnapshot.child("wed").getValue().toString();
                String thurs = dataSnapshot.child("thurs").getValue().toString();
                String fri = dataSnapshot.child("fri").getValue().toString();
                String sat = dataSnapshot.child("sat").getValue().toString();
                sunw5.setText(sun);
                monw5.setText(mon);
                tuew5.setText(tue);
                wedw5.setText(wed);
                thursw5.setText(thurs);
                friw5.setText(fri);
                satw5.setText(sat);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        /*
        activity = this;
        progDailog = ProgressDialog.show(activity, "Loading Calendar","Please wait...", true);
        progDailog.setCancelable(false);

        webView = findViewById(R.id.cwebview);

        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setUseWideViewPort(true);

        webView.setWebViewClient(new WebViewClient(){

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                progDailog.show();
                view.loadUrl(url);

                return true;
            }
            @Override
            public void onPageFinished(WebView view, final String url) {
                progDailog.dismiss();
            }
        });

        webView.loadUrl("");
    }

         */
    }
}