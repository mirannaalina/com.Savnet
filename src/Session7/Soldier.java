package Session7;

public class Soldier {

    private String type;
    private int attack;
    private int defense;
    private boolean armored;
    private int cost;
    private String weapon;
    Army army;

    public Soldier(String type, int attack, int defense, boolean armored, int cost, String weapon) {
        this.type = type;
        this.attack = attack;
        this.defense = defense;
        this.armored = armored;
        this.cost = cost;
        this.weapon = weapon;
    }

    public Soldier(){

    }



    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public boolean isArmored() {
        return armored;
    }

    public void setArmored(boolean armored) {
        this.armored = armored;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }


    public void join(Player p, Army a){
        System.out.println("Player "+ p +"is playing with army "+a);
    }

    public String sayHurray(){
        return "Hurray";
    }

    public Army getArmy(Army army){
        return army;
    }

    public void die(Soldier s){
        System.out.println("Soldier "+ s.getType()+" died.");
    }

    public void fight(Army a, Army b){
        System.out.println("Army "+a+ " is fighting with army "+ b);
    }

    public void acknowledge(){

    }
}
