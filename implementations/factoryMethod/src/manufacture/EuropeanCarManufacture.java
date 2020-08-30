package manufacture;

import cars.Car;
import cars.EuropeanAudi;
import cars.EuropeanFerrari;
import cars.EuropeanVolvo;

public class EuropeanCarManufacture extends CarManufacture {

    @Override
    protected Car createCar(String type) {
        if(type.equals("Audi")) {
            return new EuropeanAudi();
        } else if(type.equals("Ferrari")) {
            return new EuropeanFerrari();
        } else if(type.equals("Volvo")) {
            return new EuropeanVolvo();
        } else {
            throw new IllegalArgumentException("Unknown car: " + type);
        }
    }
}
