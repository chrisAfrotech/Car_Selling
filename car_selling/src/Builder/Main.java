package Builder;

//    Définir une interface DocumentBuilder avec des méthodes pour la construction de chaque type de document (demande d'immatriculation, certificat de cession, bon de commande).
//    Implémenter des classes concrètes (DemandeImmatriculationBuilder, CertificatCessionBuilder, BonCommandeBuilder) pour construire les documents spécifiques.
public class Main {
    public static void main(String[] args) {
        // Utilisation du Builder pour construire des documents
        VehiculeDocumentBuilder documentBuilder = new VehiculeDocumentBuilder();

        // Construction de la demande d'immatriculation
        documentBuilder.buildDemandeImmatriculation();

        // Construction du certificat de cession
        documentBuilder.buildCertificatCession();

        // Construction du bon de commande
        documentBuilder.buildBonCommande();

        // Obtention du résultat final (ensemble de documents)
        Document ensembleDocuments = documentBuilder.getResult();
        System.out.println("Ensemble de documents Bon de commande, certification et demande d'immatriculation créé");
    }
}
