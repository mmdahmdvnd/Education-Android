package com.mmd.AmuzeshAmaliAndroid;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.widget.Toast;


public class mybroadcast1proj_season5 extends BroadcastReceiver {
    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public void onReceive(Context context, Intent intent) {




        NotificationManager nm=(NotificationManager) context.getSystemService(Mainproj_season5.NOTIFICATION_SERVICE);
        Notification noti = new Notification.Builder(context)
                .setContentTitle("USB is connected!")
                .setContentText("USB is connected!")
                .setSmallIcon(R.drawable.icon)
                .build();
        nm.notify(1,noti);





    }
}
