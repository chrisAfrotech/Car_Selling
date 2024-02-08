package Decorator_Observer;

import java.util.ArrayList;
import java.util.List;

public class VehiculeBase implements Vehicule {
    protected String description;
    protected double prix;
    protected List<Observateur> observateurs = new ArrayList<>();

    public VehiculeBase(String description, double prix) {
        this.description = description;
        this.prix = prix;
    }

    @Override
    public void afficher() {
        System.out.println("Véhicule : " + description + ", Prix : " + prix + "XAF");
    }

    @Override
    public void ajouterObservateur(Observateur observateur) {
        observateurs.add(observateur);
    }

    @Override
    public void supprimerObservateur(Observateur observateur) {
        observateurs.remove(observateur);
    }

    @Override
    public void notifierObservateurs() {
        for (Observateur observateur : observateurs) {
            observateur.actualiser();
        }
    }
    @Override
    public double getPrix() {
        return prix;
    }
}
