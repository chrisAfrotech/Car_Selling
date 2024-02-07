package Adapter;

public class DocumentPDF extends DocumentPDFAdapter {

    public DocumentPDF(DocumentHTML documentHTML) {
        super(documentHTML);
    }

    @Override
    public void ouvrir() {
        System.out.println("Ouverture du document PDF");
    }

    @Override
    public void fermer() {
        System.out.println("Fermeture du document PDF");
    }

    @Override
    public void afficher() {
        super.afficher(); // Utilisation de l'affichage adapté depuis HTML
    }

    @Override
    public void imprimer() {
        System.out.println("Impression du document PDF");
    }
}
