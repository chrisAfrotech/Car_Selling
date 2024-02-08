package Template_method;

import java.util.ArrayList;
import java.util.List;
//Bien que la classe Produit ne soit pas directement utilisée dans la logique du Template Method lui-même,
// elle est importante car elle fournit une abstraction pour représenter les produits dans le contexte de la commande.

public class Main {
    public static void main(String[] args) {
        // Création de quelques produits
        Produit produit1 = new Produit("Mercedes GLC 550", 1800000);
        Produit produit2 = new Produit("Scooter YAMAHA 115", 7000000);

        // Création de la commande pour la France
        List<Produit> produitsFrance = new ArrayList<>();
        produitsFrance.add(produit1);
        CommandeTemplate commandeFrance = new CommandeFrance(produitsFrance);

        // Affichage du montant de la TVA
        double tvaFrance = commandeFrance.calculerTVA();
        System.out.println("TVA en France : " + tvaFrance + " €");

        // Affichage des frais de livraison
        double fraisLivraisonFrance = commandeFrance.calculerFraisLivraison();
        System.out.println("Frais de livraison en France : " + fraisLivraisonFrance + " €");

        // Affichage du montant total de la commande en France
        double totalFrance = commandeFrance.calculerMontant();
        System.out.println("Montant total de la commande en France : " + totalFrance + " €");

        System.out.println(); // Pour une meilleure lisibilité

        // Création de la commande pour le Cameroun
        List<Produit> produitsCameroun = new ArrayList<>();
        produitsCameroun.add(produit1);
        produitsCameroun.add(produit2);
        CommandeTemplate commandeCameroun = new CommandeCameroun(produitsCameroun);

        // Affichage du montant de la TVA
        double tvaCameroun = commandeCameroun.calculerTVA();
        System.out.println("TVA au Cameroun : " + tvaCameroun + " FCFA");

        // Affichage des frais de livraison
        double fraisLivraisonCameroun = commandeCameroun.calculerFraisLivraison();
        System.out.println("Frais de livraison au Cameroun : " + fraisLivraisonCameroun + " FCFA");

        // Affichage du montant total de la commande au Cameroun
        double totalCameroun = commandeCameroun.calculerMontant();
        System.out.println("Montant total de la commande au Cameroun : " + totalCameroun + " FCFA");
    }
}
