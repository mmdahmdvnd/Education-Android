package com.mmd.AmuzeshAmaliAndroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class updateproj_season2_3 extends Activity{

	private EditText name;
	private EditText family;
	private EditText address;
	private EditText email;
	private EditText number;
	
	private Button update;
	private Button cancel;
	
	private String id;
	private dbHandlerproj_season2_3 db;
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.updateproj_season2_3);
		
		db=new dbHandlerproj_season2_3(this);
		
		Bundle extra=getIntent().getExtras();
		
		id=extra.getString("id");		
		
		name=(EditText) findViewById(R.id.update_name);
		family=(EditText) findViewById(R.id.update_family);
		address=(EditText) findViewById(R.id.update_address);
		email=(EditText) findViewById(R.id.update_email);
		number=(EditText) findViewById(R.id.update_number);
		
		update=(Button) findViewById(R.id.update_update);
		cancel=(Button) findViewById(R.id.update_cancel);
		
		db.open();
		name.setText(db.display2(Integer.parseInt(id), 1));
		family.setText(db.display2(Integer.parseInt(id), 2));
		address.setText(db.display2(Integer.parseInt(id), 3));
		email.setText(db.display2(Integer.parseInt(id), 4));
		number.setText(db.display2(Integer.parseInt(id), 5));
		db.close();
		
		
		update.setOnClickListener(new OnClickListener(){

			
			public void onClick(View arg0) {
				
				db.open();
				db.update(name.getText().toString(), family.getText().toString(), address.getText().toString(), email.getText().toString(), number.getText().toString(),Integer.parseInt(id));
				db.close();
				Toast.makeText(getApplicationContext(), "به روز رسانی با موفقیت انام شد", Toast.LENGTH_LONG).show();
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
