package com.example.ordercraft.GestionArticles;


public class Client {

    private String nom;
    private String adresse;
    private String numeroTel;
    private String email;

    public Client() {
    }

    public Client(String nom, String adresse, String numeroTel, String email) {
        this.nom = nom;
        this.adresse = adresse;
        this.numeroTel = numeroTel;
        this.email = email;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getNumeroTel() {
        return numeroTel;
    }

    public void setNumeroTel(String numeroTel) {
        this.numeroTel = numeroTel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nom='" + nom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", numeroTel='" + numeroTel + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
