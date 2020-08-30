package cars;

public class Volvo implements Car {

    @Override
    public void start() {
        System.out.println("Volvo start");
    }

    @Override
    public void accelerate() {
        System.out.println("Volvo accelerate");
    }

    @Override
    public void stop() {
        System.out.println("Volvo stop");
    }
}
