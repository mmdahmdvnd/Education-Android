package com.mmd.AmuzeshAmaliAndroid;

import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import com.mmd.AmuzeshAmaliAndroid.R;


public class Mainproj_season6_ extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);

      setContentView(R.layout.mainproj_season6_);
	}
	 
	public void selectFrag(View view) {
		 Fragment fr;
		 
		 
		  if(view == findViewById(R.id.button2_season4_4_)) {
			 fr = new FragmentTwoproj_season6_();
		 
		 }else {
			 fr = new FragmentOneproj_season6_();
		 }
		 
		 FragmentManager fm = getFragmentManager();
	     FragmentTransaction fragmentTransaction = fm.beginTransaction();
	     fragmentTransaction.replace(R.id.fragment_place_season4_4_, fr);
	     fragmentTransaction.commit();
		 
	}
   
}
