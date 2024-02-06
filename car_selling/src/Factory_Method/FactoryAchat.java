package Factory_Method;

public class FactoryAchat extends FactoryCommande {
    @Override
    public Commande creerCommande() {
        return new CommandeAchat();
    }
}