package Composite;

public class Main {
    public static void main(String[] args) {
        // Création de sociétés
        Societe societe1 = new SocieteSansFiliales("Societe A");
        Societe societe2 = new SocieteSansFiliales("Societe B");
        Societe societe3 = new SocieteSansFiliales("Societe C");

        // Création d'une société avec des filiales
        SocieteAvecFiliales holding = new SocieteAvecFiliales("Holding");
        holding.ajouterFiliales(societe1);
        holding.ajouterFiliales(societe2);

        // Ajout d'une filiale à une filiale existante
        SocieteAvecFiliales filiale = new SocieteAvecFiliales("Filiale");
        filiale.ajouterFiliales(societe3);
        holding.ajouterFiliales(filiale);

        // Affichage de la société avec filiales
        holding.afficher();

        // Calcul du coût total des filiales
        double coutTotal = holding.calculCout();
        System.out.println("Coût total des filiales : " + coutTotal);
    }
}
