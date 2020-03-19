package com.example.epmc;

import android.util.Log;

import androidx.annotation.NonNull;

import com.google.firebase.messaging.FirebaseMessagingService;

public class MyFirebaseMessagingService extends FirebaseMessagingService {
    @Override
    public void onNewToken(@NonNull String s) {
        super.onNewToken(s);
        Log.d("fmstoken",s);

        storeToken(s);
    }

    private void storeToken(String token) {
        SharedPrefManager.getInstance(getApplicationContext()).storeToken(token);
    }
}
