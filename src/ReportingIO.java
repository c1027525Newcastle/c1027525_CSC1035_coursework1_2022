import java.util.Scanner;

public class ReportingIO{
    public static void main(String[] args) {
        System.out.println("Choose what to do");
        Scanner s = new Scanner(System.in);
        boolean quit = false;
        while(!quit){
            System.out.println("\n1: Add a new sale to the record " + "\n2: " + "\n3: " + "\nExit the system ");
            String choice = s.nextLine();
            switch(choice){
                case "1":
                    //Main.main();
                    break;
                case "2":
                    System.out.println("2nd");
                    // Do something
                    break;
                case "3":
                    System.out.println("3rd");
                    // Do something
                    break;
                case "4":
                    System.out.println("4th");
                    System.out.println("Quitting system");
                    quit = true;
                    break;
                default:
                    System.out.println("Not a valid choice. Choose one of the choices!");
            }
        }
    }
}
    //menu: enter branch data/sales data, methods to return all things from the branch, exit
    // after each task return to menu

