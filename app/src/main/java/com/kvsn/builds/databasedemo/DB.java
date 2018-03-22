package com.kvsn.builds.databasedemo;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

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

    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {

    }
}
