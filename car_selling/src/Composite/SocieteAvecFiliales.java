package Composite;

import java.util.ArrayList;
import java.util.List;

public class SocieteAvecFiliales extends Societe {
    private List<Societe> filiales = new ArrayList<>();

    public SocieteAvecFiliales(String nom) {
        super(nom);
    }

    public void ajouterFiliales(Societe filiale) {
        filiales.add(filiale);
    }

    public void supprimerFiliales(Societe filiale) {
        filiales.remove(filiale);
    }

    @Override
    public void afficher() {
        System.out.println("Société avec filiales : " + nom);
        System.out.println("Filiales : ");
        for (Societe filiale : filiales) {
            filiale.afficher();
        }
    }

    public double calculCout() {
        double coutTotal = 0;
        for (Societe filiale : filiales) {
            coutTotal += filiale.calculCout();
        }
        return coutTotal;
    }
}