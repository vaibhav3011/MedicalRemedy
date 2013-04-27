package com.MedicalRemedy.android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class FemaleMainActivity extends Activity implements OnClickListener 
{
	Button headbutton,stomachbutton,legbutton, hand1button,hand2button;

	@Override
	public void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.femaleimagelayout);
		headbutton = (Button) findViewById(R.id.bheadfemale);
		headbutton.setOnClickListener(this);
		
		stomachbutton = (Button) findViewById(R.id.bstomachfemale);
		stomachbutton.setOnClickListener(this);
		
		hand1button = (Button) findViewById(R.id.bhand1female);
		hand1button.setOnClickListener(this);
		
		hand2button = (Button) findViewById(R.id.bhand2female);
		hand2button.setOnClickListener(this);
		
		legbutton = (Button) findViewById(R.id.blegsfemale);
		legbutton.setOnClickListener(this);
	}

	public void onClick(View arg0) 
	{
		// TODO Auto-generated method stub
		switch(arg0.getId())
		{
			case R.id.bheadfemale:
				Intent i = new Intent("com.MedicalRemedy.android.FEMALEMEDICALREMEDYEXPLISTACTIVITYHEAD");
				startActivity(i);
				break;
			case R.id.bstomachfemale:
				Intent j = new Intent("com.MedicalRemedy.android.FEMALEMEDICALREMEDYEXPLISTACTIVITYSTOMACH");
				startActivity(j);
				break;
			case R.id.bhand1female:
				Intent k = new Intent("com.MedicalRemedy.android.FEMALEMEDICALREMEDYEXPLISTACTIVITYHAND");
				startActivity(k);
				break;
			case R.id.bhand2female:
				Intent l = new Intent("com.MedicalRemedy.android.FEMALEMEDICALREMEDYEXPLISTACTIVITYHAND");
				startActivity(l);
				break;
			case R.id.blegsfemale:
				Intent m = new Intent("com.MedicalRemedy.android.FEMALEMEDICALREMEDYEXPLISTACTIVITYLEG");
				startActivity(m);
				break;
		}

	}
}
