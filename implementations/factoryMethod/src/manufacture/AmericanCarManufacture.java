package manufacture;

import cars.AmericanAudi;
import cars.AmericanFerrari;
import cars.AmericanVolvo;
import cars.Car;

public class AmericanCarManufacture extends CarManufacture {

    @Override
    protected Car createCar(String type) {
        if(type.equals("Audi")) {
            return new AmericanAudi();
        } else if(type.equals("Ferrari")) {
            return new AmericanFerrari();
        } else if(type.equals("Volvo")) {
            return new AmericanVolvo();
        } else {
            throw new IllegalArgumentException("Unknown car: " + type);
        }
    }
}
