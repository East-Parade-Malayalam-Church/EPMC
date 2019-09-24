package com.example.epmc;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class battery extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        Notification.Builder builder = new Notification.Builder(
                context)
                // Set Icon
                .setSmallIcon(R.drawable.batterylow)
                // Set Ticker Message
                .setTicker("Battery Low")
                // Set Title
                .setContentTitle("Low Battery")
                // Set Text
                .setContentText("You have a low battery")
                // Add an Action Button below Notification
                // Dismiss Notification
                .setAutoCancel(true);

        // Create Notification Manager
        NotificationManager notificationmanager = (NotificationManager) context
                .getSystemService(Context.NOTIFICATION_SERVICE);
        // Build Notification with Notification Manager
        notificationmanager.notify(0, builder.build());
        // an Intent broadcast.
    }
}
