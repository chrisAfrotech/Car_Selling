package Decorator_Observer;

public class VehiculePromotion implements Vehicule {
    protected Vehicule vehicule;
    protected double prix;
    protected double tauxPromotion;

    public VehiculePromotion(Vehicule vehicule, double tauxPromotion) {
        this.vehicule = vehicule;
        this.tauxPromotion = tauxPromotion;
    }

    @Override
    public void afficher() {
        vehicule.afficher();
        System.out.println("Prix après promotion : " + (vehicule.getPrix() * (1 - tauxPromotion)) + "XAF");
    }

    @Override
    public void ajouterObservateur(Observateur observateur) {
        vehicule.ajouterObservateur(observateur);
    }

    @Override
    public void supprimerObservateur(Observateur observateur) {
        vehicule.supprimerObservateur(observateur);
    }

    @Override
    public void notifierObservateurs() {
        vehicule.notifierObservateurs();
    }
    public double getPrix() {

        return  (vehicule.getPrix() * (1 - tauxPromotion));
    }
}