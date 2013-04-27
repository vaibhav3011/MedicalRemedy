package com.MedicalRemedy.android;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

public class FemaleMedicalRemedyExpAdapterLeg extends BaseExpandableListAdapter 
{
	  private Context myContext;
	  
	  public FemaleMedicalRemedyExpAdapterLeg(Context context) 
	  {
		  myContext = context;
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
		  if (convertView == null) 
		  {
			  LayoutInflater inflater =  (LayoutInflater) myContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			  convertView = inflater.inflate(R.layout.medical_remedy_child_row, null);
		  }
	    
		  TextView tvPlayerName = (TextView) convertView.findViewById(R.id.tvPlayerName);
		  tvPlayerName.setText(FemaleMedicalRemedyExpListActivityLeg.arrChildelements[groupPosition][childPosition]);
		  tvPlayerName.setTag(FemaleMedicalRemedyExpListActivityLeg.arrChildelements[groupPosition][childPosition]);

		  return convertView;
	  }
	 
	  public int getChildrenCount(int groupPosition) 
	  {
		  return FemaleMedicalRemedyExpListActivityLeg.arrChildelements[groupPosition].length;
	  }
	 
	  public Object getGroup(int groupPosition) 
	  {
		  return null;
	  }
	 
	  public int getGroupCount() 
	  {
		  return FemaleMedicalRemedyExpListActivityLeg.arrGroupelements.length;
	  }
	 
	  public long getGroupId(int groupPosition) 
	  {
		  return 0;
	  }
	 
	  public View getGroupView(int groupPosition, boolean isExpanded,View convertView, ViewGroup parent) 
	  {
		  if (convertView == null) 
		  {
			  LayoutInflater inflater =  (LayoutInflater) myContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			  convertView = inflater.inflate(R.layout.medical_remedy_group_row, null);
		  }
	    
		  TextView tvGroupName = (TextView) convertView.findViewById(R.id.tvGroupName);
		  tvGroupName.setText(FemaleMedicalRemedyExpListActivityLeg.arrGroupelements[groupPosition]);
	  
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