import cars.ICar;

public class CarManufacture {

    private final SimpleCarFactory factory;

    public CarManufacture(SimpleCarFactory factory) {
        this.factory = factory;
    }

    public void manufactureCar(String type) {

        ICar car = factory.createCar(type);
        car.start();
        car.accelerate();
        car.stop();
    }
}