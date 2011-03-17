package edu.olin.snapdragon;

import java.io.IOException;
import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.hardware.Camera;
import android.hardware.Camera.PreviewCallback;
import android.hardware.Camera.Size;
import android.os.Bundle;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;

public class snapdragon extends Activity {
	
	private SurfaceView preview=null;
	private SurfaceHolder previewHolder=null;
	private Camera camera=null;
	private boolean inPreview=false;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        
        preview=(SurfaceView)findViewById(R.id.preview);
		previewHolder=preview.getHolder();
//		previewHolder.addCallback(surfaceCallback);
//		previewHolder.setType(SurfaceHolder.SURFACE_TYPE_PUSH_BUFFERS);
       
		camera=Camera.open();
		
		try {
			camera.setPreviewDisplay(previewHolder);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		camera.startPreview();
		
    }

}
