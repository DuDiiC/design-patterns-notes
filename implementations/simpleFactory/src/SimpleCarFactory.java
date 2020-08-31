import cars.Audi;
import cars.ICar;
import cars.Ferrari;
import cars.Volvo;

public class SimpleCarFactory {

    public ICar createCar(String type) {
        if ("Audi".equals(type)) {
            return new Audi();
        } else if ("Volvo".equals(type)) {
            return new Volvo();
        } else if ("Ferrari".equals(type)) {
            return new Ferrari();
        }
        throw new IllegalArgumentException("Unknown car." + type);
    }
}
