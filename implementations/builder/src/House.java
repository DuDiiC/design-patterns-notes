public class House {

    private int floors;
    private int walls;
    private boolean garage;

    public House() {
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public void setWalls(int walls) {
        this.walls = walls;
    }

    public void setGarage(boolean garage) {
        this.garage = garage;
    }

    @Override
    public String toString() {
        return "House{" +
                "floors=" + floors +
                ", walls=" + walls +
                ", garage=" + garage +
                '}';
    }
}
