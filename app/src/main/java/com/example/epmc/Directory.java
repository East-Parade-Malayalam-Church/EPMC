package com.example.epmc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.view.View;
import android.widget.ToggleButton;

import com.google.firebase.firestore.FirebaseFirestore;

public class Directory extends AppCompatActivity {
    // Access a Cloud Firestore instance from your Activity
    public static FirebaseFirestore db = FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final ToggleButton wifitoggle;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_directory);
        wifitoggle = (ToggleButton) findViewById(R.id.wifitoggle);
        wifitoggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(wifitoggle.isChecked())
                {
                    WifiManager wifi = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
                    wifi.setWifiEnabled(true);
                }
                else {
                    WifiManager wifi = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
                    wifi.setWifiEnabled(false);
                }
            }
        });
        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo mWifi = cm.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
        if (mWifi.isConnected()) {
            wifitoggle.setChecked(true);
        }
    }
}
