package com.MedicalRemedy.android;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class NoSearch extends Activity {


	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search);
        TextView a = (TextView)findViewById(R.id.textview_Search); 
        a.setText("No results found. Please go back and enter again");
	}
}
