package com.mmd.AmuzeshAmaliAndroid;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;


public class Mainproj_season4_3_1 extends Activity implements SensorEventListener {

	private TextView txt;


	private SensorManager sm;
	private Sensor proximity;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainproj_season4_3_1);
        
        txt=(TextView) findViewById(R.id.txt);
        
 
        sm=(SensorManager) getSystemService(Context.SENSOR_SERVICE);
       
        proximity=sm.getDefaultSensor(Sensor.TYPE_PROXIMITY);

    }


	@Override
	public void onAccuracyChanged(Sensor arg0, int arg1) {
		// TODO Auto-generated method stub	
	}


	@Override
	public void onSensorChanged(SensorEvent s) {
		
		txt.setText(s.values[0]+"");	
	}



@Override
	protected void onResume() {
		super.onResume();	
		sm.registerListener(this, proximity, SensorManager.SENSOR_DELAY_NORMAL);	
	}
	
	@Override
	protected void onPause() {
		super.onPause();
		sm.unregisterListener(this);
	}
 
}
