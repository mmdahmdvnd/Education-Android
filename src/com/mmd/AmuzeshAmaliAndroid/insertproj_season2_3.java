package com.mmd.AmuzeshAmaliAndroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class insertproj_season2_3 extends Activity{

	private EditText name;
	private EditText family;
	private EditText address;
	private EditText email;
	private EditText number;
	
	private Button insert;
	private Button cancel;
	
	private dbHandlerproj_season2_3 db;
	
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.insertproj_season2_3);
		
		db=new dbHandlerproj_season2_3(this);
		
		
		name=(EditText) findViewById(R.id.insert_name);
		family=(EditText) findViewById(R.id.insert_family);
		address=(EditText) findViewById(R.id.insert_address);
		email=(EditText) findViewById(R.id.insert_email);
		number=(EditText) findViewById(R.id.insert_number);
		
		insert=(Button) findViewById(R.id.insert_insert);
		cancel=(Button) findViewById(R.id.insert_cancel);
		
		
		insert.setOnClickListener(new OnClickListener(){

			
			public void onClick(View arg0) {
				db.open();
				db.insert(name.getText().toString(), family.getText().toString(), address.getText().toString(), email.getText().toString(), number.getText().toString());
				db.close();
			    Toast.makeText(getApplicationContext(), "مخاطب جدید با موفقیت اضافه شد",Toast.LENGTH_LONG).show();
			    finish();
			    
			}
			
			
		});
		
		
cancel.setOnClickListener(new OnClickListener(){

			
			public void onClick(View arg0) {
				
			    finish();
			    
			}
			
			
		});
		
		
		
	}

}
