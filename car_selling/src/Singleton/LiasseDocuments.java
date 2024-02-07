//import java.util.List;
package Singleton;

import java.util.List;

public class LiasseDocuments {
    private static LiasseDocuments instance;
    private List<Document> documents;

    private LiasseDocuments() {
        // Initialisation de la liasse de documents
        System.out.println("Liasse de documents créée");
    }

    // Méthode statique pour obtenir l'instance unique
    public static synchronized LiasseDocuments getInstance() {
        if (instance == null) {
            instance = new LiasseDocuments();
        }
        return instance;
    }

    // Méthode pour récupérer la liasse de documents
    public List<Document> getDocuments() {
        return documents;
    }

    // Méthode pour ajouter un document à la liasse
    public void ajouterDocument(Document document) {
        documents.add(document);
    }

    // Méthode pour retirer un document de la liasse
    public void retirerDocument(Document document) {
        documents.remove(document);
    }
}