public class CarBuilder {

    private Car car = new Car();

    public CarBuilder addEngine(Engine engine) {
        if(car.getEngine() != null) {
            throw new IllegalStateException("Engine already added!");
        }
        car.setEngine(engine);
        return this;
    }

    public CarBuilder addFacility(String facility) {
        car.addFacility(facility);
        return this;
    }

    public Car build() {
        if(car.getEngine() == null) {
            throw new IllegalStateException("Car must have an engine!");
        }
        return car;
    }
}
