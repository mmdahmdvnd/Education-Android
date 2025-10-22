package com.mmd.AmuzeshAmaliAndroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class Season7Menu extends Activity{
	
	private ImageView imgV1_season7
	,imgV2_season7
	;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.season7menu);
		
		
		ImageView imgV1_season7 =(ImageView) findViewById(R.id.imageView1_season7);
		ImageView imgV2_season7 =(ImageView) findViewById(R.id.imageView2_season7);
		
		
	
		imgV1_season7.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				
				Intent intent1_season7 =new Intent(Season7Menu.this,Mainproj_season7.class);
				startActivity(intent1_season7);
			}
		});
		
		
		imgV2_season7.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				
				Intent intent2_season7 =new Intent(Season7Menu.this,MainFrag_season7.class);
				startActivity(intent2_season7);
			}
		});
		
		
		
	}
  
	
	
}
