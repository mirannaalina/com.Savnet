package Session7;

public class Player {

    private static final int amount=100;
    Army army;

    public Player(int amount, Army army) {
        this.army = army;
    }

    public int getAmount() {
        return amount;
    }


    public Army getArmy() {
        return army;
    }

    public void setArmy(Army army) {
        this.army = army;
    }

}
