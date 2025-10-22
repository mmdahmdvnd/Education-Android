package com.mmd.AmuzeshAmaliAndroid;

import java.io.IOException;

import android.content.Context;
import android.hardware.Camera;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class campreview_season4_6 extends SurfaceView implements SurfaceHolder.Callback {

	private SurfaceHolder mHolder;
	private Camera mCam;
	
	
	public campreview_season4_6(Context context,Camera cam) {
		super(context);
	
		mCam=cam;
		
		mHolder=getHolder();
		mHolder.addCallback(this);
		mHolder.setType(SurfaceHolder.SURFACE_TYPE_PUSH_BUFFERS);
		
	}

	@Override
	public void surfaceChanged(SurfaceHolder arg0, int arg1, int arg2, int arg3) {
		// TODO Auto-generated method stub
		
	}
	

	@Override
	public void surfaceCreated(SurfaceHolder arg0) {
		// TODO Auto-generated method stub
		try{
			mCam.setPreviewDisplay(arg0);
			mCam.startPreview();
			
			
		}catch(IOException e){
			
			
			
		}
	}

	@Override
	public void surfaceDestroyed(SurfaceHolder arg0) {
		// TODO Auto-generated method stub
		
	}

}
