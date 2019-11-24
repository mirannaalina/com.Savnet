package Session7;

import java.util.ArrayList;
import java.util.List;

public class Army {

    public Army(String name, List<Soldier> army) {
        this.name = name;
        this.army = army;
    }

    String name;
    List<Soldier> army =  new ArrayList<>();

    public void fight(Army army){
        System.out.println(army + " is fighting");
    }



}
