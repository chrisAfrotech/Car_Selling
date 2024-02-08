package Iterator;

import Abstract_Factory.Automobile;

import java.util.List;

public class IteratorAutomobile implements Iterator<Automobile> {
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
    public Automobile next() {
        if (hasNext()) {
            Automobile automobile = automobiles.get(position);
            position++;
            return automobile;
        }
        return null;
    }
}