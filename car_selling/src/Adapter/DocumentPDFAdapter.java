package Adapter;

public class DocumentPDFAdapter implements Document {
    private DocumentHTML documentHTML;

    public DocumentPDFAdapter(DocumentHTML documentHTML) {
        this.documentHTML = documentHTML;
    }

    @Override
    public void ouvrir() {
        System.out.println("Ouverture du document PDF (adapté depuis HTML)");
    }

    @Override
    public void fermer() {
        System.out.println("Fermeture du document PDF (adapté depuis HTML)");
    }

    @Override
    public void afficher() {
        System.out.println("Affichage du document PDF (adapté depuis HTML) :");
        documentHTML.afficher();
    }

    @Override
    public void imprimer() {
        System.out.println("Impression du document PDF (adapté depuis HTML)");
    }
}