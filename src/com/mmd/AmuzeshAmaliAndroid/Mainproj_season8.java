package com.mmd.AmuzeshAmaliAndroid;

import java.util.ArrayList;

import android.net.Uri;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.app.Activity;
import android.database.Cursor;

public class Mainproj_season8 extends Activity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mainproj_season8);
		
		ListView lv = (ListView)findViewById(R.id.my_sms);
		
		if (fetch_inbox() != null)
		{
			ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
			android.R.layout.simple_list_item_1,fetch_inbox());
			lv.setAdapter(adapter);
		}
	}
	
	public ArrayList<String> fetch_inbox()
	{
		ArrayList<String> sms = new ArrayList<String>();
		
		Uri a = Uri.parse("content://sms/inbox");
		
		Cursor b = getContentResolver().query(a, new String[]{"_id",
		"address","date","body"}, null, null, null);
		
		b.moveToFirst();
		
		while(b.moveToNext())
		{	
			String address = b.getString(1);
			String body    = b.getString(3);
			sms.add("Address => " + address + "\nBody => " + body);
		
		}
		
		return sms;
	}
	
}
