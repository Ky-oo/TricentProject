package com.example.tricent;

public class Projet {

    private String nom;
    private String description;
    private double sommeTotalProvisoire;
    private double sommeActuel;
    private Categorie categorie;

    public Projet(String nom, String description, Categorie categorie) {
        this.nom = nom;
        this.description = description;
        this.categorie = categorie;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getSommeTotalProvisoire() {
        return sommeTotalProvisoire;
    }

    public void setSommeTotalProvisoire(double sommeTotalProvisoire) {
        this.sommeTotalProvisoire = sommeTotalProvisoire;
    }

    public double getSommeActuel() {
        return sommeActuel;
    }

    public void setSommeActuel(double sommeActuel) {
        this.sommeActuel = sommeActuel;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    @Override
    public String toString() {
        return "Projet{" +
                "nom='" + nom + '\'' +
                ", description='" + description + '\''+
                '}';
    }
}
