package tn.tuniprob.gestionmagasin;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //produit vide
        //Produit produitVide = new Produit();


        Produit lait = new Produit(1021, "Lait", "Delice", 0.0);
        Produit yaourt = new Produit(2510, "Yaourt", "Vitalait", 0.0);
        Produit tomate = new Produit(3250, "Tomate", "Sicam", 1.200);

        Magasin magasin = new Magasin(1, "charguia 2", 50, null, 0);
        magasin.ajoute(lait);
        magasin.ajoute(yaourt);
        magasin.ajoute(tomate);


        magasin.affiche();

        System.out.println(" total de produits : " + magasin.getTotalProduits());


    }
}