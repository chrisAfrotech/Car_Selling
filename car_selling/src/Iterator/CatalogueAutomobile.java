package Iterator;

import Abstract_Factory.Automobile;

import java.util.List;

public class CatalogueAutomobile implements Catalogue<Automobile> {
    private List<Automobile> automobiles;

    public CatalogueAutomobile(List<Automobile> automobiles) {
        this.automobiles = automobiles;
    }

    @Override
    public Iterator<Automobile> createIterator() {
        return new IteratorAutomobile(automobiles);
    }
}