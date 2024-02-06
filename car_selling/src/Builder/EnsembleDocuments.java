package Builder;

public class EnsembleDocuments implements Document {
    private Document demandeImmatriculation;
    private Document certificatCession;
    private Document bonCommande;

    public EnsembleDocuments(Document demandeImmatriculation, Document certificatCession, Document bonCommande) {
        this.demandeImmatriculation = demandeImmatriculation;
        this.certificatCession = certificatCession;
        this.bonCommande = bonCommande;
    }
}