package Adapter;

public class DocumentHTML implements Document {
    private String contenuHTML;

    public DocumentHTML(String contenuHTML) {
        this.contenuHTML = contenuHTML;
    }

    @Override
    public void ouvrir() {
        System.out.println("Ouverture du document HTML");
    }

    @Override
    public void fermer() {
        System.out.println("Fermeture du document HTML");
    }

    @Override
    public void afficher() {
        System.out.println("Affichage du document HTML :");
        System.out.println(contenuHTML);
    }

    @Override
    public void imprimer() {
        System.out.println("Impression du document HTML");
    }
}