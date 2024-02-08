package Iterator;
import java.util.ArrayList;
import java.util.List;
public class Catalogue {
    private List<Automobile> automobiles = new ArrayList<>();
    private List<Scooter> scooters = new ArrayList<>();

    public void addAutomobile(Automobile automobile) {
        automobiles.add(automobile);
    }

    public void addScooter(Scooter scooter) {
        scooters.add(scooter);
    }

    public Iterator createIteratorAutomobile() {
        return new IteratorAutomobile(automobiles);
    }

    public Iterator createIteratorScooter() {
        return new IteratorScooter(scooters);
    }

    public List<Vehicule> search(String keyword) {
        List<Vehicule> results = new ArrayList<>();
        searchAutomobiles(keyword, results);
        searchScooters(keyword, results);
        return results;
    }

    private void searchAutomobiles(String keyword, List<Vehicule> results) {
        Iterator iterator = createIteratorAutomobile();
        while (iterator.hasNext()) {
            Vehicule vehicule = iterator.next();
            if (vehicule.getDescription().toLowerCase().contains(keyword.toLowerCase())) {
                results.add(vehicule);
            }
        }
    }

    private void searchScooters(String keyword, List<Vehicule> results) {
        Iterator iterator = createIteratorScooter();
        while (iterator.hasNext()) {
            Vehicule vehicule = iterator.next();
            if (vehicule.getDescription().toLowerCase().contains(keyword.toLowerCase())) {
                results.add(vehicule);
            }
        }
    }
}
