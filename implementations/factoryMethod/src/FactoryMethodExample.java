import manufacture.AmericanCarManufacture;
import manufacture.CarManufacture;
import manufacture.EuropeanCarManufacture;

public class FactoryMethodExample {

    public static void main(String[] args) {

        CarManufacture manufacture = new EuropeanCarManufacture();
        manufacture.manufactureCar("Audi");

        manufacture = new AmericanCarManufacture();
        manufacture.manufactureCar("Ferrari");
    }
}
