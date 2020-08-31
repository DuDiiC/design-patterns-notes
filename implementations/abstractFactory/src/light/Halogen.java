package light;

public class Halogen implements ILight {

    @Override
    public void produceLight() {
        System.out.println("Producing halogen");
    }
}
