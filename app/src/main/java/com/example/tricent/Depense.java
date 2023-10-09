package com.example.tricent;

public class Depense {
    private String titre;
    private double montant;
    private String date;
    private String personne;

    // Constructeur
    public Depense(String titre, double montant, String date, String personne) {
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
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    public String getPersonne() {
        return personne;
    }

    public void setPersonne(String personne) {
        this.personne = personne;
    }

    @Override
    public String toString() {
        return "Depense{" +
                "titre='" + titre + '\'' +
                ", montant=" + montant +
                ", date='" + date + '\'' +
                ", personne='" + personne + '\'' +
                '}';
    }
}
