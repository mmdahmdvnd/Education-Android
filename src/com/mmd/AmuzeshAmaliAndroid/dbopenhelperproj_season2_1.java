package com.mmd.AmuzeshAmaliAndroid;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;



public class dbopenhelperproj_season2_1 extends SQLiteOpenHelper {

	public static final String dbname="dbtest";
	public static final String tblname="tbluser";
	
	public static final String cid="id";
	
	public static final String cname="name";
	public static final String cuser="user";
	public static final String cpass="pass";
	
	public static final String createtbl="CREATE TABLE "+tblname+"("+cid+" INTEGER PRIMARY KEY AUTOINCREMENT,"+cname+" TEXT,"+cuser+" TEXT,"+cpass+" TEXT);";

	
	public dbopenhelperproj_season2_1(Context context) {
		super(context, dbname, null, 1);	
	}
	
	
	public void onCreate(SQLiteDatabase db) {
		
		db.execSQL(createtbl);
		
	}

	
	public void onUpgrade(SQLiteDatabase db, int arg1, int arg2) {
		
		db.execSQL("DROP TABLE IF EXIST"+tblname);
		onCreate(db);
		
	}

}
