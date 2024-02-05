package Abstract_Factory;

public class Main {
    public static void main(String[] args) {
        // Utilisation de l'Abstract Factory pour créer des véhicules
        VehiculeFactory essenceFactory = new EssenceFactory();
        VehiculeFactory electriqueFactory = new ElectriqueFactory();

        // Création d'une automobile à essence
        Automobile essenceAutomobile = essenceFactory.createAutomobile();
        System.out.println("Essence Automobile créée");

        // Création d'un scooter électrique
        Scooter electriqueScooter = electriqueFactory.createScooter();
        System.out.println("Électrique Scooter créé");
    }
}
