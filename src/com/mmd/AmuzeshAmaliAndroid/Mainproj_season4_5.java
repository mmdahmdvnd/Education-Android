package com.mmd.AmuzeshAmaliAndroid;

import java.io.File;
import java.io.IOException;

import android.media.MediaPlayer;
import android.media.MediaRecorder;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Mainproj_season4_5 extends Activity {

	
	private ImageView rec;
	private TextView status;
	private TextView last;
	
	
	private MediaRecorder mr;
	private MediaPlayer mp;
	
	private String lpath="";
	private String lname="";
	
	private boolean st=false;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainproj_season4_5);
        
        rec=(ImageView) findViewById(R.id.rec);
        status=(TextView) findViewById(R.id.status);
        last=(TextView) findViewById(R.id.last);
       
        
       
       
       
        File f=new File(Environment.getExternalStorageDirectory().getPath()+"/myrec");
        if(!f.exists()){
        	f.mkdir();
        }
        

        rec.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				if(st==false){
					
					st=true;
					record();
					rec.setImageResource(R.drawable.stop);
					status.setText("Playing ...");
					
					
					
				}else{
					
					st=false;
					mr.stop();
					mr.release();
					mr = null;
					rec.setImageResource(R.drawable.rec);
					status.setText("Ready !");
					last.setText(lname+"");
				}
				
				
			}
		});
        
        
        
        
        last.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				play();
				
				
			}
		});
        
    }

    
  
    private void record(){
    	
    	mr=new MediaRecorder();
    	mr.setAudioSource(MediaRecorder.AudioSource.MIC);
    	mr.setOutputFormat(MediaRecorder.OutputFormat.DEFAULT);
    	mr.setAudioEncoder(MediaRecorder.AudioEncoder.DEFAULT);
    	lpath=Environment.getExternalStorageDirectory().getPath()+"/myrec/"+System.currentTimeMillis()+".amr";
    	lname=System.currentTimeMillis()+".amr";
    	mr.setOutputFile(lpath);
    	
    	try{
    		
    		mr.prepare();
	
    	}catch(IllegalStateException e){
    		
    	}catch(IOException e){
    		
    		
    	}
    	mr.start();
    }

    private void play(){
	  mp=new MediaPlayer();
	  
	  try{
		  mp.setDataSource(lpath);
		  mp.prepare();
		  mp.start(); 
		  
	  }catch(IOException e){
		  
	  }
	  
	  
	  
    }
    
    
    
    
    
    
    
}
