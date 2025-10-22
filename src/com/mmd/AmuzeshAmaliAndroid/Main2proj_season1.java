package com.mmd.AmuzeshAmaliAndroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class Main2proj_season1 extends Activity{

	
	
	private Button btn;
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main2proj_season1);
		
		btn=(Button) findViewById(R.id.btnsin);
		
		
		btn.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0) {
				double p=Math.sin(Double.parseDouble(tempproj_season1.in+""));
				
				fact(5);
				tempproj_season1.out=p;
				tempproj_season1.sw=true;
				
				finish();
			}
		});
		
		
		
		
	}

	private int fact(int a){
		
		
		
		
		return 1;
	}
	
	
	
}
