package Iterator;

import Abstract_Factory.Scooter;

import java.util.List;

public class CatalogueScooter implements Catalogue<Scooter> {
    private List<Scooter> scooters;

    public CatalogueScooter(List<Scooter> scooters) {
        this.scooters = scooters;
    }

    @Override
    public Iterator<Scooter> createIterator() {
        return new IteratorScooter(scooters);
    }
}
