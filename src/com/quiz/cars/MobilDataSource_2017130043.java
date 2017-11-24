package com.quiz.cars;

import java.util.ArrayList;
import java.util.List;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

public class MobilDataSource_2017130043 {
	private SQLiteDatabase database;
	private CarsSQLiteHelper_2017130043 dbHelper;
	private String[] allColumns = { CarsSQLiteHelper_2017130043.COLUMN_ID,
			CarsSQLiteHelper_2017130043.COLUMN_PRODUSEN,
			CarsSQLiteHelper_2017130043.COLUMN_MERK,
			CarsSQLiteHelper_2017130043.COLUMN_TAHUN,
			CarsSQLiteHelper_2017130043.COLUMN_HARGA,
			CarsSQLiteHelper_2017130043.COLUMN_UKURAN,
			CarsSQLiteHelper_2017130043.COLUMN_PENUMPANG
	};
	
	public MobilDataSource_2017130043(Context context) {
		// TODO Auto-generated constructor stub
		dbHelper = new CarsSQLiteHelper_2017130043(context);
	}
	
	public void open() throws SQLException {
		database = dbHelper.getWritableDatabase();
	}
	
	public void close() {
		dbHelper.close();
	}
	
	private Mobil_2017130043 cursorToDaftarMobil(Cursor cursor) {
		Mobil_2017130043 mobil = new Mobil_2017130043();
		mobil.setId(cursor.getInt(0));
		mobil.setProdusen(cursor.getString(1));
		mobil.setMerk(cursor.getString(2));
		mobil.setTahun(cursor.getInt(3));
		mobil.setHarga(cursor.getInt(4));
		mobil.setUkuran(cursor.getInt(5));
		mobil.setPenumpang(cursor.getInt(6));
		
		return mobil;
	}
	
	public Mobil_2017130043 tambahMobil(int id, String produsen, String merk, int tahun,
			int harga, int ukuran, int penumpang) {
		ContentValues values = new ContentValues();
		values.put(CarsSQLiteHelper_2017130043.COLUMN_ID, id);
		values.put(CarsSQLiteHelper_2017130043.COLUMN_PRODUSEN, produsen);
		values.put(CarsSQLiteHelper_2017130043.COLUMN_MERK, merk);
		values.put(CarsSQLiteHelper_2017130043.COLUMN_TAHUN, tahun);
		values.put(CarsSQLiteHelper_2017130043.COLUMN_HARGA, harga);
		values.put(CarsSQLiteHelper_2017130043.COLUMN_UKURAN, ukuran);
		values.put(CarsSQLiteHelper_2017130043.COLUMN_PENUMPANG, penumpang);
		long insertId = database.insert(CarsSQLiteHelper_2017130043.TABLE_MOBIL, null, values);
		Cursor cursor = database.query(CarsSQLiteHelper_2017130043.TABLE_MOBIL, allColumns, CarsSQLiteHelper_2017130043.COLUMN_ID + " = " + id, null, null, null, null);
		cursor.moveToFirst();
		Mobil_2017130043 newMobil = cursorToDaftarMobil(cursor);
		cursor.close();
		return newMobil;
	}
	
	public List<Mobil_2017130043> tampilkanSemuaData() {
		List<Mobil_2017130043> daftarMobil = new ArrayList<Mobil_2017130043>();
		
		Cursor cursor = database.query(CarsSQLiteHelper_2017130043.TABLE_MOBIL, allColumns, null, null, null, null, null);
		cursor.moveToFirst();
		while (!cursor.isAfterLast()) {
			Mobil_2017130043 mobil = cursorToDaftarMobil(cursor);
			daftarMobil.add(mobil);
			cursor.moveToNext();
		}
		
		//make sure to close the cursor
		cursor.close();
		return daftarMobil;
	}
	
	

}
