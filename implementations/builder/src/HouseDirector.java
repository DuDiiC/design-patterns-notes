public class HouseDirector {

    public void constructHouse(IHouseBuilder builder) {
        builder.buildFloors();
        builder.buildWalls();
        builder.buildGarage();
    }
}
