package com.mmd.AmuzeshAmaliAndroid;

import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import android.widget.ToggleButton;

public class Mainproj_season4_1 extends Activity {

	
	private ToggleButton tg1;
	private ToggleButton tg2;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainproj_season4_1);
        
        
        tg1=(ToggleButton) findViewById(R.id.tg1);
        tg2=(ToggleButton) findViewById(R.id.tg2);
        
        
        final BluetoothAdapter b= BluetoothAdapter.getDefaultAdapter();
        
        final WifiManager w=(WifiManager) getSystemService(WIFI_SERVICE);
        
        
        
        if(b.isEnabled()){
        	
        	tg1.setChecked(true);
        	
        }else{
        	
        	tg1.setChecked(false);
        	
        }
        
        
        if(w.isWifiEnabled()){
        	
        	tg2.setChecked(true);
        	
        }else{
        	
        	tg2.setChecked(false);
        	
        }
        
        

        tg1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
			
				if(tg1.getText().equals("روشن")){
					
					b.enable();
					Toast.makeText(getApplicationContext(), "بلوتوث در حال روشن شدن ...",Toast.LENGTH_LONG).show();
					
				}else{
					
					b.disable();
					Toast.makeText(getApplicationContext(), "بلوتوث خاموش است",Toast.LENGTH_LONG).show();
				}
				
				
				
				
				
			}
		});
        
        
        
        
        tg2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
			
				if(tg2.getText().equals("روشن")){
					
					w.setWifiEnabled(true);
					Toast.makeText(getApplicationContext(), "wi-fi is turn on ...",Toast.LENGTH_LONG).show();
					
				}else{
					
					w.setWifiEnabled(false);
					Toast.makeText(getApplicationContext(), "wi-fi is turn off ...",Toast.LENGTH_LONG).show();
				}
				
				
				
				
				
			}
		});
        
    }


   
    
}
