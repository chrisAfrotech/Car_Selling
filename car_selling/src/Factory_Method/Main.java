package Factory_Method;

public class Main {
    public static void main(String[] args) {
        // Utilisation de la Factory Method pour créer une commande d'achat
        FactoryCommande factoryAchat = new FactoryAchat();
        Commande commandeAchat = factoryAchat.creerCommande();

        // Exécution de la commande d'achat
        commandeAchat.executer();

        // Utilisation de la Factory Method pour créer une commande de crédit
        FactoryCommande factoryCredit = new FactoryCredit();
        Commande commandeCredit = factoryCredit.creerCommande();

        // Exécution de la commande de crédit
        commandeCredit.executer();
    }
}
