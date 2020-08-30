public class LargeHouseBuilder implements IHouseBuilder {

    private House house = new House();

    @Override
    public void buildFloors() {
        house.setFloors(3);
    }

    @Override
    public void buildWalls() {
        house.setWalls(10);
    }

    @Override
    public void buildGarage() {
        house.setGarage(true);
    }

    @Override
    public House getResult() {
        return house;
    }
}
