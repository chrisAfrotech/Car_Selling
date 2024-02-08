package Iterator;

import Abstract_Factory.Scooter;

import java.util.List;

public class IteratorScooter implements Iterator<Scooter> {
    private List<Scooter> scooters;
    private int position = 0;

    public IteratorScooter(List<Scooter> scooters) {
        this.scooters = scooters;
    }

    @Override
    public boolean hasNext() {
        return position < scooters.size();
    }

    @Override
    public Scooter next() {
        if (hasNext()) {
            Scooter scooter = scooters.get(position);
            position++;
            return scooter;
        }
        return null;
    }
}