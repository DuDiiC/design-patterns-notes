import cars.Car;

public class CarManufacture {

    private final SimpleCarFactory factory;

    public CarManufacture(SimpleCarFactory factory) {
        this.factory = factory;
    }

    public void manufactureCar(String type) {

        Car car = factory.createCar(type);
        car.start();
        car.accelerate();
        car.stop();
    }
}