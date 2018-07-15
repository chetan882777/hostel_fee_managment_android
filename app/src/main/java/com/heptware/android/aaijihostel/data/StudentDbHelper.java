package com.heptware.android.aaijihostel.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.heptware.android.aaijihostel.data.StudentContract.StudentEntry;

public class StudentDbHelper extends SQLiteOpenHelper {

    private static final String LOG_TAG = StudentDbHelper.class.getSimpleName();
    // LOG_TAG ued for logging pourposes for

    private static final String DATABASE_NAME = "student.db";
    // name of the database file

    private static final int DATBASE_VERSION = 1;
    // it is database version .If you chsnge database schema you should change databse version.

    public  StudentDbHelper(Context context){
        super(context , DATABASE_NAME , null , DATBASE_VERSION);
        // initialize database by calling to constructer of SQLiteOpenHelper
        // via passing databse name and databse version .
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String SQL_CREATE_STUDENTS_TABLE =  "CREATE TABLE " + StudentEntry.TABLE_NAME + " ("
                + StudentEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + StudentEntry.COLUMN_STUDENT_NAME + " TEXT NOT NULL, "
                + StudentEntry.COLUMN_STUDENT_CLASS + " TEXT NOT NULL,"
                + StudentEntry.COLUMN_STUDENT_AGE + " TEXT DEFAULT '"+StudentEntry.STUDENT_DATA_UNAVAILABLE+"',"
                + StudentEntry.COLUMN_STUDENT_LAST_RESULT + " TEXT DEFAULT '"+StudentEntry.STUDENT_DATA_UNAVAILABLE+"',"
                + StudentEntry.COLUMN_STUDENT_HOSTEL_BRANCH + " TEXT NOT NULL, "
                + StudentEntry.COLUMN_STUDENT_FEE + " INTEGER NOT NULL, "
                + StudentEntry.COLUMN_STUDENT_FATHER + " TEXT DEFAULT '"+StudentEntry.STUDENT_DATA_UNAVAILABLE+"',"
                + StudentEntry.COLUMN_STUDENT_FATHER_OCCUPATION + " TEXT DEFAULT '"+StudentEntry.STUDENT_DATA_UNAVAILABLE+"',"
                + StudentEntry.COLUMN_STUDENT_Mother + " TEXT DEFAULT '"+StudentEntry.STUDENT_DATA_UNAVAILABLE+"',"
                + StudentEntry.COLUMN_STUDENT_MOTHER_OCCUPATION + " TEXT DEFAULT '"+StudentEntry.STUDENT_DATA_UNAVAILABLE+"',"
                + StudentEntry.COLUMN_STUDENT_SCHOOL + " TEXT DEFAULT '"+StudentEntry.STUDENT_DATA_UNAVAILABLE+"',"
                + StudentEntry.COLUMN_STUDENT_PHONE_1 + " TEXT NOT NULL, "
                + StudentEntry.COLUMN_STUDENT_PHONE_2 + " TEXT DEFAULT '"+StudentEntry.STUDENT_DATA_UNAVAILABLE+"',"
                + StudentEntry.COLUMN_STUDENT_PHONE_3 + " TEXT DEFAULT '"+StudentEntry.STUDENT_DATA_UNAVAILABLE+"' , "
                + StudentEntry.COLUMN_STUDENT_IMAGE + " TEXT DEFAULT '"+StudentEntry.STUDENT_DATA_UNAVAILABLE+"');";

        // Execute the SQL statement
        db.execSQL(SQL_CREATE_STUDENTS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
