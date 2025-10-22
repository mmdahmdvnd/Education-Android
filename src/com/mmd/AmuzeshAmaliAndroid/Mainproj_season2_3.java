package com.mmd.AmuzeshAmaliAndroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;


public class Mainproj_season2_3 extends Activity {
	
	
	private dbHandlerproj_season2_3 db;
	private Button insert;
	private Button delete;
	private Button update;
	
	public  String[] name;
	public int[] id;
	
	private ListView list1;
	
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainproj_season2_3);

        insert=(Button) findViewById(R.id.main_insert);
        
        
        list1=(ListView) findViewById(R.id.list);
        db=new dbHandlerproj_season2_3(this);
       
       list1.setOnItemClickListener(new OnItemClickListener(){

		@Override
		public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,long arg3) {
			
			
			//Toast.makeText(getApplicationContext(), id[arg2]+"", Toast.LENGTH_LONG).show();
			Intent contact=new Intent(Mainproj_season2_3.this,contactproj_season2_3.class);
			contact.putExtra("id", id[arg2]+"");
			startActivity(contact);
			
		}
    	   
       });
        
        
        
        insert.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0) {
				
				Intent insert=new Intent(Mainproj_season2_3.this, insertproj_season2_3.class);
				startActivity(insert);
			}
        });
        
        
        
        
        /*
        delete.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0) {
				
				db.open();
				db.delete(3);
				Toast.makeText(getApplicationContext(), "Delete completed!", Toast.LENGTH_LONG).show();
				db.close();
				refresh();
				
			}
        });
        
        
        update.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0) {
				
				db.open();
				
				db.update("pouriya", 1, 5);//(شماره سطر ،شماره فیلد ، مقدار جدید)
				Toast.makeText(getApplicationContext(), "Update completed!", Toast.LENGTH_LONG).show();
				db.close();
				refresh();
			}
        });
        
        */
        
    }
    
    public void refresh(){
        
    	db.open();
        int count=db.count();
        name=new String[count];
        id=new int[count];
        
        
        for(int i=0;i<count;i++){
        name[i]=db.Display(i,1)+"\n"+db.Display(i, 2);
        id[i]=Integer.parseInt(db.Display(i, 0));
        }
        db.close();
        list1.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,name));
        }

	@Override
	protected void onResume() {
		
		super.onResume();
		 refresh();
	}
    
    
    
}