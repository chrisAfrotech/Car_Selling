package Builder;

public class VehiculeDocumentBuilder implements DocumentBuilder {
    private Document demandeImmatriculation;
    private Document certificatCession;
    private Document bonCommande;

    @Override
    public void buildDemandeImmatriculation() {
        // Construction de la demande d'immatriculation
        demandeImmatriculation = new DemandeImmatriculation();
    }

    @Override
    public void buildCertificatCession() {
        //Construction du certificat de cession
        certificatCession = new CertificatCession();
    }

    @Override
    public void buildBonCommande() {
        // Construction du bon de commande
        bonCommande = new BonCommande();
    }

    public Document getResult() {
        // Retourner ensemble de documents
        return new EnsembleDocuments(demandeImmatriculation, certificatCession, bonCommande);
    }
}