public class BuilderExample {

    public static void main(String[] args) {

        HouseDirector houseDirector = new HouseDirector();
        IHouseBuilder smallHouseBuilder = new SmallHouseBuilder();
        IHouseBuilder largeHouseBuilder = new LargeHouseBuilder();

        houseDirector.constructHouse(smallHouseBuilder);
        houseDirector.constructHouse(largeHouseBuilder);

        House smallHouse = smallHouseBuilder.getResult();
        House largeHouse = largeHouseBuilder.getResult();

        System.out.println(smallHouse + "\n" + largeHouse);
    }
}
