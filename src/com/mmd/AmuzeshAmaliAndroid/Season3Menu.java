package com.mmd.AmuzeshAmaliAndroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class Season3Menu extends Activity{
	
	private ImageView img1_3,img2_3,img3_3,img4_3;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.season3menu);
		
		ImageView img1_3 = (ImageView) findViewById(R.id.imageView1_season3);
		ImageView img2_3 = (ImageView) findViewById(R.id.imageView2_season3);
		ImageView img3_3 = (ImageView) findViewById(R.id.imageView3_season3);
		ImageView img4_3 = (ImageView) findViewById(R.id.imageView4_season3);
		
		
		
		img1_3.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				Intent intent1_3 = new Intent(Season3Menu.this,Mainproj_season3_1.class);			
			startActivity(intent1_3);
			}			
		});
		
		
		
		img2_3.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				Intent intent3_1 = new Intent(Season3Menu.this, MainFrag_season3_1.class);
				startActivity(intent3_1);
			}			
		});
		
		
		
		img3_3.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				Intent intent3_3 = new Intent(Season3Menu.this,Mainproj_season3_2.class);
				startActivity(intent3_3);
			}			
		});
		
		
		
		img4_3.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				Intent intent3_2 = new Intent(Season3Menu.this, MainFrag_season3_2.class);	
				startActivity(intent3_2);
			}			
		});
		
		
	}

}
