package com.MedicalRemedy.android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class GenderMainActivity extends Activity implements OnClickListener
{
	Button male, female;
	@Override
	public void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.gendermainactivity);
		
		male=(Button)findViewById(R.id.bmale);
		male.setOnClickListener(this);
		
		female=(Button)findViewById(R.id.bfemale);
		female.setOnClickListener(this);
	}

	public void onClick(View arg0) 
	{
		// TODO Auto-generated method stub
		switch(arg0.getId())
		{
			case R.id.bmale:
				Intent i= new Intent("com.MedicalRemedy.android.MALEMAINACTIVITY");
				startActivity(i);
				break;
				
			case R.id.bfemale:
				Intent j= new Intent("com.MedicalRemedy.android.FEMALEMAINACTIVITY");
				startActivity(j);
				break;
		}
	}	
}