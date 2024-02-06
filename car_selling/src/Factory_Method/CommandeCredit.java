package Factory_Method;

public class CommandeCredit implements Commande {
    @Override
    public void executer() {
        // commande de crédit
        System.out.println("Commande de crédit exécutée");
    }
}