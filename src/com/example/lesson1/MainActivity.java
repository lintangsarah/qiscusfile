package com.example.lesson1;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class MainActivity extends ListActivity {

	String files="ini string biasa";
	String names[] = {"Lintang","Astrid","Ventika","Yudha","Ismail","Sarah","Sari","Wening","Irene","Dian"};
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        TextView judul = (TextView)findViewById(R.id.judul);
        judul.setText("Qiscus");
        
        CustomAdapter adapter = new CustomAdapter(this,R.layout.list_item,R.id.tulisan,names);
        setListAdapter(adapter);
    }
}
