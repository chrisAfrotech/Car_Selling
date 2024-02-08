package Decorator_Observer;

import java.util.ArrayList;
import java.util.List;

public class CatalogueVehicules implements Observateur {
    private List<Vehicule> vehicules = new ArrayList<>();

    public void ajouterVehicule(Vehicule vehicule) {
        vehicules.add(vehicule);
        vehicule.ajouterObservateur(this);
    }

    @Override
    public void actualiser() {
        afficherVehicules();
    }

    public void afficherVehicules() {
        System.out.println("Catalogue de véhicules : ");
        for (Vehicule vehicule : vehicules) {
            vehicule.afficher();
        }
    }
}
