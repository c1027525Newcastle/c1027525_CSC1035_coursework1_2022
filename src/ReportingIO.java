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
                    6: Return a list of all sales recorded by a branch with a value greater than a given amount of money\s
                    7: Return the average sale value recorded by a branch in a given year\s
                    8: Exit the system\s""");
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
                    System.out.println(Branch.highestSaleRecorded(branchChosen));
                    break;

                case "6":
                    System.out.println("Which branch do you want to look into?");
                    String branchChosen1 = s.nextLine();
                    System.out.println("What amount?");
                    int amount = s.nextInt();
                    System.out.println(Branch.valueGreater(branchChosen1, amount));
                    break;

                case "7":
                    System.out.println("Which branch do you want to look into?");
                    String branchChosen2 = s.nextLine();
                    System.out.println("What year?");
                    int yearChosen = s.nextInt();
                    System.out.println(Branch.averageSale(branchChosen2, yearChosen));
                    break;

                case "8":
                    System.out.println("Quitting system");
                    quit = true;
                    break;

                default:
                    System.out.println("Not a valid choice. Choose one of the choices!");
            }
        }
    }
}