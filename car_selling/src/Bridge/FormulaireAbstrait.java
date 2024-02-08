package Bridge;

public abstract class FormulaireAbstrait extends Formulaire {
    protected Widget widget;

    public FormulaireAbstrait(Widget widget) {
        this.widget = widget;
    }

    @Override
    public void afficher() {
        widget.afficher();
    }

    @Override
    public void saisir(String champ, String valeur) {
        widget.saisir(champ, valeur);
    }

    @Override
    public void soumettre() {
        widget.soumettre();
    }
}