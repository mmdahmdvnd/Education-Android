package com.mmd.AmuzeshAmaliAndroid;

import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Mainproj_season4_2 extends Activity {

	
	private Button get;
	private TextView txt;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainproj_season4_2);
        
        get=(Button) findViewById(R.id.getloc);
        txt=(TextView) findViewById(R.id.txt);
        
  
        get.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub

				gps();
				
			}
		});
 
 
    }
    
    
    
    
    private void gps(){
    	
    	
    	LocationManager lm=null;
    	LocationListener ll=new gpsproj_season4_2();
    	
    	lm=(LocationManager) getSystemService(Context.LOCATION_SERVICE);
    	
    	lm.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, ll);
    	
    	txt.setText(gpsproj_season4_2.lat+"\n"+gpsproj_season4_2.lon);
    	
    	
    	
    	
    }
    
    
 
}