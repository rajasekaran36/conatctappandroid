package com.raja.mycontactapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

public class DBHelper extends SQLiteOpenHelper {
    private static final int DB_VERSION = 1;
    private static final String DB_NAME ="contactsDatabase";
    Context  appContext;
    DBHelper(Context c){
        super(c,DB_NAME,null,DB_VERSION);
        this.appContext = c;
    }
    @Override
    public void onCreate(SQLiteDatabase db) {

        String query = "create table contactsinfo(name varchar,phNo varchar)";
        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String query = "drop table if exists contactsinfo";
        db.execSQL(query);
        onCreate(db);
    }
    public boolean addContactToDB(Contact x){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("name",x.getName());
        cv.put("phNo",x.getPhNo());
        db.insert("contactsinfo",null,cv);
        db.close();
        Toast.makeText(appContext,"Done",Toast.LENGTH_LONG).show();
        return true;
    }
}
