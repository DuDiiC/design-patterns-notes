package cars;

public class Ferrari implements ICar {

    @Override
    public void start() {
        System.out.println("Ferrari start");
    }

    @Override
    public void accelerate() {
        System.out.println("Ferrari accelerate");
    }

    @Override
    public void stop() {
        System.out.println("Ferrari stop");
    }
}
