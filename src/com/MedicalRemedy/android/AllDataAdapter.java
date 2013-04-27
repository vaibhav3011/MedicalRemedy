package com.MedicalRemedy.android;


import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

public class AllDataAdapter extends BaseExpandableListAdapter 
{
	  private Context myContext;
	  int ctr;
	  public AllDataAdapter(Context context) 
	  {
		  myContext = context;
		  Log.d("----","Adapter called");
	  }
	  
	  public Object getChild(int groupPosition, int childPosition) 
	  {
		  return null;
	  }
	 
	  public long getChildId(int groupPosition, int childPosition) 
	  {
		  return 0;
	  }
	 
	  public View getChildView(int groupPosition, int childPosition,boolean isLastChild, View convertView, ViewGroup parent) 
	  {
		  Log.e("----","3");
		  if (convertView == null) 
		  {
			  LayoutInflater inflater =  (LayoutInflater) myContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			  convertView = inflater.inflate(R.layout.medical_remedy_child_row, null);
		  }
	    
		  TextView tvPlayerName = (TextView) convertView.findViewById(R.id.tvPlayerName);
		  tvPlayerName.setText(AllDataActivity.arrChildelements[groupPosition][childPosition]);
		  tvPlayerName.setTag(AllDataActivity.arrChildelements[groupPosition][childPosition]);

		  return convertView;
	  }
	 
	  public int getChildrenCount(int groupPosition) 
	  {
		  Log.e("----","4");
		  return AllDataActivity.arrChildelements[groupPosition].length;
	  }
	 
	  public Object getGroup(int groupPosition) 
	  {
		  return null;
	  }
	 
	  public int getGroupCount() 
	  {
		  Log.e("----","5");
		  Log.d("&&&","Size: "+AllDataActivity.arrGroupelements.size());
		  return AllDataActivity.arrGroupelements.size();
	  }
	 
	  public long getGroupId(int groupPosition) 
	  {
		  return 0;
	  }
	 
	  public View getGroupView(int groupPosition, boolean isExpanded,View convertView, ViewGroup parent) 
	  {
		  Log.e("----","6");
		  if (convertView == null) 
		  {
			  LayoutInflater inflater =  (LayoutInflater) myContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			  convertView = inflater.inflate(R.layout.medical_remedy_group_row, null);
		  }
	    
		  TextView tvGroupName = (TextView) convertView.findViewById(R.id.tvGroupName);
		  tvGroupName.setText(AllDataActivity.arrGroupelements.get(groupPosition));
	  
		  return convertView;
	  }
	 
	  public boolean hasStableIds() 
	  {
		  return false;
	  }
	 
	  public boolean isChildSelectable(int groupPosition, int childPosition) 
	  {
		  return true;
	  }
}