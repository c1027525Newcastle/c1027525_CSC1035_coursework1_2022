import java.util.Scanner;

public class ReportingIO{
    public static void main(String[] args) {
        System.out.println("Choose what to do");
        Scanner s = new Scanner(System.in);
        boolean quit = false;
        while(!quit){
            System.out.println("""

                    1: Add a new sale to the record\s
                    2:\s
                    3:\s
                    4: Exit the system\s""");
            String choice = s.nextLine();
            switch(choice){
                case "1":
                    Main.ConstructObjects();
                    break;

                case "2":
                    System.out.println("2nd");
                    // return data from the Branch or Sales classes
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

