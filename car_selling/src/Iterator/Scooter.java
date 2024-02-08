package Iterator;

public class Scooter implements Vehicule {
    private String modele;

    public Scooter(String modele) {
        this.modele = modele;
    }

    @Override
    public String getDescription() {
        return "Scooter : " + modele;
    }
}