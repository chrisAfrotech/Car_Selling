package Composite;

public class SocieteSansFiliales extends Societe {
    public SocieteSansFiliales(String nom) {
        super(nom);
    }

    @Override
    public void afficher() {
        System.out.println("Société sans filiales : " + nom);
    }

    @Override
    public double calculCout() {
        return 0;
    }
}