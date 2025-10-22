package com.mmd.AmuzeshAmaliAndroid;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class contactproj_season2_3 extends Activity {

	private TextView name;
	private TextView family;
	private TextView address;
	private TextView email;
	private TextView number;
	
	private Button update;
	private Button delete;
	
	private Button call;
	private Button sms;
	
	private dbHandlerproj_season2_3 db;
	private String id;
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.contactproj_season2_3);
		
		db=new dbHandlerproj_season2_3(this);
		Bundle extra=getIntent().getExtras();
		
		id=extra.getString("id");
		
		
		name=(TextView) findViewById(R.id.contact_name1);
		
		family=(TextView) findViewById(R.id.contact_family1);
		address=(TextView) findViewById(R.id.contact_address1);
		email=(TextView) findViewById(R.id.contact_email1);
		number=(TextView) findViewById(R.id.contact_number1);
		
		update=(Button) findViewById(R.id.contact_update);
		delete=(Button) findViewById(R.id.contact_delete);
		
		
		call=(Button) findViewById(R.id.contact_call);
		sms=(Button) findViewById(R.id.contact_sms);
		
		db.open();
		name.setText(db.display2(Integer.parseInt(id), 1));
		family.setText(db.display2(Integer.parseInt(id), 2));
		address.setText(db.display2(Integer.parseInt(id), 3));
		email.setText(db.display2(Integer.parseInt(id), 4));
		number.setText(db.display2(Integer.parseInt(id), 5));
		db.close();
		
		
		update.setOnClickListener(new OnClickListener(){

		
			public void onClick(View arg0) {
				
				Intent update=new Intent(contactproj_season2_3.this,updateproj_season2_3.class);
				update.putExtra("id", id+"");
				
				startActivity(update);
				
			}
			
			
		});
		
		delete.setOnClickListener(new OnClickListener(){

			
			public void onClick(View arg0) {
				
				db.open();
				db.delete(Integer.parseInt(id));
				db.close();
				finish();
			}
			
			
		});
		
			call.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0) {
				
				startActivityForResult(new Intent("android.intent.action.CALL",Uri.parse("tel:"+number.getText().toString())), 1);
				
			}
			
			
		});

			sms.setOnClickListener(new OnClickListener(){
				public void onClick(View arg0) {
		
					startActivity(new  Intent(Intent.ACTION_VIEW,Uri.parse("sms:"+number.getText().toString())));
				}
	
	
});
		
		
	}
	@Override
	protected void onResume() {
		
		super.onResume();
		
		db.open();
		name.setText(db.display2(Integer.parseInt(id), 1));
		family.setText(db.display2(Integer.parseInt(id), 2));
		address.setText(db.display2(Integer.parseInt(id), 3));
		email.setText(db.display2(Integer.parseInt(id), 4));
		number.setText(db.display2(Integer.parseInt(id), 5));
		db.close();
	}

}
