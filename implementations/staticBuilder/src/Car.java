import java.util.ArrayList;
import java.util.List;

public class Car {

    private Engine engine;
    private List<String> facilities = new ArrayList<>();

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public List<String> getFacilities() {
        return facilities;
    }

    public void setFacilities(List<String> facilities) {
        this.facilities = facilities;
    }

    public void addFacility(String facility) {
        facilities.add(facility);
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", facilities=" + facilities +
                '}';
    }
}
