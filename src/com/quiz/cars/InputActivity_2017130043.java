package com.quiz.cars;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class InputActivity_2017130043 extends Activity {
	
	private MobilDataSource_2017130043 datasource;
	private Mobil_2017130043 mobil;

	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.input_2017130043);
        
		Button btnTambah = (Button)findViewById(R.id.btnTambah);
	    btnTambah.setOnClickListener(new OnClickListener(){
	    	public void onClick(View v) {
	    		tambah();
	    	}
	    });
    
	}
	
	private void tambah(){
    	EditText txtId = (EditText)findViewById(R.id.txtId);
    	Spinner spinnerProd = (Spinner)findViewById(R.id.spinnerProd);
    	EditText txtMerk = (EditText)findViewById(R.id.txtMerk);
    	EditText txtTahun = (EditText)findViewById(R.id.txtTahun);
    	EditText txtHarga = (EditText)findViewById(R.id.txtHarga);
    	EditText txtUkuran = (EditText)findViewById(R.id.txtUkuran);
    	EditText txtPenumpang = (EditText)findViewById(R.id.txtPenumpang);

		mobil.setProdusen(;)
    	mobil = datasource.tambahMobil(Integer.parseInt(txtId.getText().toString()), String.valueOf(spinnerProd.getSelectedItem()),
    			txtMerk.getText().toString(), Integer.parseInt(txtTahun.getText().toString()),
    			Integer.parseInt(txtHarga.getText().toString()), 
    			Integer.parseInt(txtUkuran.getText().toString()), 
    			Integer.parseInt(txtPenumpang.getText().toString()));
    }
}