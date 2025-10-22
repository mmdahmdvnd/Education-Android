package com.mmd.AmuzeshAmaliAndroid;

import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import com.mmd.AmuzeshAmaliAndroid.R;


public class MainFrag_java_season2_3 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);

      setContentView(R.layout.mainfrag_java_season2_3);
	}
	 
	public void selectFrag(View view) {
		 Fragment fr;
		 
		
		 if(view == findViewById(R.id.button6_season2_3)) {
			 fr = new FragmentSix_season2_3();
		 
		 }else
		 if(view == findViewById(R.id.button5_season2_3)) {
			 fr = new FragmentFive_season2_3();
		 
		 }else
		 if(view == findViewById(R.id.button4_season2_3)) {
			 fr = new FragmentFour_season2_3();
		 
		 }else 
		 if(view == findViewById(R.id.button3_season2_3)) {
			 fr = new FragmentThree_season2_3();
		 
		 } else 
		 if(view == findViewById(R.id.button2_season2_3)) {
			 fr = new FragmentTwo_season2_3();
		 
		 }else {
			 fr = new FragmentOne_season2_3();
		 }
		 
		 FragmentManager fm = getFragmentManager();
	     FragmentTransaction fragmentTransaction = fm.beginTransaction();
	     fragmentTransaction.replace(R.id.fragment_place1_season2_3, fr);
	     fragmentTransaction.commit();
		 
	}
   
}
