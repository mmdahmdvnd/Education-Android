package com.mmd.AmuzeshAmaliAndroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class Season6Menu extends Activity{
	
	private ImageView imgV1_season6
	,imgV2_season6
	;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.season6menu);
		
		
		ImageView imgV1_season6 =(ImageView) findViewById(R.id.imageView1_season6);
		ImageView imgV2_season6 =(ImageView) findViewById(R.id.imageView2_season6);
		
		
		
		imgV1_season6.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				
				Intent intent1_season6 =new Intent(Season6Menu.this,Mainproj_season6_.class);
				startActivity(intent1_season6);
			}
		});
		
		
		imgV2_season6.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				
				Intent intent2_season6 =new Intent(Season6Menu.this,MainFrag_season6.class);
				startActivity(intent2_season6);
			}
		});
		
		
		
	}
  
	
	
}
