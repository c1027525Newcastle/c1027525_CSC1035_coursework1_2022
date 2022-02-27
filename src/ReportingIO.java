import java.util.Scanner;

public class ReportingIO{
    public static void main(String[] args) {
        System.out.println("Choose what to do");
        Scanner s = new Scanner(System.in);
        boolean quit = false;
        while(!quit){
            System.out.println("""

                    1: Add a new sale to the record\s
                    2: Find the branch with largest  average value sale for a given year\s
                    3: Find the highest sale ever reported\s
                    4: Find all sales with value greater than a given amount\s
                    5: Exit the system\s""");
            String choice = s.nextLine();
            switch(choice){
                case "1":
                    Main.ConstructObjects();
                    break;

                case "2":
                    System.out.println("2nd");
                    // Do something
                    break;

                case "3":
                    System.out.println("3rd");
                    Reporting.highestSales();
                    break;

                case "4":
                    System.out.println("4th");
                    System.out.println("Choose the amount you want");
                    int amountChosen = s.nextInt();
                    Reporting.greaterSales(amountChosen);
                    break;

                case "5":
                    System.out.println("Quitting system");
                    quit = true;
                    break;

                default:
                    System.out.println("Not a valid choice. Choose one of the choices!");
            }
        }
    }
}