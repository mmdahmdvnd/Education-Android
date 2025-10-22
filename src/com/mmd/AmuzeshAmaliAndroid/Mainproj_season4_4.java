package com.mmd.AmuzeshAmaliAndroid;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;

public class Mainproj_season4_4 extends Activity {

	
	
	private SeekBar seek;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainproj_season4_4);
        
        
        seek=(SeekBar)findViewById(R.id.seekBar1);
        
     
        
        seek.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
			
			@Override
			public void onStopTrackingTouch(SeekBar arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onStartTrackingTouch(SeekBar arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onProgressChanged(SeekBar arg0, int p, boolean arg2) {
				// TODO Auto-generated method stub
				
				
				WindowManager.LayoutParams lp=getWindow().getAttributes();
				lp.screenBrightness=p/100f;
				getWindow().setAttributes(lp);
				
				
			}
		});
        
        
        
        
    }


    
    
}

