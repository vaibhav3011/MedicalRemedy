package com.MedicalRemedy.android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Splash extends Activity 
{
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splashscreen);
		Thread timer=new Thread()
		{
			public void run()
			{
				try
				{
					sleep(3000);
				} 
				catch(InterruptedException E)
				{
					E.printStackTrace();
				}
				finally
				{
					Intent openStartingPoint=new Intent("com.MedicalRemedy.android.HOMEPAGEMAINACTIVITY");
					startActivity(openStartingPoint);
					finish();
				}
			}
		};
		timer.start();
	}
}