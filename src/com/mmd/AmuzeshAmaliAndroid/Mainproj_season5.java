package com.mmd.AmuzeshAmaliAndroid;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class Mainproj_season5 extends Activity {


    private Button btn1,btn2,btn3,btn4,btn5,btn6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainproj_season5);




        btn1=(Button) findViewById(R.id.btn1);
        btn2=(Button) findViewById(R.id.btn2);
        btn3=(Button) findViewById(R.id.btn3);
        btn4=(Button) findViewById(R.id.btn4);
        btn5=(Button) findViewById(R.id.btn5);
        btn6=(Button) findViewById(R.id.btn6);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PackageManager pm=getPackageManager();
                ComponentName cn=new ComponentName(Mainproj_season5.this,mybroadcast1proj_season5.class);
                pm.setComponentEnabledSetting(cn,PackageManager.COMPONENT_ENABLED_STATE_ENABLED,PackageManager.DONT_KILL_APP);
                Toast.makeText(getApplicationContext(), "ENABLED!", Toast.LENGTH_LONG).show();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PackageManager pm=getPackageManager();
                ComponentName cn=new ComponentName(Mainproj_season5.this,mybroadcast1proj_season5.class);
                pm.setComponentEnabledSetting(cn,PackageManager.COMPONENT_ENABLED_STATE_DISABLED,PackageManager.DONT_KILL_APP);
                Toast.makeText(getApplicationContext(), "DISABLED!", Toast.LENGTH_LONG).show();
            }
        });


        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PackageManager pm=getPackageManager();
                ComponentName cn=new ComponentName(Mainproj_season5.this,Broadcast_smsproj_season5.class);
                pm.setComponentEnabledSetting(cn,PackageManager.COMPONENT_ENABLED_STATE_ENABLED,PackageManager.DONT_KILL_APP);
                Toast.makeText(getApplicationContext(), "ENABLED!", Toast.LENGTH_LONG).show();
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PackageManager pm=getPackageManager();
                ComponentName cn=new ComponentName(Mainproj_season5.this,Broadcast_smsproj_season5.class);
                pm.setComponentEnabledSetting(cn,PackageManager.COMPONENT_ENABLED_STATE_DISABLED,PackageManager.DONT_KILL_APP);
                Toast.makeText(getApplicationContext(), "DISABLED!", Toast.LENGTH_LONG).show();
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                PackageManager pm=getPackageManager();
                ComponentName cn=new ComponentName(Mainproj_season5.this,Broadcast_wifiproj_season5.class);
                pm.setComponentEnabledSetting(cn,PackageManager.COMPONENT_ENABLED_STATE_ENABLED,PackageManager.DONT_KILL_APP);
                Toast.makeText(getApplicationContext(), "ENABLED!", Toast.LENGTH_LONG).show();



            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PackageManager pm=getPackageManager();
                ComponentName cn=new ComponentName(Mainproj_season5.this,Broadcast_wifiproj_season5.class);
                pm.setComponentEnabledSetting(cn,PackageManager.COMPONENT_ENABLED_STATE_DISABLED,PackageManager.DONT_KILL_APP);
                Toast.makeText(getApplicationContext(), "DISABLED!", Toast.LENGTH_LONG).show();
            }
        });


    }

   
}
