package com.example.test.sqlite;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.security.PrivateKey;

import static java.sql.Types.VARCHAR;

/**
 * Created by test on 11-06-2017.
 */


public class Mil extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "mildatabase";
    private static final String TABLE_NAME = "mil1table";
    private static final int DATABASE_VERSION = 4;
    private static final String UID = "_id";
    private static final String NAME = "Name";
    //private static final String ADDRESS = "Address";
    private static final String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + " (" + UID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + NAME + " VARCHAR(255));";
    private static final String DROP_TABLE = "DROP TABLE IF EXISTS "+ TABLE_NAME ;
    private Context context;

    public Mil(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.context = context;
        Message.message(context,"Constructor was called");
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        try {
            db.execSQL(CREATE_TABLE);
            Message.message(context,"OnCreate called");
        } catch (SQLException e) {
            Message.message(context, "" + e);
        }


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        try {
            db.execSQL(DROP_TABLE);
            onCreate(db);
            Message.message(context,"OnUpgrade Called");
        } catch (SQLException e) {
            Message.message(context, "" + e);
        }


    }
}
