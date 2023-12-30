package com.example.finalproject;



import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

import java.util.Date;

public class Activity5 extends AppCompatActivity {

    EditText edtid;
    EditText txtcpt;
    EditText txtpwd;
    RadioButton rde;
    RadioButton rdee;


    AccesBDLocale accesLocal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);
        init();
    }
    private void init(){
        edtid = (EditText) findViewById(R.id.edtid);
        txtcpt=(EditText) findViewById(R.id.txtcpt);
        txtpwd=(EditText) findViewById(R.id.txtpwd);
        rdee = (RadioButton) findViewById(R.id.rdee);
        rde = (RadioButton) findViewById(R.id.rde);


        accesLocal = new AccesBDLocale(this);




        Profil p = accesLocal.RecupDernier();
        if (p != null){
            edtid.setText(p.getId().toString());

            txtcpt.setText(p.getCompte());
            txtpwd.setText(p.getPassword());
            if (p.getSexe()==0)
                rdee.setChecked(true);
            else
                rde.setChecked(true);

        }
    }



    public void ajouter_profil(View v){
        Integer s=0;
        if (rde.isChecked()) s=1;
        Profil profil = new Profil(0,  txtcpt.getText().toString(),
                txtpwd.getText().toString(), s);
        accesLocal.ajout(profil);
    }
}
