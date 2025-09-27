package tn.tuniprob.gestionmagasin;
import java.util.Date;
import java.time.LocalDate;


public class Produit {
    private int identifiant;
    private String libelle;
    private String marque;
    private double prix;
    private LocalDate dateExp;

    public Produit(int identifiant, String libelle, String marque, double prix) {
        this.identifiant = identifiant;
        this.libelle = libelle;
        this.marque = marque;
        this.prix = prix;
        this.dateExp = dateExp;
    }

    public void afficher() {
        System.out.println(this.identifiant);
        System.out.println(this.libelle);
        System.out.println(this.marque);
        System.out.println(this.prix);
        System.out.println(this.dateExp);
    }

    public void setPrix(double prix) {
        if (prix >= 0) {
            this.prix = prix;
        } else {
            System.out.println("error");
            this.prix = 0;
        }
    }

    public String toString() {
        return "identifiant=" + identifiant + ", libelle='" + libelle + '\'' + ", marque='" + marque + '\'' + ", prix=" + prix + ", dateExp=" + dateExp ;
    }

    public void setDateExp(LocalDate dateExpiration) {
        this.dateExp = dateExpiration;
    }

}
