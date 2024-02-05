package Abstract_Factory;

public class ElectriqueFactory implements VehiculeFactory {
    @Override
    public Automobile createAutomobile() {
        return new ElectriqueAutomobile();
    }

    @Override
    public Scooter createScooter() {
        return new ElectriqueScooter();
    }
}