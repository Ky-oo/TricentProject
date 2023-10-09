package com.example.tricent;

import java.util.ArrayList;

public class Projet {

    private String nom;
    private String description;

    private String devise;
    private double sommeTotalProvisoire;
    private double sommeActuel;
    private Categorie categorie;

    private ArrayList<User> userList;

    public Projet(String nom, String description, Categorie categorie, String devise) {
        this.nom = nom;
        this.description = description;
        this.categorie = categorie;
        this.devise = devise;
        this.userList = new ArrayList<User>();
    }

    public ArrayList<User> getUserList() {
        return userList;
    }

    public void addUserList(User user){
        this.userList.add(user);
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
        String phrase =  "Projet{" +
                "nom='" + nom + '\'' +
                ", description='" + description + '\'' +
                ", devise='" + devise + '\'' +
                ", sommeTotalProvisoire=" + sommeTotalProvisoire +
                ", sommeActuel=" + sommeActuel +
                ", categorie=" + categorie +
                ", userList=" + userList;

        for (User user:userList) {
            phrase += ", user=" + user.toString();
        }
        return phrase;
    }
}
