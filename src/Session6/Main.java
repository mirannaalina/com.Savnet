package Session6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Set<Car> carSet =  new HashSet<>();

        carSet.add(new Car("BMW","x5",1000,2020));
        carSet.add(new Car("Porsche","Panamera",1000,2000));
        carSet.add(new Car("Audi","a7",1000,2001));
        carSet.add(new Car("Dacia","Logan",1000,2000));

        for(Car c : carSet){
            if(c.getBrand().equals("BMW")){
                System.out.println("Yes there is sold");
                break;
            }else
            {
                System.out.println("Not found");
            }
        }


    }

    private static void splitByProdYear(Set<Car> carSales){

        List<Integer> prodyear = new ArrayList<>();

        carSales.forEach(c -> prodyear.add(c.getProductionYear()));

        //prodyear.forEach(prodyears -> carSales.stream().filter(r ->{return r.getProductionYear()==prodyear;})).collect(Collectors.toList());

    }
}
