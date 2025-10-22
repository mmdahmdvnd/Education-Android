package com.mmd.AmuzeshAmaliAndroid;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.app.Activity;


public class Mainproj_season3_1 extends Activity {

    
	private EditText txt;
	private Button save;
	private Button clear;
	private Button open;

	
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainproj_season3_1);
        
        txt=(EditText) findViewById(R.id.txt);
        save=(Button) findViewById(R.id.save);
        clear=(Button) findViewById(R.id.clear);
        open=(Button) findViewById(R.id.open);
    
        
        
        save.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0) {
				writetxtfile("test2.txt", txt.getText().toString());
			}
        });
        
        open.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0) {
				readtxtfile("/note/test2.txt");
			}
        });
        
        clear.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0) {
				txt.setText("");
			}
        });
      
       
        
    }
    
    
    private void writetxtfile(String name,String matn){
    	
    	  try{ 
    		  
    	        File dir=new File(Environment.getExternalStorageDirectory(),"note");
    	        if(!dir.exists()){
    	        	dir.mkdir();
    	        }
    	        
    	        File txt=new File(dir,name);
    	        FileWriter w=new FileWriter(txt);
    	        w.append(matn);
    	        w.close();
    	        
    	        Toast.makeText(getApplicationContext(), "File Created !!", Toast.LENGTH_LONG).show();
    	        
    	       }
    	       catch(IOException e){
    	    	   
    	    	   Toast.makeText(getApplicationContext(), "File Not Created !!", Toast.LENGTH_LONG).show();
    	    	   
    	       }
    	
    }


  
    
    private void readtxtfile(String path){
    	
    	
    	
    	try{
    	String card =Environment.getExternalStorageDirectory().toString();
    	BufferedReader r=new BufferedReader(new FileReader(card+path));
    	
    	String line="";
    	String all="";
    	
    	while((line=r.readLine())!=null){
    		
    		all=all+line;
    		all=all+"\n";
    		
    	}
    	
    	txt.setText(all);
    	
    	Toast.makeText(getApplicationContext(), "Read Comleted !!", Toast.LENGTH_LONG).show();
    	
    	
    	}catch(IOException e){
    		
    		Toast.makeText(getApplicationContext(), "Read Not Comleted !!", Toast.LENGTH_LONG).show();
    	}
    	
    }
    
}
