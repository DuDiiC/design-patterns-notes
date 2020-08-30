public class SmallHouseBuilder implements IHouseBuilder {

    private final House house = new House();

    @Override
    public void buildFloors() {
        house.setFloors(1);
    }

    @Override
    public void buildWalls() {
        house.setWalls(4);
    }

    @Override
    public void buildGarage() {
        house.setGarage(false);
    }

    @Override
    public House getResult() {
        return house;
    }
}
