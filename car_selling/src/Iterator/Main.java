package Iterator;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Catalogue catalogue = new Catalogue();

        catalogue.addAutomobile(new Automobile("Mercedes AMG 550"));
        catalogue.addAutomobile(new Automobile("Boko opep"));
        catalogue.addScooter(new Scooter("Boko Haram"));
        catalogue.addScooter(new Scooter("BAZAR 115"));

        String keyword = "BOKO";
        List<Vehicule> results = catalogue.search(keyword);
        System.out.println("Résultats de la recherche pour \"" + keyword + "\":");
        for (Vehicule vehicule : results) {
            System.out.println(vehicule.getDescription());
        }
    }
}