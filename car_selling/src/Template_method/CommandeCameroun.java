package Template_method;
import java.util.List;
public class CommandeCameroun extends CommandeTemplate {
    public CommandeCameroun(List<Produit> produits) {
        super(produits, "Cameroun");
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
        // Taux de TVA pour le Cameroun (19.25%)
        return calculerPrixArticles() * 0.1925;
    }

    @Override
    protected double calculerFraisLivraison() {
        // Frais de livraison pour le Cameroun (fixe ou variable selon les règles de votre application)
        return 15.0;
    }
}