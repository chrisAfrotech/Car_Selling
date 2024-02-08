package Bridge;
// le but est de Permettre aux formulaires d'utiliser différents types de widgets sans que les deux dépendent étroitement les uns des autres.
public abstract class Formulaire {
    abstract void afficher();
    abstract void saisir(String champ, String valeur);
    abstract void soumettre();
}