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
                    5: Find the highest sale recorded by a branch\s
                    6: Exit the system\s""");
            String choice = s.nextLine();
            switch(choice){
                case "1":
                    Main.ConstructObjects();
                    break;

                case "2":
                    // Do something
                    break;

                case "3":
                    Reporting.highestSales();
                    break;

                case "4":
                    System.out.println("Choose the amount you want");
                    int amountChosen = s.nextInt();
                    System.out.println(Reporting.greaterSales(amountChosen));
                    break;

                case "5":
                    System.out.println("Which branch do you want to look into?");
                    String branchChosen = s.nextLine();
                    Branch.highestSaleRecorded(branchChosen);
                    break;

                case "6":
                    System.out.println("Quitting system");
                    quit = true;
                    break;

                default:
                    System.out.println("Not a valid choice. Choose one of the choices!");
            }
        }
    }
}