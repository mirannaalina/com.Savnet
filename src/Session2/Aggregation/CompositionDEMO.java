package Session2.Aggregation;

public class CompositionDEMO {

    public static void main(String[] args) {

        Company c1 = new Company("Nokia");

        Company c2 = new Company("IBM",new Department("dept2"));

        Company c3 = new Company("Atos" , new Department("dept2"), new Department("dep3"));


        System.out.println(c1+" "+c2+" "+ c3);

    }
}
