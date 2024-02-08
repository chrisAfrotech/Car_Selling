package Composite;

public abstract class Societe {
    protected String nom;

    public Societe(String nom) {
        this.nom = nom;
    }

    public abstract void afficher();

    // Méthode abstraite pour calculer le coût
    public abstract double calculCout();

    public void addFiliale(Societe fille1) {
    }

    public boolean getDescription() {
        return false;
    }
}

