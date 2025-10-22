package com.mmd.AmuzeshAmaliAndroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class Season8Menu extends Activity{
	
	private ImageView imgV1_season8_
	,imgV2_season8
	;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.season8menu);
		
		
		ImageView imgV1_season8_ =(ImageView) findViewById(R.id.imageView1_season8_);
		ImageView imgV2_season8 =(ImageView) findViewById(R.id.imageView2_season8);
		
		
		
		imgV1_season8_.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				
				Intent intent1_season8_ =new Intent(Season8Menu.this,Mainproj_season8.class);
				startActivity(intent1_season8_);
			}
		});
		
		
		imgV2_season8.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				
				Intent intent2_season8 =new Intent(Season8Menu.this,MainFrag_season8.class);
				startActivity(intent2_season8);
			}
		});
		
		
		
	}
  
	
	
}
