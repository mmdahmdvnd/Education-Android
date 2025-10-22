package com.mmd.AmuzeshAmaliAndroid;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Mainproj_season2_2 extends Activity {

	private databseproj_season2_2 db1;
	private Button btn;
	private TextView txt1;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mainproj_season2_2);
		db1=new databseproj_season2_2(this);
		
		db1.database();
		
		db1.open();
		
		txt1=(TextView) findViewById(R.id.txt1_season2_2);
		btn=(Button) findViewById(R.id.btn1_season2_2);
		
		
		btn.setOnClickListener(new OnClickListener(){

			
			public void onClick(View arg0) {
				
				txt1.setText(db1.Display(0, 2));
				
			}
			
			
		});
		
		
		
	}

	
}
