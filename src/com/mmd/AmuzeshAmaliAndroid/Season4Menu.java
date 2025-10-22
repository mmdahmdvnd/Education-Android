package com.mmd.AmuzeshAmaliAndroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class Season4Menu extends Activity{
	
	private ImageView img1_4,img2_4,img3_4,img4_4,img5_1_4,img5_2_4,img5_3_4,img5_4_4,img5_5_4,img5_6_4,
	img7_4,img8_4,img9_4,img10_4,img11_4,img12_4;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.season4menu);
		
		
		ImageView img1_4 = (ImageView) findViewById(R.id.imageView1_season4);
		ImageView img2_4 = (ImageView) findViewById(R.id.imageView2_season4);
		ImageView img3_4 = (ImageView) findViewById(R.id.imageView3_season4);
		ImageView img4_4 = (ImageView) findViewById(R.id.imageView4_season4);
		
		ImageView img5_1_4 = (ImageView) findViewById(R.id.imageView5_1_season4);
		ImageView img5_2_4 = (ImageView) findViewById(R.id.imageView5_2_season4);
		ImageView img5_3_4 = (ImageView) findViewById(R.id.imageView5_3_season4);
		ImageView img5_4_4 = (ImageView) findViewById(R.id.imageView5_4_season4);
		ImageView img5_5_4 = (ImageView) findViewById(R.id.imageView5_5_season4);
		ImageView img5_6_4 = (ImageView) findViewById(R.id.imageView5_6_season4);
		
		ImageView img7_4 = (ImageView) findViewById(R.id.imageView7_season4);
		ImageView img8_4 = (ImageView) findViewById(R.id.imageView8_season4);
		ImageView img9_4 = (ImageView) findViewById(R.id.imageView9_season4);
		ImageView img10_4 = (ImageView) findViewById(R.id.imageView10_season4);
		ImageView img11_4 = (ImageView) findViewById(R.id.imageView11_season4);
		ImageView img12_4 = (ImageView) findViewById(R.id.imageView12_season4);
		
		
		
		img1_4.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				Intent intent1_4 = new Intent(Season4Menu.this,Mainproj_season4_1.class);			
			startActivity(intent1_4);
			}			
		});
		
		
		
		img2_4.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				Intent intent2_4 = new Intent(Season4Menu.this, MainFrag_season4_1.class);
				startActivity(intent2_4);
			}			
		});
		
		
		
		img3_4.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				Intent intent3_4 = new Intent(Season4Menu.this,Mainproj_season4_2.class);
				startActivity(intent3_4);
			}			
		});
		
		
		
		img4_4.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				Intent intent4_4 = new Intent(Season4Menu.this, MainFrag_season4_2.class);
				startActivity(intent4_4);			
			}			
		});
		
		
		img5_1_4.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				Intent intent5_1_4 = new Intent(Season4Menu.this,Mainproj_season4_3_1.class);			
			startActivity(intent5_1_4);
			}			
		});
		
		
		
		img5_2_4.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				Intent intent5_2_4 = new Intent(Season4Menu.this, MainFrag_season4_3_1.class);
				startActivity(intent5_2_4);		
			}			
		});
		
		
		
		img5_3_4.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				Intent intent5_3_4 = new Intent(Season4Menu.this,Mainproj_season4_3_2.class);
				startActivity(intent5_3_4);
			}			
		});
		
		
		
		img5_4_4.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				Intent intent5_4_4 = new Intent(Season4Menu.this, MainFrag_season4_3_2.class);
				startActivity(intent5_4_4);		
			}			
		});
		
		
		
		img5_5_4.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				Intent intent5_5_4 = new Intent(Season4Menu.this,Mainproj_season4_3_3.class);			
			startActivity(intent5_5_4);
			}			
		});
		
		
		
		img5_6_4.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				Intent intent5_6_4 = new Intent(Season4Menu.this, MainFrag_season4_3_3.class);
				startActivity(intent5_6_4);		
			}			
		});
		
		
		
		img7_4.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				Intent intent7_4 = new Intent(Season4Menu.this,Mainproj_season4_4.class);
				startActivity(intent7_4);
			}			
		});
		
		
		
		img8_4.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				Intent intent8_4 = new Intent(Season4Menu.this, MainFrag_season4_4.class);
				startActivity(intent8_4);		
			}			
		});
		
		
		
		img9_4.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				Intent intent9_4 = new Intent(Season4Menu.this,Mainproj_season4_5.class);			
			startActivity(intent9_4);
			}			
		});
		
		
		
		img10_4.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				Intent intent10_4 = new Intent(Season4Menu.this, MainFrag_season4_5.class);
				startActivity(intent10_4);				
			}			
		});
		
		
		
		img11_4.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				Intent intent11_4 = new Intent(Season4Menu.this,Mainproj_season4_6.class);
				startActivity(intent11_4);
			}			
		});
		
		
		
		img12_4.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				Intent intent12_4 = new Intent(Season4Menu.this, MainFrag_season4_6.class);
				startActivity(intent12_4);			
			}			
		});
		
		
		
	}

}
