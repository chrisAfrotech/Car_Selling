package Iterator;
import java.util.ArrayList;
import java.util.List;
public class IteratorAutomobile implements Iterator {
    private List<Automobile> automobiles;
    private int position = 0;

    public IteratorAutomobile(List<Automobile> automobiles) {
        this.automobiles = automobiles;
    }

    @Override
    public boolean hasNext() {
        return position < automobiles.size();
    }

    @Override
    public Vehicule next() {
        if (this.hasNext()) {
            return automobiles.get(position++);
        }
        return null;
    }
}