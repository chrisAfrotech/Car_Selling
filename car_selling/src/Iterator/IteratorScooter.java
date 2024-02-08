package Iterator;
import java.util.ArrayList;
import java.util.List;
public class IteratorScooter implements Iterator {
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
    public Vehicule next() {
        if (this.hasNext()) {
            return scooters.get(position++);
        }
        return null;
    }
}