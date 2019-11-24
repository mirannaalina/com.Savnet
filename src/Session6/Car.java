package Session6;

public class Car {

    private String brand;
    private String model;
    double profit;
    private int productionYear;

    public Car(String brand, String model, double profit, int productionYear) {
        this.brand = brand;
        this.model = model;
        this.profit = profit;
        this.productionYear = productionYear;

    }

    public int getProductionYear(){
        return productionYear;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getProfit() {
        return profit;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", profit=" + profit +
                '}';
    }
}
