package com.example.roadmap;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class Database extends SQLiteOpenHelper {
    private static final String DB_NAME="suggested_topics";
    private static final int DB_VERSION=1;
    private static final String TABLE_NAME="topics";
    public Database(Context context) {

        super(context,DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE topics (Suggested TEXT)");



    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS topics");
        onCreate(db);

    }
    public void Insert(String s){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues values=new ContentValues();
        values.put("Suggested",s);
        db.insert(TABLE_NAME,null,values);
    }
    public ArrayList<TopicList> fetchtopic(){
        SQLiteDatabase db=this.getReadableDatabase();
       Cursor cursor= db.rawQuery("SELECT * from topics",null);
       ArrayList<TopicList> arr=new ArrayList<>();
       while ((cursor.moveToNext()))
       {
            TopicList ls=new TopicList();
            ls.topic_name=cursor.getString(0);
            arr.add(ls);

       }
       return arr;

    }

}
