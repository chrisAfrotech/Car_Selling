package Builder;

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
