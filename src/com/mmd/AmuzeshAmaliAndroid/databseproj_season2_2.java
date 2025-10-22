package com.mmd.AmuzeshAmaliAndroid;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class databseproj_season2_2 extends SQLiteOpenHelper {

	
	public final String path="data/data/com.mmd.AmuzeshAmaliAndroid/databases/";
	public final String Name="dbtest";
	public SQLiteDatabase mydb;
	
	private final Context mycontext;
	
	public databseproj_season2_2(Context context) {
		super(context, "dbtest", null, 1);
		mycontext=context;
		
	}

	
	
	@Override
	public void onCreate(SQLiteDatabase arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub
		
	}
	
	public void database(){
		
		boolean checkdb=checkdb();
		
		if(checkdb){
			
			
		}else{
			
			this.getReadableDatabase();
			
			try{
			copydatabase();
			}catch(IOException e){
				
				
			}
			
		}
		
		
		
	}
	
	public void open(){
		
		mydb=SQLiteDatabase.openDatabase(path+Name, null, SQLiteDatabase.OPEN_READWRITE);
		
	}
	
	public void close(){
		mydb.close();
	}
	
	
	public boolean checkdb(){
		
		SQLiteDatabase db2=null;
		try{	
		db2=SQLiteDatabase.openDatabase(path+Name, null, SQLiteDatabase.OPEN_READONLY);
		}
		catch(SQLException e)
		{

		}
		return db2 !=null ? true:false ;
		
	}
	
	public void copydatabase() throws IOException{
		OutputStream myOutput = new FileOutputStream(path+Name);
		byte[] buffer = new byte[1024];
		int length;

		InputStream myInput = mycontext.getAssets().open("dbtest");
		while ((length = myInput.read(buffer)) > 0) {
		myOutput.write(buffer, 0, length);
		}
		myInput.close();
		myOutput.flush();
		myOutput.close();
	}
	
	
	
	public String Display(int row,int fild){
		Cursor cu= mydb.query("users", null, null, null, null, null, null);
		cu.moveToPosition(row);
		String name=cu.getString(fild);
		return name;
	}
	
}
