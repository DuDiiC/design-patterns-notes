package cars;

public class AmericanFerrari implements Car {

    @Override
    public void start() {
        System.out.println("American Ferrari start");
    }

    @Override
    public void accelerate() {
        System.out.println("American Ferrari accelerate");
    }

    @Override
    public void stop() {
        System.out.println("American Ferrari stop");
    }
}
