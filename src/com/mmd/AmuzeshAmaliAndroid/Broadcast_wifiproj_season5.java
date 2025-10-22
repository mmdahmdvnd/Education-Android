package com.mmd.AmuzeshAmaliAndroid;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;


public class Broadcast_wifiproj_season5 extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {




        NotificationManager nm=(NotificationManager) context.getSystemService(Mainproj_season5.NOTIFICATION_SERVICE);
        Notification noti = new Notification.Builder(context)
                .setContentTitle("Wifi is Turn On!")
                .setContentText("Wifi is Turn On!")
                .setSmallIcon(R.drawable.icon)
                .build();
        nm.notify(1,noti);




    }
}
