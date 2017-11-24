package com.quiz.cars;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class MainActivity_2017130043 extends Activity {
    /** Called when the activity is first created. */
	ListView listView;
	static final String[] MENUS = new String[] { "Input Mobil", "Daftar Mobil"};
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_2017130043);
        
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,
        		android.R.id.text1, MENUS);
        
        listView = (ListView)findViewById(R.id.listMenu);
        //mengisikan item-item array fruit dari adapter kedalam listView
        listView.setAdapter(adapter);
        final Context context = this;
        
        listView.setOnItemClickListener(new OnItemClickListener() {
        	public void onItemClick(AdapterView<?> parent, View view, int position, long id){
        		
        		// ListView Clicked item index
        		int itemPosition = position;
        		
        		if (itemPosition == 0) {
        			Intent intent = new Intent(context, InputActivity_2017130043.class);
    				startActivity(intent);
        		} else if (itemPosition == 1) {
        			Intent intent = new Intent(context, ListActivity_2017130043.class);
    				startActivity(intent);
        		}

        	}
        });
        
    }
}