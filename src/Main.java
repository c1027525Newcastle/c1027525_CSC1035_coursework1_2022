import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void ConstructObjects() {
        int number;
        String postCode;
        int value;
        int year;
        String month;
        String branchName;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the house num as an integer");
        number = keyboard.nextInt();

        System.out.println("Enter the postcode");
        postCode = keyboard.next();

        System.out.println("Enter the price that it was sold as an integer");
        value = keyboard.nextInt();

        System.out.println("Enter the year as an integer");
        year = keyboard.nextInt();

        System.out.println("Enter the month");
        month = keyboard.next();

        // Create the object in the class and then print it to check if it's written correctly
        Sales object1 = new Sales(number, postCode, value, year, month);
        System.out.println(object1.toStringSales());

        System.out.println("Enter the name of the branch");
        branchName = keyboard.next();

        List salesList = new ArrayList<Sales>();
        salesList.add(object1);

        // Create the object in the class and then print it to check if it's written correctly
        Branch branch1 = new Branch(branchName, salesList);
        System.out.println(branch1.toStringBranch());

    }
}