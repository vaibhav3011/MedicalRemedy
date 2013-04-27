package com.MedicalRemedy.android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Disp extends Activity{
	TextView title ;
	TextView text;
	@Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.display);
        title = (TextView) findViewById(R.id.tv_disp_title);
    	text = (TextView) findViewById(R.id.tv_disp2);
        Intent i = getIntent();
        String titl = i.getStringExtra("title");
        String tex = i.getStringExtra("text");
        title.setText(titl);
        text.setText(tex);
    }
}
