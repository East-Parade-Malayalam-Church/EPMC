package com.example.epmc;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.widget.Toast;

public class powerc extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        if(intent.getAction().intern() == Intent.ACTION_POWER_CONNECTED || intent.getAction().intern() == Intent.ACTION_POWER_DISCONNECTED) {
            Notification.Builder builder = new Notification.Builder(
                    context)
                    // Set Icon
                    .setSmallIcon(R.drawable.charging)
                    // Set Ticker Message
                    .setTicker("Charging")
                    // Set Title
                    .setContentTitle("Charging")
                    // Set Text
                    .setContentText("Battery Charging")
                    // Add an Action Button below Notification
                    // Dismiss Notification
                    .setAutoCancel(true);

            // Create Notification Manager
            NotificationManager notificationmanager = (NotificationManager) context
                    .getSystemService(Context.NOTIFICATION_SERVICE);
            // Build Notification with Notification Manager
            notificationmanager.notify(0, builder.build());
            Toast.makeText(context, "Battery status changed", Toast.LENGTH_SHORT).show();
        }
        if(intent.getAction().intern() == Intent.ACTION_AIRPLANE_MODE_CHANGED)
        {
            Toast.makeText(context, "Airplane mode status changed", Toast.LENGTH_SHORT).show();
        }
        ConnectivityManager cm =
                (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
        if(activeNetwork != null) {
            if (activeNetwork.getType() == ConnectivityManager.TYPE_WIFI) {
                Toast.makeText(context, "Wifi Connected", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(context, "Wifi Disonnected", Toast.LENGTH_SHORT).show();

            }
        }
    }
}
