package com.quiz.cars;


import java.util.List;
import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class ListActivity_2017130043 extends ListActivity {

	private MobilDataSource_2017130043 datasource;
	private ArrayAdapter<Mobil_2017130043> adapter;
	private Mobil_2017130043 mobil = null;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_2017130043);
        
        datasource = new MobilDataSource_2017130043(this);
        datasource.open();
        
        List<Mobil_2017130043> values = datasource.tampilkanSemuaData();
        // use the simpleCursorAdapter to show the elements in a ListView
        adapter = new ArrayAdapter<Mobil_2017130043>(this, android.R.layout.simple_list_item_1, values);
        
        setListAdapter(adapter);
	}
}