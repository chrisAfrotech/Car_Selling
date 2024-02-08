package Bridge;

public class Main {
    public static void main(String[] args) {
        // Création de formulaires avec des widgets HTML
        Formulaire formulaireWebHTML = new FormulaireHTML(new WidgetHTML());
        formulaireWebHTML.afficher();
        formulaireWebHTML.saisir("Nom", "INF4067");
        formulaireWebHTML.saisir("Email", "inf4067@info.com");
        formulaireWebHTML.soumettre();

        System.out.println();

        // Création de formulaires avec des widgets Widgets
        Formulaire formulaireMobileWidgets = new FormulaireMobile(new WidgetWidgets());
        formulaireMobileWidgets.afficher();
        formulaireMobileWidgets.saisir("Nom", "INF4067");
        formulaireMobileWidgets.saisir("Email", "inf4067@info.com");
        formulaireMobileWidgets.soumettre();
    }
}
