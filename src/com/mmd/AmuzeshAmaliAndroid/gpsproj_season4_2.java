package com.mmd.AmuzeshAmaliAndroid;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

public class gpsproj_season4_2 implements LocationListener {

	
	public static double lat;
	public static double lon;
	
	@Override
	public void onLocationChanged(Location loc) {
		// TODO Auto-generated method stub

		lat=loc.getLatitude();
		lon=loc.getLongitude();
		
		
	}

	@Override
	public void onProviderDisabled(String arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onProviderEnabled(String arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStatusChanged(String arg0, int arg1, Bundle arg2) {
		// TODO Auto-generated method stub
		
	}

}
