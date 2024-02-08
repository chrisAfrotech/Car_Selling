package Template_method;

//la classe Produit est utilisée pour représenter les différents produits inclus dans une commande.
public class Produit {
    private String nom;
    private double prix;

    public Produit(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
    }

    public double getPrix() {
        return prix;
    }
}
