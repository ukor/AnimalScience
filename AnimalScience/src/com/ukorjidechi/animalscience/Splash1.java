/**
 * 
 */
package com.ukorjidechi.animalscience;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/**
 * @author Ukor
 *
 */
public class Splash1 extends Activity {
	/** splash screen timer*/
	private static int Splash_Time_Out = 3000;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash1);
		new Handler().postDelayed (new Runnable(){

			/** This method will be executed once the timer is  
			 * over.
			 * The main activity will start main activity
			 */
			@Override
			public void run() {
				// start main activity when timer is done counting
				Intent mainActivity = new Intent(Splash1.this, MainActivity.class);
				startActivity(mainActivity);
				
				
				//close this activity
				finish();
			}
	}, Splash_Time_Out);
	}

}
