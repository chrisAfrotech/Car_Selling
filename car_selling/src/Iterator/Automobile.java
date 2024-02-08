package Iterator;

public class Automobile implements Vehicule {
    private String modele;

    public Automobile(String modele) {
        this.modele = modele;
    }

    @Override
    public String getDescription() {
        return "Automobile : " + modele;
    }
}