package com.MedicalRemedy.android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MaleMainActivity extends Activity implements OnClickListener 
{
	Button headbutton,stomachbutton,legbutton, hand1button,hand2button;

	@Override
	public void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.maleimagelayout);
		headbutton = (Button) findViewById(R.id.bheadmale);
		headbutton.setOnClickListener(this);
		
		stomachbutton = (Button) findViewById(R.id.bstomachmale);
		stomachbutton.setOnClickListener(this);
		
		hand1button = (Button) findViewById(R.id.bhand1male);
		hand1button.setOnClickListener(this);
		
		hand2button = (Button) findViewById(R.id.bhand2male);
		hand2button.setOnClickListener(this);
		
		legbutton = (Button) findViewById(R.id.blegsmale);
		legbutton.setOnClickListener(this);
	}

	public void onClick(View arg0) 
	{
		// TODO Auto-generated method stub
		switch(arg0.getId())
		{
			case R.id.bheadmale:
				Intent i = new Intent("com.MedicalRemedy.android.MALEMEDICALREMEDYEXPLISTACTIVITYHEAD");
				startActivity(i);
				break;
			case R.id.bstomachmale:
				Intent j = new Intent("com.MedicalRemedy.android.MALEMEDICALREMEDYEXPLISTACTIVITYSTOMACH");
				startActivity(j);
				break;
			case R.id.bhand1male:
				Intent k = new Intent("com.MedicalRemedy.android.MALEMEDICALREMEDYEXPLISTACTIVITYHAND");
				startActivity(k);
				break;
			case R.id.bhand2male:
				Intent l = new Intent("com.MedicalRemedy.android.MALEMEDICALREMEDYEXPLISTACTIVITYHAND");
				startActivity(l);
				break;
			case R.id.blegsmale:
				Intent m = new Intent("com.MedicalRemedy.android.MALEMEDICALREMEDYEXPLISTACTIVITYLEG");
				startActivity(m);
				break;
		}

	}
}
