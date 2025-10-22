package com.mmd.AmuzeshAmaliAndroid;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;



public class dbHandlerproj_season2_3 {

	private dbopenhelperproj_season2_3 dbhelper;
	private SQLiteDatabase database;
	
	
	public dbHandlerproj_season2_3(Context context){
		
		dbhelper=new dbopenhelperproj_season2_3(context);

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
	
	
	public String display2(int id,int fild){
		
		Cursor cu= database.rawQuery("select * from phonebook where id="+id, null);
		cu.moveToFirst();
		String name=cu.getString(fild);
		return name;
	}
	
	public void insert(String name,String family,String address,String email,String number){
		
		ContentValues cv=new ContentValues();
		cv.put(dbhelper.cname, name);
		cv.put(dbhelper.cfamily, family);
		cv.put(dbhelper.caddress, address);
		cv.put(dbhelper.cemail, email);
		cv.put(dbhelper.cnumber, number);
		database.insert(dbhelper.tblname, dbhelper.cname, cv);
	
		
	}
	
	public Integer count(){
		Cursor cu= database.query(dbhelper.tblname, null, null, null, null, null, null);
		int s=cu.getCount();
		return s;
	}
	
	public void delete(int id){
		
		database.delete(dbhelper.tblname, "id="+id, null);
	}
	
	
	
	public void update(String name,String family,String address,String email,String number,int id){
		ContentValues cv=new ContentValues();
		
		cv.put(dbopenhelperproj_season2_3.cname, name);
		cv.put(dbopenhelperproj_season2_3.cfamily, family);
		cv.put(dbopenhelperproj_season2_3.caddress, address);
		cv.put(dbopenhelperproj_season2_3.cemail, email);
		cv.put(dbopenhelperproj_season2_3.cnumber, number);
		
		
		database.update(dbhelper.tblname, cv, "id="+id, null);
		
		
	}
	
}
