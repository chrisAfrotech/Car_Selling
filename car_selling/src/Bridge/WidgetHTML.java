package Bridge;

public class WidgetHTML extends Widget {
    @Override
    public void afficher() {
        System.out.println("Affichage du formulaire avec des widgets HTML");
    }

    @Override
    public void saisir(String champ, String valeur) {
        System.out.println("Saisie dans le champ HTML : " + champ + " avec la valeur : " + valeur);
    }

    @Override
    public void soumettre() {
        System.out.println("Soumission du formulaire HTML");
    }
}