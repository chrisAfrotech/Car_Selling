package Decorator_Observer;

public interface Vehicule {
    void afficher();
    void ajouterObservateur(Observateur observateur);
    void supprimerObservateur(Observateur observateur);
    void notifierObservateurs();
    double getPrix();
}
