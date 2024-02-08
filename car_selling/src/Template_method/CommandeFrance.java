package Template_method;
import java.util.List;
public class CommandeFrance extends CommandeTemplate {
    public CommandeFrance(List<Produit> produits) {
        super(produits, "France");
    }

    @Override
    protected double calculerPrixArticles() {
        double total = 0;
        for (Produit produit : produits) {
            total += produit.getPrix();
        }
        return total;
    }

    @Override
    protected double calculerTVA() {
        // Taux de TVA pour la France (20%)
        return calculerPrixArticles() * 0.20;
    }

    @Override
    protected double calculerFraisLivraison() {
        // Frais de livraison pour la France (fixe ou variable selon les règles de votre application)
        return 10.0;
    }
}