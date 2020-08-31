package light;

public class LedLight implements ILight {

    @Override
    public void produceLight() {
        System.out.println("Producing led light");
    }
}
