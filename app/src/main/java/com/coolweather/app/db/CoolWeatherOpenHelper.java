package com.coolweather.app.db;
import android.database.sqlite.*;
import android.content.*;

public class CoolWeatherOpenHelper extends SQLiteOpenHelper
{

	public static final String CREATE_PROVINCE="create table Province("
	+ "id integer primary key autoincrement,"
	+ "province_name text,"
	+ "province_code text)";

	public static final String CREATE_CITY="create table City("
	+ "id integer primary key autoincrement,"
	+ "city_name text,"
	+ "city_code text,"
	+ "province_id integer)";

	public static final String CREATE_COUNTRY="create table Country("
	+ "id integer primary key autoincrement,"
	+ "country_name text,"
	+ "country_code text,"
	+ "city_id integer)";

	public CoolWeatherOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version)
	{
		super(context, name, factory, version);
	}

	@Override
	public void onCreate(SQLiteDatabase p1)
	{
		// TODO: Implement this method
		p1.execSQL(CREATE_PROVINCE);
		p1.execSQL(CREATE_CITY);
		p1.execSQL(CREATE_COUNTRY);
	}

	@Override
	public void onUpgrade(SQLiteDatabase p1, int p2, int p3)
	{
		// TODO: Implement this method
	}



}
