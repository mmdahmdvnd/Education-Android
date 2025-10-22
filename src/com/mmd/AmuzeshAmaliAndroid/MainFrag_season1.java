package com.mmd.AmuzeshAmaliAndroid;

import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import com.mmd.AmuzeshAmaliAndroid.R;


public class MainFrag_season1 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);

      setContentView(R.layout.mainfrag_season1);
	}
	 
	public void selectFrag(View view) {
		 Fragment fr;
		 
		 if(view == findViewById(R.id.button4_season1)) {
			 fr = new FragmentFour_season1();
		 
		 }else if(view == findViewById(R.id.button3_season1)) {
			 fr = new FragmentThree_season1();
		 
		 } else if(view == findViewById(R.id.button2_season1)) {
			 fr = new FragmentTwo_season1();
		 
		 }else {
			 fr = new FragmentOne_season1();
		 }
		 
		 FragmentManager fm = getFragmentManager();
	     FragmentTransaction fragmentTransaction = fm.beginTransaction();
	     fragmentTransaction.replace(R.id.fragment_place_season1, fr);
	     fragmentTransaction.commit();
		 
	}
   
}
