package com.mmd.AmuzeshAmaliAndroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class Menu extends Activity {
	
	private ImageView imgV1m,imgV2m,imgV3m,imgV4m,imgV5m,imgV6m,imgV7m,imgV8m;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu);
		
		ImageView imgV1m = (ImageView) findViewById(R.id.imageView1menu);
		ImageView imgV2m = (ImageView) findViewById(R.id.imageView2menu);
		ImageView imgV3m = (ImageView) findViewById(R.id.imageView3menu);
		ImageView imgV4m = (ImageView) findViewById(R.id.imageView4menu);
		ImageView imgV5m = (ImageView) findViewById(R.id.imageView5_menu);
    	ImageView imgV6m = (ImageView) findViewById(R.id.imageView6menu);
    	ImageView imgV7m = (ImageView) findViewById(R.id.imageView7menu);
    	ImageView imgV8m = (ImageView) findViewById(R.id.imageView8menu);
		
		imgV1m.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				Intent intent1m = new Intent(Menu.this,Season1Menu.class); 
				startActivity(intent1m);
			}			
		});
		
		
		
		imgV2m.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				Intent intent2m = new Intent(Menu.this,Season2Menu.class);
				startActivity(intent2m);
			}			
		});
		
		
		
		imgV3m.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				Intent intent3m = new Intent(Menu.this,Season3Menu.class);
				startActivity(intent3m);
			}			
		});
	
		
		
		imgV4m.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				Intent intent4m = new Intent(Menu.this,Season4Menu.class);
				startActivity(intent4m);
			}			
		});
	
		
		imgV5m.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				Intent intent5m = new Intent(Menu.this,Season5Menu.class);
				startActivity(intent5m);
			}			
		});
	
		
		
		imgV6m.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				Intent intent6m = new Intent(Menu.this,Season6Menu.class);
				startActivity(intent6m);
			}			
		});
		
	
		imgV7m.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				Intent intent7m = new Intent(Menu.this,Season7Menu.class);
				startActivity(intent7m);
				
			}
			
		});
		
		
		imgV8m.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				Intent intent8m = new Intent(Menu.this,Season8Menu.class);
				startActivity(intent8m);
				
			}
			
		});
		
	}

}
