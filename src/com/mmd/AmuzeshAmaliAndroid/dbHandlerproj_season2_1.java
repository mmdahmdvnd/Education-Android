package com.mmd.AmuzeshAmaliAndroid;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;



public class dbHandlerproj_season2_1 {

	private dbopenhelperproj_season2_1 dbhelper;
	private SQLiteDatabase database;
	
	
	public dbHandlerproj_season2_1(Context context){
		
		dbhelper=new dbopenhelperproj_season2_1(context);

	}
	
	
	public void open(){
		database=dbhelper.getWritableDatabase();
	}
	
	public void close(){
		
		dbhelper.close();
	}
	
	public String Display(int row,int fild){
		Cursor cu= database.query(dbhelper.tblname, null, null, null, null, null, null);
		cu.moveToPosition(row);
		String name=cu.getString(fild);
		return name;
	}
	
	public void inser(String name,String user,String pass){
		
		ContentValues cv=new ContentValues();
		cv.put(dbhelper.cname, name);
		cv.put(dbhelper.cuser, user);
		cv.put(dbhelper.cpass, pass);
		database.insert(dbhelper.tblname, dbhelper.cname, cv);
	
		
	}
	
	public Integer count(){
		Cursor cu= database.query(dbhelper.tblname, null, null, null, null, null, null);
		int s=cu.getCount();
		return s;
	}
	
	
	public void update(String value,int fild,int id){
		ContentValues cv=new ContentValues();
		
		if(fild==1){
		cv.put(dbhelper.cname, value);
		}else if(fild==2){
		cv.put(dbhelper.cuser, value);
		}else if(fild==3){
		cv.put(dbhelper.cpass, value);
		}
		
		database.update(dbhelper.tblname, cv, "id="+id, null);
		
		
	}
	
}
