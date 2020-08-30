package cars;

public class AmericanVolvo implements Car {

    @Override
    public void start() {
        System.out.println("American Volvo start");
    }

    @Override
    public void accelerate() {
        System.out.println("American Volvo accelerate");
    }

    @Override
    public void stop() {
        System.out.println("American Volvo stop");
    }
}