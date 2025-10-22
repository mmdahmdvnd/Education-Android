package com.mmd.AmuzeshAmaliAndroid;

import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import com.mmd.AmuzeshAmaliAndroid.R;


public class MainFrag_season7 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);

      setContentView(R.layout.mainfrag_season7);
	}
	 
	public void selectFrag(View view) {
		 Fragment fr;
		 
		 
		  if(view == findViewById(R.id.button2_season7)) {
			 fr = new FragmentTwo_season7();
		 
		 }else {
			 fr = new FragmentOne_season7();
		 }
		 
		 FragmentManager fm = getFragmentManager();
	     FragmentTransaction fragmentTransaction = fm.beginTransaction();
	     fragmentTransaction.replace(R.id.fragment_place_season7, fr);
	     fragmentTransaction.commit();
		 
	}
   
}
