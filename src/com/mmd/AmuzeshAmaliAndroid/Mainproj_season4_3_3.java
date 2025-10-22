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


public class Mainproj_season4_3_3 extends Activity implements SensorEventListener {

	private TextView txt;
   private ImageView img;

   	private int h;
	private int w;

	private SensorManager sm;
	private Sensor AccM;
	
	private int top=10;
	private int left=10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainproj_season4_3_3);
        
        txt=(TextView) findViewById(R.id.txt);
        img=(ImageView) findViewById (R.id.img);

        DisplayMetrics dm=new DisplayMetrics(); getWindowManager().getDefaultDisplay().getMetrics(dm); 
        h=dm.heightPixels;
        w=dm.widthPixels;
        
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
		
			
				txt.setText("i:"+i+"\n"+"j:"+j);
	

		int x=(int)s.values[0];
		int y=(int)s.values[1];

		if(y<0){
			if(top>0){
			top=top+y*3;
			}
		}else{
			if(top<h-180){
			top=top+y*3;
			}
		}


		if(x<0){	
			if(left<w-110){
			left=left-x*3;
			}
		}else{
			if(left>0){
			left=left-x*3;
			}
		}
	
		RelativeLayout.LayoutParams lp=new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
		lp.setMargins(left, top, 0, 0);
		img.setLayoutParams(lp);
	
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
