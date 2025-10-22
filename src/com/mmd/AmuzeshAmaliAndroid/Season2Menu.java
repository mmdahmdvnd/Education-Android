package com.mmd.AmuzeshAmaliAndroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class Season2Menu extends Activity{
	
	private ImageView imgV1_season2,imgV2_season2,imgV3_season2,imgV4_season2,imgV5_season2,imgV6_season2;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.season2menu);
		
		
		ImageView imgV1_season2 =(ImageView) findViewById(R.id.imageView1_season2);
		ImageView imgV2_season2 =(ImageView) findViewById(R.id.imageView2_season2);
		ImageView imgV3_season2 =(ImageView) findViewById(R.id.imageView3_season2);
		ImageView imgV4_season2 =(ImageView) findViewById(R.id.imageView4_season2);
		ImageView imgV5_season2 =(ImageView) findViewById(R.id.imageView5_season2);
		ImageView imgV6_season2 =(ImageView) findViewById(R.id.imageView6_season2);
		
		
		
		imgV1_season2.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				
				Intent intent1_season2 =new Intent(Season2Menu.this,Mainproj_season2_1.class);
				startActivity(intent1_season2);
			}
		});
		
		
		imgV2_season2.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				
				Intent intent2_season2 =new Intent(Season2Menu.this,MainFrag_season2_1.class);
				startActivity(intent2_season2);
			}
		});
		
		imgV3_season2.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				
				Intent intent3_season2 =new Intent(Season2Menu.this,Mainproj_season2_2.class);
				startActivity(intent3_season2);
			}
		});
		
		
		imgV4_season2.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				
				Intent intent4_season2 =new Intent(Season2Menu.this,MainFrag_season2_2.class);
				startActivity(intent4_season2);
			}
		});
		
		
		imgV5_season2.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				
				Intent intent5_season2 =new Intent(Season2Menu.this,Mainproj_season2_3.class);
				startActivity(intent5_season2);
			}
		});
		
		
		imgV6_season2.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				
				Intent intent6_season2 =new Intent(Season2Menu.this,java_xml_season2_3.class);
				startActivity(intent6_season2);
			}
		});
		
		
		
		
	}
 
	
	
}
