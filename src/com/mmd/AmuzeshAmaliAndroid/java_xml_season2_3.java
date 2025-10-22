package com.mmd.AmuzeshAmaliAndroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class java_xml_season2_3 extends Activity{

	private ImageView img1,img2;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.java_xml_season2_3);
		 
		img1 = (ImageView) findViewById(R.id.imv1_java_xml_season2_3);
		img2 = (ImageView) findViewById(R.id.imv2_java_xml_season2_3);
		
		
		
		img1.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				
				Intent intent2_season1 =new Intent(java_xml_season2_3.this,MainFrag_java_season2_3.class);
				startActivity(intent2_season1);
			}
		});
		
		
		
		img2.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				
				Intent intent2_season1 =new Intent(java_xml_season2_3.this,MainFrag_xml_season2_3.class);
				startActivity(intent2_season1);
			}
		});
		
		
		
		
		
	} 
	
	
	}
	
	
	
	
	

