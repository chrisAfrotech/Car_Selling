package Decorator_Observer;

public class Main {
//    Le patron Decorator permet d'ajouter des fonctionnalités supplémentaires à un objet existant sans modifier sa structure. Dans notre cas, nous l'utilisons pour ajouter des promotions aux véhicules du catalogue.
//    Le patron Observer permet à plusieurs objets d'observer et de réagir aux changements sur un objet observé. Dans notre cas, nous utilisons ce patron pour mettre à jour automatiquement l'affichage du catalogue lorsque de nouveaux véhicules sont ajoutés ou lorsque des promotions sont appliquées.

    public static void main(String[] args) {
        // Création du catalogue de véhicules
        CatalogueVehicules catalogue = new CatalogueVehicules();

        // Création de véhicules
        Vehicule vehicule1 = new VehiculeBase("Scooter YAMAHA", 7000000);
        Vehicule vehicule2 = new VehiculeBase("Mercedes GLC 550", 24000000);

        // Ajout de véhicules au catalogue
        catalogue.ajouterVehicule(vehicule1);
        catalogue.ajouterVehicule(vehicule2);

        // Ajout de promotions à certains véhicules
        Vehicule vehiculeAvecPromotion = new VehiculePromotion(vehicule1, 0.1);
        Vehicule vehiculeAvecAutrePromotion = new VehiculePromotion(vehicule2, 0.15);
        catalogue.ajouterVehicule(vehiculeAvecPromotion);
        catalogue.ajouterVehicule(vehiculeAvecAutrePromotion);

        // Affichage du catalogue avec les véhicules et leurs promotions
        catalogue.afficherVehicules();
    }
}
