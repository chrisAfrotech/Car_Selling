import Composite.Societe;
import Composite.SocieteSansFiliales;
import Iterator.Automobile;
import Iterator.Catalogue;
import Iterator.Scooter;
import Iterator.Vehicule;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Création du catalogue
        Catalogue catalogue = createCatalogue();

        // Création des sociétés clientes
        Societe mere = new Societe("Mère") {
            @Override
            public void afficher() {

            }

            @Override
            public double calculCout() {
                return 0;
            }
        };
        Societe fille1 = new SocieteSansFiliales("Fille 1");
        Societe fille2 = new SocieteSansFiliales("Fille 2");
        mere.addFiliale(fille1);
        mere.addFiliale(fille2);

        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        while (choice != 0) {
            System.out.println("Choisissez une option :");
            System.out.println("1. Créer une commande");
            System.out.println("2. Générer des liasses de documents");
            System.out.println("3. Représenter les sociétés clientes");
            System.out.println("4. Afficher les véhicules du catalogue");
            System.out.println("5. Rechercher un véhicule");
            System.out.println("6. Calculer le montant d'une commande");
            System.out.println("0. Quitter");

            choice = scanner.nextInt();
            scanner.nextLine(); // Pour consommer la ligne vide

            switch (choice) {
                case 1:
                    createCommande();
                    break;
                case 2:
                    genererLiassesDocuments();
                    break;
                case 3:
                    representSocietes(mere);
                    break;
                case 4:
                    displayCatalogue(catalogue);
                    break;
                case 5:
                    searchVehicule(catalogue);
                    break;
                case 6:
                    calculateMontant();
                    break;
                case 0:
                    System.out.println("Merci d'avoir utilisé notre système. À bientôt !");
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez choisir à nouveau.");
            }
        }
    }

    private static Catalogue createCatalogue() {
        Catalogue catalogue = new Catalogue();
        catalogue.addVehicule(new Automobile("Mercedes", 25000));
        catalogue.addVehicule(new Automobile("Audi", 60000));
        catalogue.addVehicule(new Scooter("Vespa LX", 3000));
        catalogue.addVehicule(new Scooter("Honda PCX", 4000));
        return catalogue;
    }

    private static void createCommande() {
        // Implémentation de la création de commande
        System.out.println("Commande créée avec succès !");
    }

    private static void genererLiassesDocuments() {
        // Implémentation de la génération de liasses de documents
        System.out.println("Liasses de documents générées avec succès !");
    }

    private static void representSocietes(Societe societe) {
        // Affichage des sociétés clientes
        System.out.println("Sociétés clientes :");
        System.out.println(societe.getDescription());
    }

    private static void displayCatalogue(Catalogue catalogue) {
        // Affichage des véhicules du catalogue
        System.out.println("Véhicules disponibles :");
        catalogue.display();
    }

    private static void searchVehicule(Catalogue catalogue) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le nom du véhicule à rechercher :");
        String nom = scanner.nextLine();
        Vehicule vehicule = catalogue.getVehicule(nom);
        if (vehicule != null) {
            System.out.println("Véhicule trouvé :");
            System.out.println(vehicule);
        } else {
            System.out.println("Véhicule non trouvé !");
        }
    }

    private static void calculateMontant() {
        // Implémentation du calcul du montant d'une commande
        System.out.println("Calcul du montant de la commande...");
    }
}
