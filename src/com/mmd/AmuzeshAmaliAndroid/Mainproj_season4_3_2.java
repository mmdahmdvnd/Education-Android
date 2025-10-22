package com.mmd.AmuzeshAmaliAndroid;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class Mainproj_season4_3_2 extends Activity implements SensorEventListener {

	private TextView txt;


	private SensorManager sm;
	private Sensor AccM;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainproj_season4_3_2);
        
        txt=(TextView) findViewById(R.id.txt);
        
 
        sm=(SensorManager) getSystemService(Context.SENSOR_SERVICE);
       
        AccM=sm.getDefaultSensor(Sensor.TYPE_ACCELEROMETER); 

    }


	@Override
	public void onAccuracyChanged(Sensor arg0, int arg1) {
		// TODO Auto-generated method stub	
	}


	@Override
	public void onSensorChanged(SensorEvent s) {
		
		float i=s.values[0];
		float j=s.values[1];
		float k=s.values[2];
			
				txt.setText("i:"+i+"\n"+"j:"+j+"\n"+"k"+k);
		
	}



@Override
	protected void onResume() {
		super.onResume();	
		sm.registerListener(this, AccM, SensorManager.SENSOR_DELAY_NORMAL);	
	}
	
	@Override
	protected void onPause() {
		super.onPause();
		sm.unregisterListener(this);
	}
 
}

