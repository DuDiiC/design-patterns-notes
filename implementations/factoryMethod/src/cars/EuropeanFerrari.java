package cars;

public class EuropeanFerrari implements Car {

    @Override
    public void start() {
        System.out.println("European Ferrari start");
    }

    @Override
    public void accelerate() {
        System.out.println("European Ferrari accelerate");
    }

    @Override
    public void stop() {
        System.out.println("European Ferrari stop");
    }
}
