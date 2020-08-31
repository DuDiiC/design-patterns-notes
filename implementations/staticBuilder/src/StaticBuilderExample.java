public class StaticBuilderExample {

    public static void main(String[] args) {

        Car car = new CarBuilder()
                .addEngine(new Engine(30, 1980))
                .addFacility("GPS")
                .addFacility("radio")
                .addFacility("Wi-Fi")
                .build();

        System.out.println(car);
    }
}
