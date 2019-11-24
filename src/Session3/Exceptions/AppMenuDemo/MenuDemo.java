package Session3.Exceptions.AppMenuDemo;

import java.util.Scanner;

public class MenuDemo {
    public static void main(String[] args) {
        displayMenu();
    }

    private static void displayMenu(){
        displayMainMenu();


        String option = getUserOption();

        switch (option){
            case "1":
                System.out.println("afas");
                break;
            case "2":
                System.out.println("sss");
                break;
            case "3":
                System.out.println("2323" );
                break;
            case "4":
                System.out.println("22");
                break;
            case "5" :
                System.out.println("sss");
            default:
                System.out.println("111");
        }

    }
    private static String getUserOption(){
        Scanner sc =  new Scanner(System.in);
        return sc.nextLine();
    }

    private static void displayMainMenu(){
        System.out.println("Please choose an option: ");
        System.out.println("1. Instructions");
        System.out.println("2. Change language");
        System.out.println("3. Play");
        System.out.println("4. Change Difficulty");
        System.out.println("5. Exit");



    }

}
