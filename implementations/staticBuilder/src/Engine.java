public class Engine {

    private int horsePower;
    private int productionYear;

    public Engine(int horsePower, int productionYear) {
        this.horsePower = horsePower;
        this.productionYear = productionYear;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "horsePower=" + horsePower +
                ", productionYear=" + productionYear +
                '}';
    }
}
