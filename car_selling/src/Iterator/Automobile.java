package Iterator;

public class Automobile implements Vehicule {
    private String modele;

    public Automobile(String modele) {
        this.modele = modele;
    }

    public Automobile(String audiA1, int i) {
    }

    @Override
    public String getDescription() {
        return "Automobile : " + modele;
    }
}