package com.MedicalRemedy.android;

import android.app.Activity;
import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;

public class Search extends Activity {

    private String query;
    int ctr=0;
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search);
        onSearchRequested();
        Intent intent=getIntent();
        if(intent.getAction().equals(Intent.ACTION_SEARCH))
        {
        		setQuery(intent.getStringExtra(SearchManager.QUERY));
        		intent = new Intent("com.MedicalRemedy.android.ALLDATAACTIVITY");
        		intent.putExtra("word", query);
        		startActivity(intent);
        		ctr=1;
        }
        if(ctr==1)
        {
        	finish();
        }
    }

	@Override
    public boolean onCreateOptionsMenu(Menu menu) 
	{
    	menu.add("Search").setOnMenuItemClickListener(new OnMenuItemClickListener() 
    	{
			public boolean onMenuItemClick(MenuItem item) 
			{
				onSearchRequested();
				return true;
			}
		});
    	return true;
    }
	@Override
    public boolean onSearchRequested() 
	{
    	Bundle bundle=new Bundle();
		bundle.putString("extra", "extra info");
		startSearch("", false, bundle, false);
		return true;
    }

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}	
}