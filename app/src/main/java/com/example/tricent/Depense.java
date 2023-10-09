package com.example.tricent;

import java.util.Date;

public class Depense {
    private String titre;
    private double montant;
    private Date date;
    private String personne;

    // Constructeur
    public Depense(String titre, double montant, Date date, String personne) {
        this.titre = titre;
        this.montant = montant;
        this.date = date;
        this.personne = personne;
    }

    // Getters et setters (si nécessaire)
    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }
    public Date getDate() {
        return date;
    }

    public void setMontant(Date date) {
        this.date = date;
    }
    public String getPersonne() {
        return personne;
    }

    public void setMontant(String personne) {
        this.personne = personne;
    }
}
