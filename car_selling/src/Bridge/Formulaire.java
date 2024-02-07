package Bridge;
// le but est de Permettre aux formulaires d'utiliser différents types de widgets sans que les deux dépendent étroitement les uns des autres.
public class Formulaire {
    void afficher();
    void saisir(String champ, String valeur);
    void soumettre();
}