package com.mmd.AmuzeshAmaliAndroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class Season1Menu extends Activity{
	
	private ImageView imgV1_season1,imgV2_season1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.season1menu);
		
		
		ImageView imgV1_season1 =(ImageView) findViewById(R.id.imageView1_season1);
		ImageView imgV2_season1 =(ImageView) findViewById(R.id.imageView2_season1);
		
		
		
		imgV1_season1.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				
				Intent intent1_season1 =new Intent(Season1Menu.this,Main1proj_season1.class);
				startActivity(intent1_season1);
			}
		});
		
		
		imgV2_season1.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				
				Intent intent2_season1 =new Intent(Season1Menu.this,MainFrag_season1.class);
				startActivity(intent2_season1);
			}
		});
		
		
		
	}
  
	
	
}
