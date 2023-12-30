package com.example.finalproject;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.Nullable;
public class MySQLiteOpenHelper extends SQLiteOpenHelper {
    /**
     * contient la requete de création de la table profil
     */
    private String creation="CREATE TABLE profil ("
            +"id Integer PRIMARY KEY autoincrement,"

            + "compte TEXT NOT NULL,"
            + "password TEXT NOT NULL,"
            + "sexe INTEGER NOT NULL);";
    public MySQLiteOpenHelper(@Nullable Context context, @Nullable String
            name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }
    /**
     * appelée quant on change de bd
     * @param sqLiteDatabase  //permet d'eexécuter la requete sur la bd
     */
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(creation);
    }
    /**
     *
     * @param sqLiteDatabase
     * @param i  version actuelle
     * @param i1 nouvelle version
     */
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
    }
}