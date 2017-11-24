package com.quiz.cars;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class CarsSQLiteHelper_2017130043 extends SQLiteOpenHelper {
	public static final String TABLE_MOBIL = "mobil";
	public static final String COLUMN_ID = "_id";
	public static final String COLUMN_PRODUSEN = "produsen";
	public static final String COLUMN_MERK = "merk";
	public static final String COLUMN_TAHUN = "tahun";
	public static final String COLUMN_HARGA = "harga";
	public static final String COLUMN_UKURAN = "ukuran_cc";
	public static final String COLUMN_PENUMPANG = "jml_penumpang";
	private static final String DATABASE_NAME = "pengelola_mobil.db";
	private static final int DATABASE_VERSION = 1;
	
	//Database creation sql statement
		private static final String DATABASE_CREATE = "create table "
				+ TABLE_MOBIL + " (" + COLUMN_ID + " integer primary key autoincrement, " +
				COLUMN_PRODUSEN + " text not null, " +
				COLUMN_MERK + " text not null, " +
				COLUMN_TAHUN + " integer, " +
				COLUMN_HARGA + " integer, " +
				COLUMN_UKURAN + " integer, " +
				COLUMN_PENUMPANG + " integer);" ;
		
	public CarsSQLiteHelper_2017130043(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase database) {
		// TODO Auto-generated method stub
		database.execSQL(DATABASE_CREATE);

	}

	@Override
	public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub

	}

}
