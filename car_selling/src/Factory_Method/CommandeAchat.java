package Factory_Method;

public class CommandeAchat implements Commande {
    @Override
    public void executer() {
        // commande d'achat
        System.out.println("Commande d'achat exécutée");
    }
}