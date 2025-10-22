package com.mmd.AmuzeshAmaliAndroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class Season5Menu extends Activity{
	
	private ImageView imgV1_season5
	,imgV2_season5
	;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.season5menu);
		
		
		ImageView imgV1_season5 =(ImageView) findViewById(R.id.imageView1_season5);
		ImageView imgV2_season5 =(ImageView) findViewById(R.id.imageView2_season5);
		
		
		
		imgV1_season5.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				
				Intent intent1_season5 =new Intent(Season5Menu.this,Mainproj_season5.class);
				startActivity(intent1_season5);
			}
		});
		
		
		imgV2_season5.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				
				Intent intent2_season5 =new Intent(Season5Menu.this,MainFrag_season5.class);
				startActivity(intent2_season5);
			}
		});
		
		
		
	}
  
	
	
}
