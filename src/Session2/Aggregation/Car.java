package Session2.Aggregation;

public class Car {

    String brend;
    Engine engine;

    public String getBrend() {
        return brend;
    }

    public void setBrend(String brend) {
        this.brend = brend;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }


    public Car(String brend, Engine engine) {
        this.brend = brend;
        this.engine = engine;
    }
}
