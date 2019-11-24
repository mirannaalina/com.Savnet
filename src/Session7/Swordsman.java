package Session7;

public class Swordsman extends Soldier {

    public Swordsman(String type, int attack, int defense, boolean armored, int cost) {

        super("Scouter", 50, 20,false, 15, "s");
    }

    @Override
    public String sayHurray() {
        return super.sayHurray();
    }
}
