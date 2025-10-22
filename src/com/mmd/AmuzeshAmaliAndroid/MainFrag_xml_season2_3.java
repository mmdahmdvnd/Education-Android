package com.mmd.AmuzeshAmaliAndroid;

import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import com.mmd.AmuzeshAmaliAndroid.R;


public class MainFrag_xml_season2_3 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);

      setContentView(R.layout.mainfrag_xml_season2_3);
	}
	 
	public void selectFrag(View view) {
		 Fragment fr;
		 
		 if(view == findViewById(R.id.button10_season2_3)) {
			 fr = new FragmentTen_season2_3();
		 
		 }else
		 if(view == findViewById(R.id.button9_season2_3)) {
			 fr = new FragmentNine_season2_3();
		 
		 }else
		 if(view == findViewById(R.id.button8_season2_3)) {
			 fr = new FragmentEight_season2_3();
		 
		 }else
		  {
			 fr = new FragmentSeven_season2_3();
		 
		 }
		 
		 FragmentManager fm = getFragmentManager();
	     FragmentTransaction fragmentTransaction = fm.beginTransaction();
	     fragmentTransaction.replace(R.id.fragment_place2_season2_3, fr);
	     fragmentTransaction.commit();
		 
	}
   
}
