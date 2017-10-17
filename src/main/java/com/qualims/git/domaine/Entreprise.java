package com.qualims.git.domaine;

public class Entreprise {

    private String nom;

    public Entreprise(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Entreprise{");
        sb.append("nom='").append(nom).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
