package tn.tuniprob.gestionmagasin;
import java.util.ArrayList;


public class Magasin {
    private int id;
    private String adress;
    private int capacite;;
    private ArrayList<Produit> produit ;
    private int nbr_produit;

    public Magasin(int id, String adress, int capacite , ArrayList<Produit> produit , int nbr_produit) {
        this.id = id;
        this.adress = adress;
        this.capacite = capacite;
        this.produit = new ArrayList<>();
        this.nbr_produit = 0 ;
    }

    public void ajoute(Produit produit) {
        if (nbr_produit < 50 && this.produit.size()< this.capacite) {
            this.produit.add(produit);
            nbr_produit++;
            System.out.println("done " + produit);
        } else {
            System.out.println("error " + produit);
        }
    }

    public void affiche() {
        System.out.println("id: " + id);
        System.out.println("adresse: " + adress);
        System.out.println("Capacité: " + capacite);
        System.out.println("Nombre de produits: " + nbr_produit);
        System.out.println("Produits:");
        for (Produit p : produit) {
            System.out.println(p);
        }
    }


   public int getTotalProduits(){
        return nbr_produit;
   }



}
