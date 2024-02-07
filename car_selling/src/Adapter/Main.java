package Adapter;

public class Main {
    public static void main(String[] args) {
        // Création d'un document HTML
        DocumentHTML documentHTML = new DocumentHTML("<html><body><h1>Titre</h1><p>Contenu</p></body></html>");

        // Utilisation du document HTML via l'adapter
        Document documentPDFAdapter = new DocumentPDFAdapter(documentHTML);

        // Utilisation des opérations sur le document via l'adapter
        documentPDFAdapter.ouvrir();
        documentPDFAdapter.afficher();
        documentPDFAdapter.imprimer();
        documentPDFAdapter.fermer();
    }
}
