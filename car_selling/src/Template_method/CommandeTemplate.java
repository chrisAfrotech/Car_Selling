package Template_method;
import java.util.List;
public abstract class CommandeTemplate {
    protected List<Produit> produits;
    protected String pays;

    public CommandeTemplate(List<Produit> produits, String pays) {
        this.produits = produits;
        this.pays = pays;
    }

    public final double calculerMontant() {
        double prixArticles = calculerPrixArticles();
        double tva = calculerTVA();
        double fraisLivraison = calculerFraisLivraison();

        return prixArticles + tva + fraisLivraison;
    }

    protected abstract double calculerPrixArticles();

    protected abstract double calculerTVA();

    protected abstract double calculerFraisLivraison();
}
