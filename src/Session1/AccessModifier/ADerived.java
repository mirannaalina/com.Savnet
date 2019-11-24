package Session1.AccessModifier;

public class ADerived extends Base {

    public void dosomething(){
        System.out.println(nr1);
        System.out.println(nr2);
        System.out.println(nr3);
        System.out.println();//nr4 - private access);
    }

    public static void main(String[] args) {

    }
}
