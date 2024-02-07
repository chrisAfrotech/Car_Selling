package Singleton;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Obtention de l'instance unique de la liasse de documents
        Singleton.LiasseDocuments liasseDocuments = Singleton.LiasseDocuments.getInstance();

        // Création de documents vierges et ajout à la liasse
        Singleton.Document documentVierge1 = new Singleton.DocumentVierge();
        Singleton.Document documentVierge2 = new Singleton.DocumentVierge();

        liasseDocuments.ajouterDocument(documentVierge1);
        liasseDocuments.ajouterDocument(documentVierge2);

        // Récupération de la liasse de documents
        List<Document> documentsDansLiasse = liasseDocuments.getDocuments();

        // Affichage des documents dans la liasse
        System.out.println("Documents dans la liasse :");
        for (Singleton.Document document : documentsDansLiasse) {
            document.generer();
        }
    }
}
