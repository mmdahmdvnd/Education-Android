package com.mmd.AmuzeshAmaliAndroid;

import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import com.mmd.AmuzeshAmaliAndroid.R;


public class MainFrag_season6 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);

      setContentView(R.layout.mainfrag_season6);
	}
	 
	public void selectFrag(View view) {
		 Fragment fr;
		 
		
		 if(view == findViewById(R.id.button6_season6)) {
			 fr = new FragmentSix_season6();
		 
		 }else
		 if(view == findViewById(R.id.button5_season6)) {
			 fr = new FragmentFive_season6();
		 
		 }else
		 if(view == findViewById(R.id.button4_season6)) {
			 fr = new FragmentFour_season6();
		 
		 }else 
		 if(view == findViewById(R.id.button3_season6)) {
			 fr = new FragmentThree_season6();
		 
		 } else 
		 if(view == findViewById(R.id.button2_season6)) {
			 fr = new FragmentTwo_season6();
		 
		 }else {
			 fr = new FragmentOne_season6();
		 }
		 
		 FragmentManager fm = getFragmentManager();
	     FragmentTransaction fragmentTransaction = fm.beginTransaction();
	     fragmentTransaction.replace(R.id.fragment_place1_season6, fr);
	     fragmentTransaction.commit();
		 
	}
   
}
