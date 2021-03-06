package com.kvsn.builds.databasedemo;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by KVSN on 3/22/2018.
 */

public class DB extends SQLiteOpenHelper
{
    private static final int dbv = 1;
    private static final String dbn = "kvsndb";
    Context ct;
    public DB(Context c)
    {
        super(c ,dbn,null,dbv);
        ct = c;
    }
    @Override
    public void onCreate(SQLiteDatabase db)
    {
        String s = "create table info (name text , mob integer)";
        db.execSQL(s);
    }
    public void insertvalues(String s1 , long l)
    {
     SQLiteDatabase db = getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("name" ,s1);
        cv.put("mob",l);
        db.insert("info" , null ,cv);
        Toast.makeText(ct, "Insert Completed", Toast.LENGTH_SHORT).show();
    }
    public void showvalues()
    {
        SQLiteDatabase db = getReadableDatabase();
            ContentValues cv = new ContentValues();
            String s = "select * from info";
            Cursor c = db.rawQuery(s , null);
            while (c.moveToNext())
            {
                String s1 = c.getString(0);
                Long l1 = c.getLong(1);
                Log.d("Database 1" , s1+l1);
            }
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {

    }
}
