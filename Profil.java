package com.example.finalproject;


public class Profil {
    private Integer id;
    private String compte;
    private String password;
    private Integer sexe;


    public Profil(Integer id,  String compte, String
            password, Integer sexe) {
        this.id = id;

        this.compte = compte;
        this.password = password;
       this.sexe = sexe;

    }
    public Integer getId() {
        return id;
    }

    public String getCompte() {
        return compte;
    }
    public String getPassword() {
        return password;
    }
    public Integer getSexe() {
        return sexe;
    }
}