package com.mmd.AmuzeshAmaliAndroid;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import android.hardware.Camera;
import android.hardware.Camera.PictureCallback;
import android.os.Bundle;
import android.os.Environment;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Toast;

public class Mainproj_season4_6 extends Activity {

	private Camera cam;
	private campreview_season4_6 cp;
	private Button btn;
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainproj_season4_6);
        
        btn=(Button) findViewById(R.id.btn);
        
        try{
        	cam=Camera.open();
        }catch(Exception e){
 	
        }
        
    	cp=new campreview_season4_6(this,cam);
    	
    	FrameLayout fl=(FrameLayout) findViewById(R.id.fl1);
    	
    	fl.addView(cp); 
        
    	btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
			
				cam.takePicture(null, null, mpic);
				String path=Environment.getExternalStorageDirectory().getPath()+"/mypic/"+System.currentTimeMillis()+".jpg";
				Toast.makeText(getApplicationContext(), path, Toast.LENGTH_LONG).show();
				
			}
		});
    	
        
        
    }

   
    
    private PictureCallback mpic=new PictureCallback() {
		
		@Override
		public void onPictureTaken(byte[] data, Camera camera) {
		
			File f1=new File(Environment.getExternalStorageDirectory().getPath()+"/mypic");
			if(!f1.exists()){
				
				f1.mkdir();
			}
			
			
			File f2=new File(Environment.getExternalStorageDirectory().getPath()+"/mypic/"+System.currentTimeMillis()+".jpg");
			
			try{
				
				FileOutputStream fos=new FileOutputStream(f2);
				fos.write(data);
				fos.close();

			}catch(IOException e){
				
				
			}
			
			
		}
	};
    
    
    
}