package Session7;

public class Scouter extends Soldier {


    public Scouter(String type, int attack, int defense, boolean armored, int cost, String weapon) {

        super("Scouter", 50, 20,false, 15, "s");
    }

    @Override
    public String sayHurray() {
        return super.sayHurray();
    }

    public void informArmy(){
        System.out.println("The enemy is closer. ");
    }
}
