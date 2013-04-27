package com.MedicalRemedy.android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class HomePageMainActivity extends Activity implements OnClickListener
{
	Button gender, search, aboutus;
	@Override
	public void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.homepage);
		
		search=(Button)findViewById(R.id.bsearch);
		search.setOnClickListener(this);
		
		gender=(Button)findViewById(R.id.bchoosegender);
		gender.setOnClickListener(this);
		
		aboutus=(Button)findViewById(R.id.baboutus);
		aboutus.setOnClickListener(this);
	}

	public void onClick(View arg0) 
	{
		Intent i;
		// TODO Auto-generated method stub
		switch(arg0.getId())
		{
			case R.id.bsearch:
				i= new Intent("com.MedicalRemedy.android.SEARCH");
				startActivity(i);
				break;
		
			case R.id.bchoosegender:
				i= new Intent("com.MedicalRemedy.android.GENDERMAINACTIVITY");
				startActivity(i);
				break;
				
			case R.id.baboutus:
				i= new Intent("com.MedicalRemedy.android.ABOUTUS");
				startActivity(i);
				break;
		}
	}
}