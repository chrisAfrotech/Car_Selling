package Factory_Method;

public class FactoryCredit extends FactoryCommande {
    @Override
    public Commande creerCommande() {
        return new CommandeCredit();
    }
}