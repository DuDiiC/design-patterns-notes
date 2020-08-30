package cars;

public class EuropeanVolvo implements Car {

    @Override
    public void start() {
        System.out.println("European Volvo start");
    }

    @Override
    public void accelerate() {
        System.out.println("European Volvo accelerate");
    }

    @Override
    public void stop() {
        System.out.println("European Volvo stop");
    }
}
