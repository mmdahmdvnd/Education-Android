package com.mmd.AmuzeshAmaliAndroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;


public class Mainproj_season2_1 extends Activity {
	
	
	private dbHandlerproj_season2_1 db;
	private Button insert;	
	private Button update;
	
	public  String[] name;
	
	
	private ListView list1;
	
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainproj_season2_1);
       
        insert=(Button) findViewById(R.id.insert);
        update=(Button) findViewById(R.id.update);
        
        list1=(ListView) findViewById(R.id.list);
        
        db=new dbHandlerproj_season2_1(this);
       
       
        
        refresh();
        
       
        
        
        
        insert.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0) {
				
				db.open();
				db.inser("android-mtr-design.ir", "best web site", "android programming");
				Toast.makeText(getApplicationContext(), "Insert completed!", Toast.LENGTH_LONG).show();
				db.close();
				refresh();
			}
        });
        
             
        update.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0) {
				
				db.open();
				
				db.update("Amuzesh-Amali-Android*******", 1, 1);//(Ø´Ù…Ø§Ø±Ù‡ Ø³Ø·Ø± ØŒØ´Ù…Ø§Ø±Ù‡ Ù�ÛŒÙ„Ø¯ ØŒ Ù…Ù‚Ø¯Ø§Ø± Ø¬Ø¯ÛŒØ¯)
				Toast.makeText(getApplicationContext(), "Update completed!", Toast.LENGTH_LONG).show();
				db.close();
				refresh();
			}
        });
        
        
        
    }
    
    public void refresh(){
        db.open();
        int count=db.count();
        name=new String[count];
        for(int i=0;i<count;i++){
        name[i]=db.Display(i,1)+"\n"+db.Display(i, 2)+"\n"+db.Display(i, 3);
        }
        db.close();
        list1.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,name));
        }
    
    
    
}