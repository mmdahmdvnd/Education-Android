package com.mmd.AmuzeshAmaliAndroid;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;

public class MainFrag_season5 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);

      setContentView(R.layout.mainfrag_season5);
	}
	 
	public void selectFrag(View view) {
		 Fragment fr;
		 
		
		 if(view == findViewById(R.id.button6_season5)) {
			 fr = new FragmentSix_season5();
		 
		 }else
		 if(view == findViewById(R.id.button5_season5)) {
			 fr = new FragmentFive_season5();
		 
		 }else
		 if(view == findViewById(R.id.button4_season5)) {
			 fr = new FragmentFour_season5();
		 
		 }else 
		 if(view == findViewById(R.id.button3_season5)) {
			 fr = new FragmentThree_season5();
		 
		 } else 
		 if(view == findViewById(R.id.button2_season5)) {
			 fr = new FragmentTwo_season5();
		 
		 }else {
			 fr = new FragmentOne_season5();
		 }
		 
		 FragmentManager fm = getFragmentManager();
	     FragmentTransaction fragmentTransaction = fm.beginTransaction();
	     fragmentTransaction.replace(R.id.fragment_place1_season5, fr);
	     fragmentTransaction.commit();
		 
	}
   
}
