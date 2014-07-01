package com.example.lesson1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class CustomAdapter extends ArrayAdapter<String>{
	
	private String[] names;
	private Context context;
	
	public CustomAdapter(Context context, int resource, int tulisan, String[] objects) {
		super(context, resource, objects);
		// TODO Auto-generated constructor stub
		this.names = objects;
		this.context = context;
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		
		
		LayoutInflater inflate = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		convertView = inflate.inflate(R.layout.list_item,parent, false);
		TextView tulisan = (TextView) convertView.findViewById(R.id.tulisan);
		tulisan.setText(names[position]);
		return convertView;
	}
}
