package com.example.fake_era.sane_time;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "Student38.db";

    public static final String TABLE_NAME = "user";
    public static final String COL_1 = "UID";
    public static final String COL_2 = "FIRST_NAME";
    public static final String COL_3 = "MIDDLE_NAME";
    public static final String COL_4 = "LAST_NAME";
    public static final String COL_5 = "AGE";
    public static final String COL_6 = "EMAIL";
    public static final String COL_7 = "PHONE_NO";
    public static final String COL_8 = "PASSWORD";



    public static final String TABLE_NAMESUB = "subjects";
    public static final String COL_2SUB = "UID";
    public static final String COL_1SUB = "COURSE_CODE";
    public static final String COL_3SUB = "COURSE_NAME";
    public static final String COL_4SUB = "FACULTY";


    public static final String TABLE_NAMECLASS = "CLASS";
    public static final String COL_1CLASS = "UID";
    public static final String COL_2CLASS = "DAYS";
    public static final String COL_3CLASS = "COURSE_ID";
    public static final String COL_4CLASS = "START";
    public static final String COL_5CLASS = "ENDT";
    public static final String COL_6CLASS = "ROOM";
    public static final String COL_7CLASS = "BUILDING";



    public static final String TABLE_HOBBY_WKDY = "HOBBY_WKDY";
    public static final String COL_1_HOBBY_WKDY= "UID";
    public static final String COL_2_HOBBY_WKDY= "DAYS";
    public static final String COL_3_HOBBY_WKDY = "TIME1";
    public static final String COL_4_HOBBY_WKDY= "TIME2";
    public static final String COL_5_HOBBY_WKDY= "TIME3";
    public static final String COL_6_HOBBY_WKDY= "TIME4";
    public static final String COL_7_HOBBY_WKDY= "TIME5";






    public static final String TABLE_HOBBY_WKND = "HOBBY_WKND";
    public static final String COL_1_HOBBY_WKND= "UID";
    public static final String COL_2_HOBBY_WKND= "DAYS";
    public static final String COL_3_HOBBY_WKND = "TIME1";
    public static final String COL_4_HOBBY_WKND= "TIME2";
    public static final String COL_5_HOBBY_WKND= "TIME3";
    public static final String COL_6_HOBBY_WKND= "TIME4";
    public static final String COL_7_HOBBY_WKND= "TIME5";






    public static final String TABLE_EATING_WKDY = "EATING_WKDY";
    public static final String COL_1_EATING_WKDY= "UID";
    public static final String COL_2_EATING_WKDY= "DAYS";
    public static final String COL_3_EATING_WKDY = "TIME1";
    public static final String COL_4_EATING_WKDY= "TIME2";
    public static final String COL_5_EATING_WKDY= "TIME3";
    public static final String COL_6_EATING_WKDY= "TIME4";
    public static final String COL_7_EATING_WKDY= "TIME5";




    public static final String TABLE_EATING_WKND = "EATING_WKND";
    public static final String COL_1_EATING_WKND= "UID";
    public static final String COL_2_EATING_WKND= "DAYS";
    public static final String COL_3_EATING_WKND = "TIME1";
    public static final String COL_4_EATING_WKND= "TIME2";
    public static final String COL_5_EATING_WKND= "TIME3";
    public static final String COL_6_EATING_WKND= "TIME4";
    public static final String COL_7_EATING_WKND= "TIME5";


    public static final String TABLE_ASSIGNMENT_SELFSTUDY_WKDY = "ASSIGNMENT_SELFSTUDY_WKDY";
    public static final String COL_1_ASSIGNMENT_SELFSTUDY_WKDY= "UID";
    public static final String COL_2_ASSIGNMENT_SELFSTUDY_WKDY= "DAYS";
    public static final String COL_3_ASSIGNMENT_SELFSTUDY_WKDY = "TIME1";
    public static final String COL_4_ASSIGNMENT_SELFSTUDY_WKDY= "TIME2";
    public static final String COL_5_ASSIGNMENT_SELFSTUDY_WKDY= "TIME3";
    public static final String COL_6_ASSIGNMENT_SELFSTUDY_WKDY= "TIME4";
    public static final String COL_7_ASSIGNMENT_SELFSTUDY_WKDY= "TIME5";



    public static final String TABLE_ASSIGNMENT_SELFSTUDY_WKND = "ASSIGNMENT_SELFSTUDY_WKND";
    public static final String COL_1_ASSIGNMENT_SELFSTUDY_WKND= "UID";
    public static final String COL_2_ASSIGNMENT_SELFSTUDY_WKND= "DAYS";
    public static final String COL_3_ASSIGNMENT_SELFSTUDY_WKND = "TIME1";
    public static final String COL_4_ASSIGNMENT_SELFSTUDY_WKND= "TIME2";
    public static final String COL_5_ASSIGNMENT_SELFSTUDY_WKND= "TIME3";
    public static final String COL_6_ASSIGNMENT_SELFSTUDY_WKND= "TIME4";
    public static final String COL_7_ASSIGNMENT_SELFSTUDY_WKND= "TIME5";


    public static final String TABLE_SLEEPING_WKDY = "SLEEPING_WKDY";
    public static final String COL_1_SLEEPING_WKDY= "UID";
    public static final String COL_2_SLEEPING_WKDY= "DAYS";
    public static final String COL_3_SLEEPING_WKDY = "TIME1";
    public static final String COL_4_SLEEPING_WKDY= "TIME2";
    public static final String COL_5_SLEEPING_WKDY= "TIME3";
    public static final String COL_6_SLEEPING_WKDY= "TIME4";
    public static final String COL_7_SLEEPING_WKDY= "TIME5";



    public static final String TABLE_SLEEPING_WKND = "SLEEPING_WKND";
    public static final String COL_1_SLEEPING_WKND= "UID";
    public static final String COL_2_SLEEPING_WKND= "DAYS";
    public static final String COL_3_SLEEPING_WKND = "TIME1";
    public static final String COL_4_SLEEPING_WKND= "TIME2";
    public static final String COL_5_SLEEPING_WKND= "TIME3";
    public static final String COL_6_SLEEPING_WKND= "TIME4";
    public static final String COL_7_SLEEPING_WKND= "TIME5";




    public static final String TABLE_PERSONAL_CLEANLINESS_WKDY = "PERSONAL_CLEANLINESS_WKDY";
    public static final String COL_1_PERSONAL_CLEANLINESS_WKDY= "UID";
    public static final String COL_2_PERSONAL_CLEANLINESS_WKDY= "DAYS";
    public static final String COL_3_PERSONAL_CLEANLINESS_WKDY = "TIME1";
    public static final String COL_4_PERSONAL_CLEANLINESS_WKDY= "TIME2";
    public static final String COL_5_PERSONAL_CLEANLINESS_WKDY= "TIME3";
    public static final String COL_6_PERSONAL_CLEANLINESS_WKDY= "TIME4";
    public static final String COL_7_PERSONAL_CLEANLINESS_WKDY= "TIME5";






    public static final String TABLE_PERSONAL_CLEANLINESS_WKND = "PERSONAL_CLEANLINESS_WKND";
    public static final String COL_1_PERSONAL_CLEANLINESS_WKND= "UID";
    public static final String COL_2_PERSONAL_CLEANLINESS_WKND= "DAYS";
    public static final String COL_3_PERSONAL_CLEANLINESS_WKND = "TIME1";
    public static final String COL_4_PERSONAL_CLEANLINESS_WKND= "TIME2";
    public static final String COL_5_PERSONAL_CLEANLINESS_WKND= "TIME3";
    public static final String COL_6_PERSONAL_CLEANLINESS_WKND= "TIME4";
    public static final String COL_7_PERSONAL_CLEANLINESS_WKND= "TIME5";





    public static final String TABLE_OUTING_SHOPPING_WKND = "OUTING_SHOPPING_WKND";
    public static final String COL_1_OUTING_SHOPPING_WKND= "UID";
    public static final String COL_2_OUTING_SHOPPING_WKND= "DAYS";
    public static final String COL_3_OUTING_SHOPPING_WKND = "TIME1";
    public static final String COL_4_OUTING_SHOPPING_WKND= "TIME2";
    public static final String COL_5_OUTING_SHOPPING_WKND= "TIME3";
    public static final String COL_6_OUTING_SHOPPING_WKND= "TIME4";
    public static final String COL_7_OUTING_SHOPPING_WKND= "TIME5";




    public static final String TABLE_MISCELLANEOUS_WKND = "MISCELLANEOUS_WKND";
    public static final String COL_1_MISCELLANEOUS_WKND= "UID";
    public static final String COL_2_MISCELLANEOUS_WKND= "DAYS";
    public static final String COL_3_MISCELLANEOUS_WKND = "ACTIVITY1";
    public static final String COL_4_MISCELLANEOUS_WKND= "TIME1";
    public static final String COL_5_MISCELLANEOUS_WKND= "ACTIVITY2";
    public static final String COL_6_MISCELLANEOUS_WKND= "TIME2";
    public static final String COL_7_MISCELLANEOUS_WKND= "ACTIVITY3";
    public static final String COL_8_MISCELLANEOUS_WKND= "TIME3";


    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }




    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + TABLE_NAME + "(UID INTEGER PRIMARY KEY AUTOINCREMENT,FIRST_NAME TEXT,MIDDLE_NAME TEXT,LAST_NAME TEXT,AGE INTEGER,EMAIL TEXT UNIQUE,PHONE_NO INTEGER,PASSWORD TEXT)");
        db.execSQL("create table " + TABLE_NAMESUB + "(COURSE_CODE TEXT NOT NULL,UID TEXT,COURSE_NAME TEXT,FACULTY TEXT,PRIMARY KEY (COURSE_CODE,UID))");
        db.execSQL("create table " + TABLE_NAMECLASS + "(UID TEXT,DAYS TEXT,COURSE_ID TEXT NOT NULL ,START TEXT,ENDT TEXT,ROOM TEXT,BUILDING TEXT,PRIMARY KEY (UID,DAYS,COURSE_ID))" );
        db.execSQL("create table " + TABLE_HOBBY_WKDY + "(UID TEXT,DAYS TEXT,TIME1 TEXT,TIME2 TEXT,TIME3 TEXT,TIME4 TEXT,TIME5 TEXT,PRIMARY KEY (UID,DAYS))" );
        db.execSQL("create table " + TABLE_HOBBY_WKND + "(UID TEXT,DAYS TEXT,TIME1 TEXT,TIME2 TEXT,TIME3 TEXT,TIME4 TEXT,TIME5 TEXT,PRIMARY KEY (UID,DAYS))" );
        db.execSQL("create table " + TABLE_EATING_WKDY + "(UID TEXT,DAYS TEXT,TIME1 TEXT,TIME2 TEXT,TIME3 TEXT,TIME4 TEXT,TIME5 TEXT,PRIMARY KEY (UID,DAYS))" );
        db.execSQL("create table " + TABLE_EATING_WKND + "(UID TEXT,DAYS TEXT,TIME1 TEXT,TIME2 TEXT,TIME3 TEXT,TIME4 TEXT,TIME5 TEXT,PRIMARY KEY (UID,DAYS))" );
        db.execSQL("create table " + TABLE_SLEEPING_WKDY + "(UID TEXT,DAYS TEXT,TIME1 TEXT,TIME2 TEXT,TIME3 TEXT,TIME4 TEXT,TIME5 TEXT,PRIMARY KEY (UID,DAYS))" );
        db.execSQL("create table " + TABLE_SLEEPING_WKND + "(UID TEXT,DAYS TEXT,TIME1 TEXT,TIME2 TEXT,TIME3 TEXT,TIME4 TEXT,TIME5 TEXT,PRIMARY KEY (UID,DAYS))" );
        db.execSQL("create table " + TABLE_PERSONAL_CLEANLINESS_WKDY + "(UID TEXT,DAYS TEXT,TIME1 TEXT,TIME2 TEXT,TIME3 TEXT,TIME4 TEXT,TIME5 TEXT,PRIMARY KEY (UID,DAYS))" );
        db.execSQL("create table " + TABLE_PERSONAL_CLEANLINESS_WKND + "(UID TEXT,DAYS TEXT,TIME1 TEXT,TIME2 TEXT,TIME3 TEXT,TIME4 TEXT,TIME5 TEXT,PRIMARY KEY (UID,DAYS))" );
        db.execSQL("create table " + TABLE_ASSIGNMENT_SELFSTUDY_WKDY + "(UID TEXT,DAYS TEXT,TIME1 TEXT,TIME2 TEXT,TIME3 TEXT,TIME4 TEXT,TIME5 TEXT,PRIMARY KEY (UID,DAYS))" );
        db.execSQL("create table " + TABLE_ASSIGNMENT_SELFSTUDY_WKND + "(UID TEXT,DAYS TEXT,TIME1 TEXT,TIME2 TEXT,TIME3 TEXT,TIME4 TEXT,TIME5 TEXT,PRIMARY KEY (UID,DAYS))" );
        db.execSQL("create table " + TABLE_OUTING_SHOPPING_WKND + "(UID TEXT,DAYS TEXT,TIME1 TEXT,TIME2 TEXT,TIME3 TEXT,TIME4 TEXT,TIME5 TEXT,PRIMARY KEY (UID,DAYS))" );
        db.execSQL("create table " + TABLE_MISCELLANEOUS_WKND + "(UID TEXT,DAYS TEXT,ACTIVITY1 TEXT,TIME1 TEXT,ACTIVITY2 TEXT,TIME2 TEXT,ACTIVITY3 TEXT,TIME3 TEXT,PRIMARY KEY (UID,DAYS))" );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAMESUB);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAMECLASS);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_HOBBY_WKDY);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_HOBBY_WKND);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_EATING_WKDY);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_EATING_WKND);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_SLEEPING_WKDY);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_SLEEPING_WKND);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_PERSONAL_CLEANLINESS_WKDY);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_PERSONAL_CLEANLINESS_WKND);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_ASSIGNMENT_SELFSTUDY_WKDY);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_ASSIGNMENT_SELFSTUDY_WKND);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_OUTING_SHOPPING_WKND);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_MISCELLANEOUS_WKND);
    }
    @Override
    public void onOpen(SQLiteDatabase db) {
        super.onOpen(db);
        if (!db.isReadOnly()) {
            // Enable foreign key constraints
            db.execSQL("PRAGMA foreign_keys=ON;");
        }
    }

    public boolean insertData(String FIRST_NAME, String MIDDLE_NAME, String LAST_NAME, int AGE, String EMAIL,long  PHONE_NO, String PASSWORD) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2, FIRST_NAME);
        contentValues.put(COL_3, MIDDLE_NAME);
        contentValues.put(COL_4, LAST_NAME);
        contentValues.put(COL_5, AGE);
        contentValues.put(COL_6, EMAIL);
        contentValues.put(COL_7, PHONE_NO);
        contentValues.put(COL_8, PASSWORD);
        long result = db.insert(TABLE_NAME, null, contentValues);
        if (result == -1)
            return false;
        else
            return true;
    }

        public Cursor showAllData(String UID) {
            SQLiteDatabase db = this.getWritableDatabase();
            Cursor res = db.rawQuery("SELECT * FROM " + TABLE_NAME + " WHERE " +  COL_1 + "=?", new String[]{UID});
            return res;
        }


    public Cursor showAllData_admin() {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("SELECT * FROM " + TABLE_NAME ,null);
        return res;
    }

    public int delete_userData_admin(String UID) {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(TABLE_NAME, "UID=?", new String[]{UID});
    }
    public int delete_userData_admin1(String UID) {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(TABLE_NAMESUB, "UID=?", new String[]{UID});
    }
    public int delete_userData_admin2(String UID) {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(TABLE_HOBBY_WKDY, "UID=?", new String[]{UID});
    }
    public int delete_userData_admin3(String UID) {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(TABLE_HOBBY_WKND, "UID=?", new String[]{UID});
    }
    public int delete_userData_admin4(String UID) {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(TABLE_EATING_WKDY, "UID=?", new String[]{UID});
    }
    public int delete_userData_admin5(String UID) {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(TABLE_EATING_WKND, "UID=?", new String[]{UID});
    }
    public int delete_userData_admin6(String UID) {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(TABLE_SLEEPING_WKDY, "UID=?", new String[]{UID});
    }
    public int delete_userData_admin7(String UID) {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(TABLE_SLEEPING_WKND, "UID=?", new String[]{UID});
    }

    public int delete_userData_admin8(String UID) {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(TABLE_PERSONAL_CLEANLINESS_WKDY, "UID=?", new String[]{UID});
    }

    public int delete_userData_admin9(String UID) {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(TABLE_PERSONAL_CLEANLINESS_WKND, "UID=?", new String[]{UID});
    }

    public int delete_userData_admin10(String UID) {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(TABLE_ASSIGNMENT_SELFSTUDY_WKDY, "UID=?", new String[]{UID});
    }

    public int delete_userData_admin11(String UID) {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(TABLE_ASSIGNMENT_SELFSTUDY_WKND, "UID=?", new String[]{UID});
    }

    public int delete_userData_admin12(String UID) {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(TABLE_OUTING_SHOPPING_WKND, "UID=?", new String[]{UID});
    }

    public int delete_userData_admin13(String UID) {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(TABLE_MISCELLANEOUS_WKND, "UID=?", new String[]{UID});
    }




    public boolean updateData(String UID,String FIRST_NAME, String MIDDLE_NAME, String LAST_NAME, int AGE, String EMAIL,long  PHONE_NO, String PASSWORD) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2, FIRST_NAME);
        contentValues.put(COL_3, MIDDLE_NAME);
        contentValues.put(COL_4, LAST_NAME);
        contentValues.put(COL_5, AGE);
        contentValues.put(COL_6, EMAIL);
        contentValues.put(COL_7, PHONE_NO);
        contentValues.put(COL_8, PASSWORD);
        db.update(TABLE_NAME, contentValues, "UID=?", new String[]{UID});
        return true;
    }

    public int check(String user, String pass) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res = db.rawQuery("SELECT *FROM " + TABLE_NAME + " WHERE " + COL_1 + "=? AND " + COL_8 + "=?", new String[]{user, pass});

            if (res.getCount() > 0) {
                return 1;

            }
            else {
                return 0;
            }
        }
        public Cursor uidret(String email){
            SQLiteDatabase db = this.getReadableDatabase();
            Cursor res = db.rawQuery("SELECT "+COL_1+" FROM " + TABLE_NAME + " WHERE " + COL_6 + " = ?" , new String[]{email});
            return res;
        }







    public boolean insertDataSUB(String UID,String COURSE_CODE, String COURSE_NAME, String FACULTY) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2SUB, UID);
        contentValues.put(COL_1SUB, COURSE_CODE);
        contentValues.put(COL_3SUB, COURSE_NAME);
        contentValues.put(COL_4SUB, FACULTY);
        long result = db.insert(TABLE_NAMESUB, null, contentValues);
        if (result == -1)
            return false;
        else
            return true;
    }

    public Cursor get_all_dataSUB(String UID) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("SELECT *FROM " + TABLE_NAMESUB + " WHERE " +  COL_2SUB + "=?", new String[]{UID});
        return res;
    }

    public boolean update_dbmsSUB(String UI, String C_CODE, String COURSE_NAME, String FACULTY) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2SUB, UI);
        contentValues.put(COL_1SUB, C_CODE);
        contentValues.put(COL_3SUB, COURSE_NAME);
        contentValues.put(COL_4SUB, FACULTY);
        db.update(TABLE_NAMESUB, contentValues, "UID=? AND COURSE_CODE=?", new String[]{UI,C_CODE});
        return true;
    }

    public int delete_dbmsSUB(String UI,String C_CODE) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        return db.delete(TABLE_NAMESUB, "UID=? AND COURSE_CODE=?", new String[]{UI,C_CODE});
    }

    public Cursor get_all_c_code_SUB(String UID) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("SELECT "+COL_1SUB+" FROM " + TABLE_NAMESUB + " WHERE " +  COL_2SUB + "=?", new String[]{UID});
        return res;
    }









    public boolean insertDataCLASS(String UID,String DAYS, String COURSE_ID, String START,String ENDT,String ROOM,String BUILDING) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_1CLASS, UID);
        contentValues.put(COL_2CLASS, DAYS);
        contentValues.put(COL_3CLASS, COURSE_ID);
        contentValues.put(COL_4CLASS, START);
        contentValues.put(COL_5CLASS, ENDT);
        contentValues.put(COL_6CLASS, ROOM);
        contentValues.put(COL_7CLASS, BUILDING);

        long result = db.insert(TABLE_NAMECLASS, null, contentValues);
        if (result == -1)
            return false;
        else
            return true;
    }
    public Cursor get_all_dataCLASS(String UID) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("SELECT * FROM " + TABLE_NAMECLASS + " WHERE " +  COL_1_HOBBY_WKDY + "=?", new String[]{UID});
        return res;
    }

    public boolean update_dbmsCLASS(String UI,String DAY, String C_ID, String START,String ENDT,String ROOM,String BUILDING) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_1CLASS, UI);
        contentValues.put(COL_2CLASS, DAY);
        contentValues.put(COL_3CLASS, C_ID);
        contentValues.put(COL_4CLASS, START);
        contentValues.put(COL_5CLASS, ENDT);
        contentValues.put(COL_6CLASS, ROOM);
        contentValues.put(COL_7CLASS, BUILDING);
        db.update(TABLE_NAMECLASS, contentValues, "UID=? AND COURSE_ID=? AND DAYS=?", new String[]{UI,C_ID,DAY});
        return true;
    }

    public int delete_dbmsCLASS(String UID,String c_id) {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(TABLE_NAMECLASS, "UID=? AND COURSE_ID=?", new String[]{UID,c_id});
    }









    public boolean insertDataHOBBY_WKDY(String UID,String DAYS,String TIME1,String TIME2,String TIME3,String TIME4,String TIME5) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_1_HOBBY_WKDY, UID);
        contentValues.put(COL_2_HOBBY_WKDY, DAYS);
        contentValues.put(COL_3_HOBBY_WKDY, TIME1);
        contentValues.put(COL_4_HOBBY_WKDY, TIME2);
        contentValues.put(COL_5_HOBBY_WKDY, TIME3);
        contentValues.put(COL_6_HOBBY_WKDY, TIME4);
        contentValues.put(COL_7_HOBBY_WKDY, TIME5);

        long result = db.insert(TABLE_HOBBY_WKDY, null, contentValues);
        if (result == -1)
            return false;
        else
            return true;
    }

    public Cursor get_all_dataHOBBY_WKDY(String UID) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("SELECT * FROM " + TABLE_HOBBY_WKDY + " WHERE " +  COL_1_HOBBY_WKDY + "=?", new String[]{UID});
        return res;
    }

    public boolean update_dbmsHOBBY_WKDY(String UID,String DAYS,String TIME1,String TIME2,String TIME3,String TIME4,String TIME5) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_1_HOBBY_WKDY, UID);
        contentValues.put(COL_2_HOBBY_WKDY, DAYS);
        contentValues.put(COL_3_HOBBY_WKDY, TIME1);
        contentValues.put(COL_4_HOBBY_WKDY, TIME2);
        contentValues.put(COL_5_HOBBY_WKDY, TIME3);
        contentValues.put(COL_6_HOBBY_WKDY, TIME4);
        contentValues.put(COL_7_HOBBY_WKDY, TIME5);
        db.update(TABLE_HOBBY_WKDY, contentValues, "UID=? AND DAYS=?", new String[]{UID,DAYS});
        return true;
    }

    public int delete_dbmsHOBBY_WKDY(String UID,String DAYS) {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(TABLE_HOBBY_WKDY, "UID=? AND DAYS=?", new String[]{UID,DAYS});
    }






    public boolean insertDataHOBBY_WKND(String UID,String DAYS,String TIME1,String TIME2,String TIME3,String TIME4,String TIME5) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_1_HOBBY_WKND, UID);
        contentValues.put(COL_2_HOBBY_WKND, DAYS);
        contentValues.put(COL_3_HOBBY_WKND, TIME1);
        contentValues.put(COL_4_HOBBY_WKND, TIME2);
        contentValues.put(COL_5_HOBBY_WKND, TIME3);
        contentValues.put(COL_6_HOBBY_WKND, TIME4);
        contentValues.put(COL_7_HOBBY_WKND, TIME5);

        long result = db.insert(TABLE_HOBBY_WKND, null, contentValues);
        if (result == -1)
            return false;
        else
            return true;
    }

    public Cursor get_all_dataHOBBY_WKND(String UID) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("SELECT * FROM " + TABLE_HOBBY_WKND + " WHERE " +  COL_1_HOBBY_WKND + "=?", new String[]{UID});
        return res;
    }

    public boolean update_dbmsHOBBY_WKND(String UID,String DAYS,String TIME1,String TIME2,String TIME3,String TIME4,String TIME5) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_1_HOBBY_WKND, UID);
        contentValues.put(COL_2_HOBBY_WKND, DAYS);
        contentValues.put(COL_3_HOBBY_WKND, TIME1);
        contentValues.put(COL_4_HOBBY_WKND, TIME2);
        contentValues.put(COL_5_HOBBY_WKND, TIME3);
        contentValues.put(COL_6_HOBBY_WKND, TIME4);
        contentValues.put(COL_7_HOBBY_WKND, TIME5);
        db.update(TABLE_HOBBY_WKND, contentValues, "UID=? AND DAYS=?", new String[]{UID,DAYS});
        return true;
    }

    public int delete_dbmsHOBBY_WKND(String UID,String DAYS) {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(TABLE_HOBBY_WKND, "UID=? AND DAYS=?", new String[]{UID,DAYS});
    }












    public boolean insertDataEATING_WKND(String UID,String DAYS,String TIME1,String TIME2,String TIME3,String TIME4,String TIME5) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_1_EATING_WKND, UID);
        contentValues.put(COL_2_EATING_WKND, DAYS);
        contentValues.put(COL_3_EATING_WKND, TIME1);
        contentValues.put(COL_4_EATING_WKND, TIME2);
        contentValues.put(COL_5_EATING_WKND, TIME3);
        contentValues.put(COL_6_EATING_WKND, TIME4);
        contentValues.put(COL_7_EATING_WKND, TIME5);

        long result = db.insert(TABLE_EATING_WKND, null, contentValues);
        if (result == -1)
            return false;
        else
            return true;
    }

    public Cursor get_all_dataEATING_WKND(String UID) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("SELECT * FROM " + TABLE_EATING_WKND + " WHERE " +  COL_1_EATING_WKND + "=?", new String[]{UID});
        return res;
    }

    public boolean update_dbmsEATING_WKND(String UID,String DAYS,String TIME1,String TIME2,String TIME3,String TIME4,String TIME5) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_1_EATING_WKND, UID);
        contentValues.put(COL_2_EATING_WKND, DAYS);
        contentValues.put(COL_3_EATING_WKND, TIME1);
        contentValues.put(COL_4_EATING_WKND, TIME2);
        contentValues.put(COL_5_EATING_WKND, TIME3);
        contentValues.put(COL_6_EATING_WKND, TIME4);
        contentValues.put(COL_7_EATING_WKND, TIME5);
        db.update(TABLE_EATING_WKND, contentValues, "UID=? AND DAYS=?", new String[]{UID,DAYS});
        return true;
    }

    public int delete_dbmsEATING_WKND(String UID,String DAYS) {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(TABLE_EATING_WKND, "UID=? AND DAYS=?", new String[]{UID,DAYS});
    }







    public boolean insertDataEATING_WKDY(String UID,String DAYS,String TIME1,String TIME2,String TIME3,String TIME4,String TIME5) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_1_EATING_WKDY, UID);
        contentValues.put(COL_2_EATING_WKDY, DAYS);
        contentValues.put(COL_3_EATING_WKDY, TIME1);
        contentValues.put(COL_4_EATING_WKDY, TIME2);
        contentValues.put(COL_5_EATING_WKDY, TIME3);
        contentValues.put(COL_6_EATING_WKDY, TIME4);
        contentValues.put(COL_7_EATING_WKDY, TIME5);

        long result = db.insert(TABLE_EATING_WKDY, null, contentValues);
        if (result == -1)
            return false;
        else
            return true;
    }

    public Cursor get_all_dataEATING_WKDY(String UID) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("SELECT * FROM " + TABLE_EATING_WKDY + " WHERE " +  COL_1_EATING_WKDY + "=?", new String[]{UID});
        return res;
    }

    public boolean update_dbmsEATING_WKDY(String UID,String DAYS,String TIME1,String TIME2,String TIME3,String TIME4,String TIME5) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_1_EATING_WKDY, UID);
        contentValues.put(COL_2_EATING_WKDY, DAYS);
        contentValues.put(COL_3_EATING_WKDY, TIME1);
        contentValues.put(COL_4_EATING_WKDY, TIME2);
        contentValues.put(COL_5_EATING_WKDY, TIME3);
        contentValues.put(COL_6_EATING_WKDY, TIME4);
        contentValues.put(COL_7_EATING_WKDY, TIME5);
        db.update(TABLE_EATING_WKDY, contentValues, "UID=? AND DAYS=?", new String[]{UID,DAYS});
        return true;
    }

    public int delete_dbmsEATING_WKDY(String UID,String DAYS) {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(TABLE_EATING_WKDY, "UID=? AND DAYS=?", new String[]{UID,DAYS});
    }





    public boolean insertDataPERSONAL_CLEANLINESS_WKDY(String UID,String DAYS,String TIME1,String TIME2,String TIME3,String TIME4,String TIME5) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_1_PERSONAL_CLEANLINESS_WKDY, UID);
        contentValues.put(COL_2_PERSONAL_CLEANLINESS_WKDY, DAYS);
        contentValues.put(COL_3_PERSONAL_CLEANLINESS_WKDY, TIME1);
        contentValues.put(COL_4_PERSONAL_CLEANLINESS_WKDY, TIME2);
        contentValues.put(COL_5_PERSONAL_CLEANLINESS_WKDY, TIME3);
        contentValues.put(COL_6_PERSONAL_CLEANLINESS_WKDY, TIME4);
        contentValues.put(COL_7_PERSONAL_CLEANLINESS_WKDY, TIME5);

        long result = db.insert(TABLE_PERSONAL_CLEANLINESS_WKDY, null, contentValues);
        if (result == -1)
            return false;
        else
            return true;
    }

    public Cursor get_all_dataPERSONAL_CLEANLINESS_WKDY(String UID) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("SELECT * FROM " + TABLE_PERSONAL_CLEANLINESS_WKDY + " WHERE " +  COL_1_PERSONAL_CLEANLINESS_WKDY + "=?", new String[]{UID});
        return res;
    }

    public boolean update_dbmsPERSONAL_CLEANLINESS_WKDY(String UID,String DAYS,String TIME1,String TIME2,String TIME3,String TIME4,String TIME5) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_1_PERSONAL_CLEANLINESS_WKDY, UID);
        contentValues.put(COL_2_PERSONAL_CLEANLINESS_WKDY, DAYS);
        contentValues.put(COL_3_PERSONAL_CLEANLINESS_WKDY, TIME1);
        contentValues.put(COL_4_PERSONAL_CLEANLINESS_WKDY, TIME2);
        contentValues.put(COL_5_PERSONAL_CLEANLINESS_WKDY, TIME3);
        contentValues.put(COL_6_PERSONAL_CLEANLINESS_WKDY, TIME4);
        contentValues.put(COL_7_PERSONAL_CLEANLINESS_WKDY, TIME5);
        db.update(TABLE_PERSONAL_CLEANLINESS_WKDY, contentValues, "UID=? AND DAYS=?", new String[]{UID,DAYS});
        return true;
    }

    public int delete_dbmsPERSONAL_CLEANLINESS_WKDY(String UID,String DAYS) {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(TABLE_PERSONAL_CLEANLINESS_WKDY, "UID=? AND DAYS=?", new String[]{UID,DAYS});
    }





    public boolean insertDataPERSONAL_CLEANLINESS_WKND(String UID,String DAYS,String TIME1,String TIME2,String TIME3,String TIME4,String TIME5) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_1_PERSONAL_CLEANLINESS_WKND, UID);
        contentValues.put(COL_2_PERSONAL_CLEANLINESS_WKND, DAYS);
        contentValues.put(COL_3_PERSONAL_CLEANLINESS_WKND, TIME1);
        contentValues.put(COL_4_PERSONAL_CLEANLINESS_WKND, TIME2);
        contentValues.put(COL_5_PERSONAL_CLEANLINESS_WKND, TIME3);
        contentValues.put(COL_6_PERSONAL_CLEANLINESS_WKND, TIME4);
        contentValues.put(COL_7_PERSONAL_CLEANLINESS_WKND, TIME5);

        long result = db.insert(TABLE_PERSONAL_CLEANLINESS_WKND, null, contentValues);
        if (result == -1)
            return false;
        else
            return true;
    }

    public Cursor get_all_dataPERSONAL_CLEANLINESS_WKND(String UID) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("SELECT * FROM " + TABLE_PERSONAL_CLEANLINESS_WKND + " WHERE " +  COL_1_PERSONAL_CLEANLINESS_WKND + "=?", new String[]{UID});
        return res;
    }

    public boolean update_dbmsPERSONAL_CLEANLINESS_WKND(String UID,String DAYS,String TIME1,String TIME2,String TIME3,String TIME4,String TIME5) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_1_PERSONAL_CLEANLINESS_WKND, UID);
        contentValues.put(COL_2_PERSONAL_CLEANLINESS_WKND, DAYS);
        contentValues.put(COL_3_PERSONAL_CLEANLINESS_WKND, TIME1);
        contentValues.put(COL_4_PERSONAL_CLEANLINESS_WKND, TIME2);
        contentValues.put(COL_5_PERSONAL_CLEANLINESS_WKND, TIME3);
        contentValues.put(COL_6_PERSONAL_CLEANLINESS_WKND, TIME4);
        contentValues.put(COL_7_PERSONAL_CLEANLINESS_WKND, TIME5);
        db.update(TABLE_PERSONAL_CLEANLINESS_WKND, contentValues, "UID=? AND DAYS=?", new String[]{UID,DAYS});
        return true;
    }

    public int delete_dbmsPERSONAL_CLEANLINESS_WKND(String UID,String DAYS) {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(TABLE_PERSONAL_CLEANLINESS_WKND, "UID=? AND DAYS=?", new String[]{UID,DAYS});
    }












    public boolean insertDataSLEEPING_WKDY(String UID,String DAYS,String TIME1,String TIME2,String TIME3,String TIME4,String TIME5) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_1_SLEEPING_WKDY, UID);
        contentValues.put(COL_2_SLEEPING_WKDY, DAYS);
        contentValues.put(COL_3_SLEEPING_WKDY, TIME1);
        contentValues.put(COL_4_SLEEPING_WKDY, TIME2);
        contentValues.put(COL_5_SLEEPING_WKDY, TIME3);
        contentValues.put(COL_6_SLEEPING_WKDY, TIME4);
        contentValues.put(COL_7_SLEEPING_WKDY, TIME5);

        long result = db.insert(TABLE_SLEEPING_WKDY, null, contentValues);
        if (result == -1)
            return false;
        else
            return true;
    }

    public Cursor get_all_dataSLEEPING_WKDY(String UID) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("SELECT * FROM " + TABLE_SLEEPING_WKDY + " WHERE " +  COL_1_SLEEPING_WKDY + "=?", new String[]{UID});
        return res;
    }

    public boolean update_dbmsSLEEPING_WKDY(String UID,String DAYS,String TIME1,String TIME2,String TIME3,String TIME4,String TIME5) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_1_SLEEPING_WKDY, UID);
        contentValues.put(COL_2_SLEEPING_WKDY, DAYS);
        contentValues.put(COL_3_SLEEPING_WKDY, TIME1);
        contentValues.put(COL_4_SLEEPING_WKDY, TIME2);
        contentValues.put(COL_5_SLEEPING_WKDY, TIME3);
        contentValues.put(COL_6_SLEEPING_WKDY, TIME4);
        contentValues.put(COL_7_SLEEPING_WKDY, TIME5);
        db.update(TABLE_SLEEPING_WKDY, contentValues, "UID=? AND DAYS=?", new String[]{UID,DAYS});
        return true;
    }

    public int delete_dbmsSLEEPING_WKDY(String UID,String DAYS) {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(TABLE_SLEEPING_WKDY, "UID=? AND DAYS=?", new String[]{UID,DAYS});
    }





    public boolean insertDataSLEEPING_WKND(String UID,String DAYS,String TIME1,String TIME2,String TIME3,String TIME4,String TIME5) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_1_SLEEPING_WKND, UID);
        contentValues.put(COL_2_SLEEPING_WKND, DAYS);
        contentValues.put(COL_3_SLEEPING_WKND, TIME1);
        contentValues.put(COL_4_SLEEPING_WKND, TIME2);
        contentValues.put(COL_5_SLEEPING_WKND, TIME3);
        contentValues.put(COL_6_SLEEPING_WKND, TIME4);
        contentValues.put(COL_7_SLEEPING_WKND, TIME5);

        long result = db.insert(TABLE_SLEEPING_WKND, null, contentValues);
        if (result == -1)
            return false;
        else
            return true;
    }

    public Cursor get_all_dataSLEEPING_WKND(String UID) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("SELECT * FROM " + TABLE_SLEEPING_WKND + " WHERE " +  COL_1_SLEEPING_WKND + "=?", new String[]{UID});
        return res;
    }

    public boolean update_dbmsSLEEPING_WKND(String UID,String DAYS,String TIME1,String TIME2,String TIME3,String TIME4,String TIME5) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_1_SLEEPING_WKND, UID);
        contentValues.put(COL_2_SLEEPING_WKND, DAYS);
        contentValues.put(COL_3_SLEEPING_WKND, TIME1);
        contentValues.put(COL_4_SLEEPING_WKND, TIME2);
        contentValues.put(COL_5_SLEEPING_WKND, TIME3);
        contentValues.put(COL_6_SLEEPING_WKND, TIME4);
        contentValues.put(COL_7_SLEEPING_WKND, TIME5);
        db.update(TABLE_SLEEPING_WKND, contentValues, "UID=? AND DAYS=?", new String[]{UID,DAYS});
        return true;
    }

    public int delete_dbmsSLEEPING_WKND(String UID,String DAYS) {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(TABLE_SLEEPING_WKND, "UID=? AND DAYS=?", new String[]{UID,DAYS});
    }

















    public boolean insertDataASSIGNMENT_SELFSTUDY_WKDY(String UID,String DAYS,String TIME1,String TIME2,String TIME3,String TIME4,String TIME5) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_1_ASSIGNMENT_SELFSTUDY_WKDY, UID);
        contentValues.put(COL_2_ASSIGNMENT_SELFSTUDY_WKDY, DAYS);
        contentValues.put(COL_3_ASSIGNMENT_SELFSTUDY_WKDY, TIME1);
        contentValues.put(COL_4_ASSIGNMENT_SELFSTUDY_WKDY, TIME2);
        contentValues.put(COL_5_ASSIGNMENT_SELFSTUDY_WKDY, TIME3);
        contentValues.put(COL_6_ASSIGNMENT_SELFSTUDY_WKDY, TIME4);
        contentValues.put(COL_7_ASSIGNMENT_SELFSTUDY_WKDY, TIME5);

        long result = db.insert(TABLE_ASSIGNMENT_SELFSTUDY_WKDY, null, contentValues);
        if (result == -1)
            return false;
        else
            return true;
    }

    public Cursor get_all_dataASSIGNMENT_SELFSTUDY_WKDY(String UID) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("SELECT * FROM " + TABLE_ASSIGNMENT_SELFSTUDY_WKDY + " WHERE " +  COL_1_ASSIGNMENT_SELFSTUDY_WKDY + "=?", new String[]{UID});
        return res;
    }

    public boolean update_dbmsASSIGNMENT_SELFSTUDY_WKDY(String UID,String DAYS,String TIME1,String TIME2,String TIME3,String TIME4,String TIME5) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_1_ASSIGNMENT_SELFSTUDY_WKDY, UID);
        contentValues.put(COL_2_ASSIGNMENT_SELFSTUDY_WKDY, DAYS);
        contentValues.put(COL_3_ASSIGNMENT_SELFSTUDY_WKDY, TIME1);
        contentValues.put(COL_4_ASSIGNMENT_SELFSTUDY_WKDY, TIME2);
        contentValues.put(COL_5_ASSIGNMENT_SELFSTUDY_WKDY, TIME3);
        contentValues.put(COL_6_ASSIGNMENT_SELFSTUDY_WKDY, TIME4);
        contentValues.put(COL_7_ASSIGNMENT_SELFSTUDY_WKDY, TIME5);
        db.update(TABLE_ASSIGNMENT_SELFSTUDY_WKDY, contentValues, "UID=? AND DAYS=?", new String[]{UID,DAYS});
        return true;
    }

    public int delete_dbmsASSIGNMENT_SELFSTUDY_WKDY(String UID,String DAYS) {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(TABLE_ASSIGNMENT_SELFSTUDY_WKDY, "UID=? AND DAYS=?", new String[]{UID,DAYS});
    }





    public boolean insertDataASSIGNMENT_SELFSTUDY_WKND(String UID,String DAYS,String TIME1,String TIME2,String TIME3,String TIME4,String TIME5) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_1_ASSIGNMENT_SELFSTUDY_WKND, UID);
        contentValues.put(COL_2_ASSIGNMENT_SELFSTUDY_WKND, DAYS);
        contentValues.put(COL_3_ASSIGNMENT_SELFSTUDY_WKND, TIME1);
        contentValues.put(COL_4_ASSIGNMENT_SELFSTUDY_WKND, TIME2);
        contentValues.put(COL_5_ASSIGNMENT_SELFSTUDY_WKND, TIME3);
        contentValues.put(COL_6_ASSIGNMENT_SELFSTUDY_WKND, TIME4);
        contentValues.put(COL_7_ASSIGNMENT_SELFSTUDY_WKND, TIME5);

        long result = db.insert(TABLE_ASSIGNMENT_SELFSTUDY_WKND, null, contentValues);
        if (result == -1)
            return false;
        else
            return true;
    }

    public Cursor get_all_dataASSIGNMENT_SELFSTUDY_WKND(String UID) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("SELECT * FROM " + TABLE_ASSIGNMENT_SELFSTUDY_WKND + " WHERE " +  COL_1_ASSIGNMENT_SELFSTUDY_WKND + "=?", new String[]{UID});
        return res;
    }

    public boolean update_dbmsASSIGNMENT_SELFSTUDY_WKND(String UID,String DAYS,String TIME1,String TIME2,String TIME3,String TIME4,String TIME5) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_1_ASSIGNMENT_SELFSTUDY_WKND, UID);
        contentValues.put(COL_2_ASSIGNMENT_SELFSTUDY_WKND, DAYS);
        contentValues.put(COL_3_ASSIGNMENT_SELFSTUDY_WKND, TIME1);
        contentValues.put(COL_4_ASSIGNMENT_SELFSTUDY_WKND, TIME2);
        contentValues.put(COL_5_ASSIGNMENT_SELFSTUDY_WKND, TIME3);
        contentValues.put(COL_6_ASSIGNMENT_SELFSTUDY_WKND, TIME4);
        contentValues.put(COL_7_ASSIGNMENT_SELFSTUDY_WKND, TIME5);
        db.update(TABLE_ASSIGNMENT_SELFSTUDY_WKND, contentValues, "UID=? AND DAYS=?", new String[]{UID,DAYS});
        return true;
    }

    public int delete_dbmsASSIGNMENT_SELFSTUDY_WKND(String UID,String DAYS) {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(TABLE_ASSIGNMENT_SELFSTUDY_WKND, "UID=? AND DAYS=?", new String[]{UID,DAYS});
    }







    public boolean insertDataOUTING_SHOPPING_WKND(String UID,String DAYS,String TIME1,String TIME2,String TIME3,String TIME4,String TIME5) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_1_OUTING_SHOPPING_WKND, UID);
        contentValues.put(COL_2_OUTING_SHOPPING_WKND, DAYS);
        contentValues.put(COL_3_OUTING_SHOPPING_WKND, TIME1);
        contentValues.put(COL_4_OUTING_SHOPPING_WKND, TIME2);
        contentValues.put(COL_5_OUTING_SHOPPING_WKND, TIME3);
        contentValues.put(COL_6_OUTING_SHOPPING_WKND, TIME4);
        contentValues.put(COL_7_OUTING_SHOPPING_WKND, TIME5);

        long result = db.insert(TABLE_OUTING_SHOPPING_WKND, null, contentValues);
        if (result == -1)
            return false;
        else
            return true;
    }

    public Cursor get_all_dataOUTING_SHOPPING_WKND(String UID) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("SELECT * FROM " + TABLE_OUTING_SHOPPING_WKND + " WHERE " +  COL_1_OUTING_SHOPPING_WKND + "=?", new String[]{UID});
        return res;
    }

    public boolean update_dbmsOUTING_SHOPPING_WKND(String UID,String DAYS,String TIME1,String TIME2,String TIME3,String TIME4,String TIME5) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_1_OUTING_SHOPPING_WKND, UID);
        contentValues.put(COL_2_OUTING_SHOPPING_WKND, DAYS);
        contentValues.put(COL_3_OUTING_SHOPPING_WKND, TIME1);
        contentValues.put(COL_4_OUTING_SHOPPING_WKND, TIME2);
        contentValues.put(COL_5_OUTING_SHOPPING_WKND, TIME3);
        contentValues.put(COL_6_OUTING_SHOPPING_WKND, TIME4);
        contentValues.put(COL_7_OUTING_SHOPPING_WKND, TIME5);
        db.update(TABLE_OUTING_SHOPPING_WKND, contentValues, "UID=? AND DAYS=?", new String[]{UID,DAYS});
        return true;
    }

    public int delete_dbmsOUTING_SHOPPING_WKND(String UID,String DAYS) {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(TABLE_OUTING_SHOPPING_WKND, "UID=? AND DAYS=?", new String[]{UID,DAYS});
    }






    public boolean insertDataMISCELLANEOUS_WKND(String UID,String DAYS,String ACTIVITY1,String TIME1,String ACTIVITY2,String TIME2,String ACTIVITY3,String TIME3) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_1_MISCELLANEOUS_WKND, UID);
        contentValues.put(COL_2_MISCELLANEOUS_WKND, DAYS);
        contentValues.put(COL_3_MISCELLANEOUS_WKND, ACTIVITY1);
        contentValues.put(COL_4_MISCELLANEOUS_WKND, TIME1);
        contentValues.put(COL_5_MISCELLANEOUS_WKND, ACTIVITY2);
        contentValues.put(COL_6_MISCELLANEOUS_WKND, TIME2);
        contentValues.put(COL_7_MISCELLANEOUS_WKND, ACTIVITY3);
        contentValues.put(COL_8_MISCELLANEOUS_WKND, TIME3);

        long result = db.insert(TABLE_MISCELLANEOUS_WKND, null, contentValues);
        if (result == -1)
            return false;
        else
            return true;
    }

    public Cursor get_all_dataMISCELLANEOUS_WKND(String UID) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("SELECT * FROM " + TABLE_MISCELLANEOUS_WKND + " WHERE " +  COL_1_MISCELLANEOUS_WKND + "=?", new String[]{UID});
        return res;
    }

    public boolean update_dbmsMISCELLANEOUS_WKND(String UID,String DAYS,String ACTIVITY1,String TIME1,String ACTIVITY2,String TIME2,String ACTIVITY3,String TIME3) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_1_MISCELLANEOUS_WKND, UID);
        contentValues.put(COL_2_MISCELLANEOUS_WKND, DAYS);
        contentValues.put(COL_3_MISCELLANEOUS_WKND, ACTIVITY1);
        contentValues.put(COL_4_MISCELLANEOUS_WKND, TIME1);
        contentValues.put(COL_5_MISCELLANEOUS_WKND, ACTIVITY2);
        contentValues.put(COL_6_MISCELLANEOUS_WKND, TIME2);
        contentValues.put(COL_7_MISCELLANEOUS_WKND, ACTIVITY3);
        contentValues.put(COL_8_MISCELLANEOUS_WKND, TIME3);
        db.update(TABLE_MISCELLANEOUS_WKND, contentValues, "UID=? AND DAYS=?", new String[]{UID,DAYS});
        return true;
    }

    public int delete_dbmsMISCELLANEOUS_WKND(String UID,String DAYS) {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(TABLE_MISCELLANEOUS_WKND, "UID=? AND DAYS=?", new String[]{UID,DAYS});
    }

















    //DJ YEH JOINS AND DAYS CODE HAI TABLE KA INSERT DELETE UPDATE ISKE UPAR RAKHNA



    /**WEEKDAYS**/
    public Cursor get_all_datadaywise_EAT(String UID,String Day) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("SELECT "+COL_3_EATING_WKDY+","+COL_4_EATING_WKDY+","+COL_5_EATING_WKDY+","+COL_6_EATING_WKDY+","+COL_7_EATING_WKDY+" FROM " + TABLE_EATING_WKDY + " WHERE " +  COL_1_EATING_WKDY + "=? AND "+COL_2_EATING_WKDY+"=?", new String[]{UID,Day});
        return res;
    }

    public Cursor get_all_datadaywise_ASSGN(String UID,String Day) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("SELECT "+COL_3_ASSIGNMENT_SELFSTUDY_WKDY+","+COL_4_ASSIGNMENT_SELFSTUDY_WKDY+","+COL_5_ASSIGNMENT_SELFSTUDY_WKDY+","+COL_6_ASSIGNMENT_SELFSTUDY_WKDY+","+COL_7_EATING_WKDY+" FROM " + TABLE_ASSIGNMENT_SELFSTUDY_WKDY + " WHERE " +  COL_1_ASSIGNMENT_SELFSTUDY_WKDY + "=? AND "+COL_2_ASSIGNMENT_SELFSTUDY_WKDY+"=?", new String[]{UID,Day});
        return res;
    }

    public Cursor get_all_datadaywise_SLEEP(String UID,String Day) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("SELECT "+COL_3_SLEEPING_WKDY+","+COL_4_SLEEPING_WKDY+","+COL_5_SLEEPING_WKDY+","+COL_6_SLEEPING_WKDY+","+COL_5_SLEEPING_WKDY+" FROM " + TABLE_SLEEPING_WKDY + " WHERE " +  COL_1_SLEEPING_WKDY + "=? AND "+COL_2_SLEEPING_WKDY+"=?", new String[]{UID,Day});
        return res;
    }

    public Cursor get_all_datadaywise_PERSONAL(String UID,String Day) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("SELECT "+COL_3_PERSONAL_CLEANLINESS_WKDY+","+COL_4_PERSONAL_CLEANLINESS_WKDY+","+COL_5_PERSONAL_CLEANLINESS_WKDY+","+COL_6_PERSONAL_CLEANLINESS_WKDY+","+COL_7_PERSONAL_CLEANLINESS_WKDY+" FROM " + TABLE_PERSONAL_CLEANLINESS_WKDY + " WHERE " +  COL_1_PERSONAL_CLEANLINESS_WKDY + "=? AND "+COL_2_PERSONAL_CLEANLINESS_WKDY+"=?", new String[]{UID,Day});
        return res;
    }

    public Cursor get_all_datadaywise_HOBBY_WKDY(String UID,String Day) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("SELECT "+COL_3_HOBBY_WKDY+","+COL_4_HOBBY_WKDY+","+COL_5_HOBBY_WKDY+","+COL_6_HOBBY_WKDY+","+COL_7_HOBBY_WKDY+" FROM " + TABLE_HOBBY_WKDY + " WHERE " +  COL_1_HOBBY_WKDY + "=? AND "+COL_2_HOBBY_WKDY+"=?", new String[]{UID,Day});
        return res;
    }

    public Cursor get_all_datadaywise_CLASSES(String UID1,String Day){
        SQLiteDatabase db = this.getWritableDatabase();
        /*Cursor res = db.rawQuery("SELECT A."+COL_4CLASS+",A."+COL_5CLASS+",B."+COL_1SUB+",B."+COL_3SUB+" FROM "+TABLE_NAMECLASS+" A,"+TABLE_NAMESUB+" B WHERE A."+COL_1CLASS+"=B."+COL_2SUB+" AND "+COL_1CLASS+"=? AND "+COL_2CLASS+"=?", new String[]{UID1,Day});*/
        Cursor res = db.rawQuery("select b.COURSE_NAME,b.COURSE_CODE,a.START,a.ENDT,a.ROOM,a.BUILDING from CLASS a INNER JOIN subjects b ON a.COURSE_ID=b.COURSE_CODE WHERE a.UID=? and a.DAYS=?", new String[]{UID1,Day});
        return res;
    }



    /**WEEKENDS**/
    public Cursor get_all_datadaywise_EAT_WKND(String UID,String Day) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("SELECT "+COL_3_EATING_WKND+","+COL_4_EATING_WKND+","+COL_5_EATING_WKND+","+COL_6_EATING_WKND+","+COL_7_EATING_WKND+" FROM " + TABLE_EATING_WKND + " WHERE " +  COL_1_EATING_WKND + "=? AND "+COL_2_EATING_WKND+"=?", new String[]{UID,Day});
        return res;
    }

    public Cursor get_all_datadaywise_ASSGN_WKND(String UID,String Day) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("SELECT "+COL_3_ASSIGNMENT_SELFSTUDY_WKND+","+COL_4_ASSIGNMENT_SELFSTUDY_WKND+","+COL_5_ASSIGNMENT_SELFSTUDY_WKND+","+COL_6_ASSIGNMENT_SELFSTUDY_WKND+","+COL_7_EATING_WKND+" FROM " + TABLE_ASSIGNMENT_SELFSTUDY_WKND + " WHERE " +  COL_1_ASSIGNMENT_SELFSTUDY_WKND + "=? AND "+COL_2_ASSIGNMENT_SELFSTUDY_WKND+"=?", new String[]{UID,Day});
        return res;
    }

    public Cursor get_all_datadaywise_SLEEP_WKND(String UID,String Day) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("SELECT "+COL_3_SLEEPING_WKDY+","+COL_4_SLEEPING_WKND+","+COL_5_SLEEPING_WKND+","+COL_6_SLEEPING_WKND+","+COL_5_SLEEPING_WKND+" FROM " + TABLE_SLEEPING_WKND + " WHERE " +  COL_1_SLEEPING_WKND + "=? AND "+COL_2_SLEEPING_WKND+"=?", new String[]{UID,Day});
        return res;
    }

    public Cursor get_all_datadaywise_PERSONAL_WKND(String UID,String Day) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("SELECT "+COL_3_PERSONAL_CLEANLINESS_WKND+","+COL_4_PERSONAL_CLEANLINESS_WKND+","+COL_5_PERSONAL_CLEANLINESS_WKND+","+COL_6_PERSONAL_CLEANLINESS_WKND+","+COL_7_PERSONAL_CLEANLINESS_WKND+" FROM " + TABLE_PERSONAL_CLEANLINESS_WKND + " WHERE " +  COL_1_PERSONAL_CLEANLINESS_WKND + "=? AND "+COL_2_PERSONAL_CLEANLINESS_WKND+"=?", new String[]{UID,Day});
        return res;
    }

    public Cursor get_all_datadaywise_OUTING_WKND(String UID,String Day) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("SELECT "+COL_3_OUTING_SHOPPING_WKND+","+COL_4_OUTING_SHOPPING_WKND+","+COL_5_OUTING_SHOPPING_WKND+","+COL_6_OUTING_SHOPPING_WKND+","+COL_7_OUTING_SHOPPING_WKND+" FROM " + TABLE_OUTING_SHOPPING_WKND + " WHERE " +  COL_1_OUTING_SHOPPING_WKND + "=? AND "+COL_2_OUTING_SHOPPING_WKND+"=?", new String[]{UID,Day});
        return res;
    }

    public Cursor get_all_datadaywise_HOBBY_WKND(String UID,String Day) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("SELECT " + COL_3_HOBBY_WKND + "," + COL_4_HOBBY_WKND + "," + COL_5_HOBBY_WKND + "," + COL_6_HOBBY_WKND + "," + COL_7_HOBBY_WKND + " FROM " + TABLE_HOBBY_WKND + " WHERE " + COL_1_HOBBY_WKND + "=? AND " + COL_2_HOBBY_WKND + "=?", new String[]{UID, Day});
        return res;
    }

    public Cursor get_all_datadaywise_MISCELLANEOUS_WKND(String UID,String Day) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("SELECT "+COL_3_MISCELLANEOUS_WKND+","+COL_4_MISCELLANEOUS_WKND+","+COL_5_MISCELLANEOUS_WKND+","+COL_6_MISCELLANEOUS_WKND+","+COL_7_MISCELLANEOUS_WKND+","+COL_8_MISCELLANEOUS_WKND+" FROM " + TABLE_MISCELLANEOUS_WKND + " WHERE " +  COL_1_MISCELLANEOUS_WKND + "=? AND "+COL_2_MISCELLANEOUS_WKND+"=?", new String[]{UID,Day});
        return res;
    }



}