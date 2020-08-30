import cars.Car;

public class SimpleFactoryExample {

    public static void main(String[] args) {
        CarManufacture manufacture = new CarManufacture(new SimpleCarFactory());
        manufacture.manufactureCar("Audi");
        manufacture.manufactureCar("Ferrari");
    }
}
