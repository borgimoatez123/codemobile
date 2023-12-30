package com.example.finalproject;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;



public class AccesBDLocale {
    private String nombd = "yarabitmchi";
    private Integer versionbd=1;
    private MySQLiteOpenHelper accesBD;
    private SQLiteDatabase bd;

    public AccesBDLocale(Context context) {
        accesBD = new MySQLiteOpenHelper(context, nombd, null, versionbd);
    }

    /**
     * ajoute un profil dans la table profil
     */

    public void ajout(Profil profil){
        bd = accesBD.getWritableDatabase();
        String req="INSERT INTO profil ( compte, password,Sexe)";
        req +="VALUES ('" +profil.getCompte()+"', '"+profil.getPassword()+"', "+profil.getSexe()+");";
        bd.execSQL(req);
    }

    public Profil RecupDernier(){
        Profil p = null;

        bd = accesBD.getReadableDatabase();
        String req="SELECT * FROM profil;";
        Cursor curseur = bd.rawQuery(req, null);
        curseur.moveToLast();
        if (! curseur.isAfterLast()){
            Integer id = curseur.getInt(0);

            String compte = curseur.getString(1);
            String password = curseur.getString(2);
            Integer sexe = curseur.getInt(3);

            p = new Profil(id, compte, password, sexe);

        }
        return p;

    }
}
