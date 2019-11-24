package Session3.Exceptions;

public class VillainAppearsException extends Exception {

    private static final String joker ="Joker_has_Appeared";

    public VillainAppearsException(){
        super(joker);
    }
}
