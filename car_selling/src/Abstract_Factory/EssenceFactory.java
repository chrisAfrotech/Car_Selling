package Abstract_Factory;

public class EssenceFactory implements VehiculeFactory {
    @Override
    public Automobile createAutomobile() {
        return new EssenceAutomobile();
    }

    @Override
    public Scooter createScooter() {
        return new EssenceScooter();
    }
}