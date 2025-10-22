package com.mmd.AmuzeshAmaliAndroid;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Scanner;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore.Files;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.ListActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Mainproj_season3_2 extends ListActivity {

   
	
	
	private ArrayList<String> mylist;
	private String address;
	
	
	private int swp=0;
	private String namep="";
	private String addressp="";
	
	private TextView txt1;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainproj_season3_2);
        
        txt1=(TextView)findViewById(R.id.cb);
        refresh(Environment.getExternalStorageDirectory().toString());
        
        
       
        
        ListView lv = getListView();
        lv.setOnItemLongClickListener(new OnItemLongClickListener() {
            public boolean onItemLongClick(AdapterView<?> arg0, View arg1,int row, long arg3) {

            	// your code
            	return true;
            }
        });
        
        
        
    }


    private void refresh(String path){

    	mylist=new ArrayList<String>();
    	address=path;
        File myfile=new File(path);
        File listfile[]=myfile.listFiles();
        
        for(int i=0;i<listfile.length;i++){
        	
        	mylist.add(listfile[i].getName());
        }
        
        txt1.setText(address);
        setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,mylist));
    }
    
    
  

    
    @Override
    protected void onListItemClick(ListView l, View v, final int position, long id) {

    	super.onListItemClick(l, v, position, id);
    	
    	
    	 AlertDialog.Builder builder = new AlertDialog.Builder(this);
         LayoutInflater inflater = this.getLayoutInflater();
         View row = inflater.inflate(R.layout.dialogproj_season3_2, null);
         builder.setView(row);

 		Button open = (Button)row.findViewById(R.id.open);
 		Button copy = (Button)row.findViewById(R.id.copy);
 		Button cut = (Button)row.findViewById(R.id.cut);
 		Button paste = (Button)row.findViewById(R.id.paste);
 		Button delete = (Button)row.findViewById(R.id.delete);
 		Button rename = (Button)row.findViewById(R.id.rename);
 	
 		
 		final AlertDialog alert11 = builder.create();
        alert11.show();
         

        open.setOnClickListener(new OnClickListener() {
        	public void onClick(View arg0) {
 		
        		
 			
        		
        		
        		File temp=new File(address,mylist.get(position).toString());
            	
            	if(temp.isFile()){
            		
            		
            		Toast.makeText(getApplicationContext(), "This is File !!", Toast.LENGTH_LONG).show();
            		
            	
            		
            	}else{
            		
            		refresh(address+"/"+mylist.get(position).toString());
            		
            	}
        		alert11.cancel();
        	}
        });
   
        copy.setOnClickListener(new OnClickListener() {
        	public void onClick(View arg0) {
        		
        		addressp=address;
        		namep=mylist.get(position);
        		swp=1;
        		alert11.cancel();
        	}
        });
        
        cut.setOnClickListener(new OnClickListener() {
        	public void onClick(View arg0) {
 		
        		addressp=address;
        		namep=mylist.get(position);
        		swp=2;
        		alert11.cancel();
        	}
        });
        
        
        paste.setOnClickListener(new OnClickListener() {
        	public void onClick(View arg0) {
        		
        		paste();
        		alert11.cancel();
        	}
        });
        
        
        delete.setOnClickListener(new OnClickListener() {
        	public void onClick(View arg0) {
 		
 			
        		File file = new File(address+"/"+mylist.get(position));
        		boolean deleted = file.delete();
        		if(deleted){
        			
        			Toast.makeText(getApplicationContext(), "Delete Completed!!", Toast.LENGTH_LONG).show();	
        		}else{
        			Toast.makeText(getApplicationContext(), "Delete not Completed!!", Toast.LENGTH_LONG).show();	
        		}
        	}
        });
        
        rename.setOnClickListener(new OnClickListener() {
        	public void onClick(View arg0) {
 		
        		File file = new File(address+"/"+mylist.get(position));
        		boolean success = file.renameTo(new File(address+"/"+"newname"));
        		if(success){
        			
        			Toast.makeText(getApplicationContext(), "Rename Completed!!", Toast.LENGTH_LONG).show();	
        		}else{
        			Toast.makeText(getApplicationContext(), "Rename not Completed!!", Toast.LENGTH_LONG).show();	
        		}
        		
        		refresh(address);
        		alert11.cancel();
        	}
        });
        
        
        
        
        
    }
   
    
    public void copy(String inpath, String outpath) throws IOException {
       
    	File src=new File(inpath);
		File dst=new File(outpath);
    	
    	InputStream in = new FileInputStream(src);
        OutputStream out = new FileOutputStream(dst);
        byte[] buf = new byte[1024];
        int len;
        while ((len = in.read(buf)) > 0) {
            out.write(buf, 0, len);
        }
        in.close();
        out.close();
        Toast.makeText(getApplicationContext(), "Copy Completed!!!", Toast.LENGTH_LONG).show();
    }
    
    
    
    public void paste(){
    	
    	
    	AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
        if(swp==1){
    	builder1.setMessage("آیا مایل به کپی کردن فایل "+namep+"هستید؟");
    	
        }else{
        	builder1.setMessage("آیا مایل به انتقال فایل "+namep+"هستید؟");
        }
        builder1.setCancelable(true);
        builder1.setPositiveButton("Paste",new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
               
            	if(swp==1){
            		
            		
            		
            		try {
						copy(addressp+"/"+namep,address+"/"+namep);
					} catch (IOException e) {
						e.printStackTrace();
					}
            		
            		refresh(address);
            		
            		
            	}else{
            		
            		
            		File file = new File(addressp+"/"+namep);
            		boolean success = file.renameTo(new File(address+"/"+namep));
            		
            		if(success){
            			
            			 Toast.makeText(getApplicationContext(), "Move Completed!!", Toast.LENGTH_LONG).show();
            		}
            		refresh(address);
            		
            		
            	}
            	
            	
            	
            }
        });
        AlertDialog alert11 = builder1.create();
        alert11.show();
    }
    
    
    
    
    
    
    private void back(){

    	int p=0;
    	for(int i=address.length()-1;i>=0;i--){
    		if(address.charAt(i)=='/'){
    			p=i;
    			break;
    		}
    	}

    	address=address.substring(0, p);
    	refresh(address);
    	
    }
    
    public boolean onKeyDown(int keyCode, KeyEvent event) {
     
    	if ( keyCode == KeyEvent.KEYCODE_MENU ) {
          
    		if(swp!=0){
    		paste();
    		}else{
    			
    			Toast.makeText(getApplicationContext(), "حافظه کلیپ بورد خالی است", Toast.LENGTH_LONG).show();
    		}
    		
        }
    	
        return super.onKeyDown(keyCode, event);
    }
   
    public void onBackPressed() {

    	
    	if(address.equals(Environment.getExternalStorageDirectory().toString())){
    		finish();
    	}else
    	{
    	back();
    	}
    }
    
    
    
    
}
