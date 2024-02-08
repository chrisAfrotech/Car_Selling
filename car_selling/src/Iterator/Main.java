package Iterator;

import Abstract_Factory.Automobile;
import Abstract_Factory.Scooter;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Création d'une liste d'automobiles
        List<Automobile> automobiles = new ArrayList<>();
        automobiles.add(new Automobile("Mercedes"));
        automobiles.add(new Automobile("GLC 550"));

        // Création d'un catalogue d'automobiles
        CatalogueAutomobile catalogueAutomobile = new CatalogueAutomobile(automobiles);

        // Itération sur les automobiles
        Iterator<Automobile> iteratorAutomobile = catalogueAutomobile.createIterator();
        while (iteratorAutomobile.hasNext()) {
            Automobile automobile = iteratorAutomobile.next();
            System.out.println("Automobile : " + automobile.getMarque());
        }

        // Création d'une liste de scooters
        List<Scooter> scooters = new ArrayList<>();
        boolean scooter1 = scooters.add(new Scooter("Scooter"));
        scooters.add(new Scooter("Yamaha"));

        // Création d'un catalogue de scooters
        CatalogueScooter catalogueScooter = new CatalogueScooter(scooters);

        // Itération sur les scooters
        Iterator<Scooter> iteratorScooter = catalogueScooter.createIterator();
        while (iteratorScooter.hasNext()) {
            Scooter scooter = iteratorScooter.next();
            System.out.println("Scooter : " + scooter.getMarque());
        }
    }
}
