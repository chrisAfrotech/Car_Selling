package Bridge;

public class WidgetWidgets extends Widget {
    @Override
    public void afficher() {
        System.out.println("Affichage du formulaire avec des widgets Widgets");
    }

    @Override
    public void saisir(String champ, String valeur) {
        System.out.println("Saisie dans le widget : " + champ + " avec la valeur : " + valeur);
    }

    @Override
    public void soumettre() {
        System.out.println("Soumission du formulaire avec des widgets Widgets");
    }
}