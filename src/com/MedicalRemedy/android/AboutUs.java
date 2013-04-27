package com.MedicalRemedy.android;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class AboutUs extends Activity implements OnClickListener
{
	Button buyfullversion;
	@Override
	public void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.aboutus);
		
		buyfullversion= (Button)findViewById(R.id.bfullversion);
		buyfullversion.setOnClickListener(this);
	}
	public void onClick(View arg0) 
	{
		// TODO Auto-generated method stub
		switch(arg0.getId())
		{
			case R.id.bfullversion:
				Toast.makeText(AboutUs.this,"FULL VERSION COMING SOON!!!", Toast.LENGTH_LONG).show();
				break;
		}
	}
}
