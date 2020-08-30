package manufacture;

import cars.ICar;

public abstract class CarManufacture {

    public void manufactureCar(String type) {
        ICar car = createCar(type);
        car.start();
        car.accelerate();
        car.stop();
    }

    protected abstract ICar createCar(String type);
}
