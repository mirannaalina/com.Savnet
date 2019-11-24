package Session3.Exceptions;

public class SuperHeroStory {

    public static void main(String[] args) {
        try {
            System.out.println("test");
            villainAppears();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static void villainAppears() throws VillainAppearsException{

        System.out.println("A villan has appeared");
        throw new VillainAppearsException();
    }
}
