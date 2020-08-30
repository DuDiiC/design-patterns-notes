package cars;

public class Audi implements Car {

    @Override
    public void start() {
        System.out.println("Audi start");
    }

    @Override
    public void accelerate() {
        System.out.println("Audi accelerate");
    }

    @Override
    public void stop() {
        System.out.println("Audi stop");
    }
}
