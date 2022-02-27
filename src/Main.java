import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;

public class Main {
    // Make a main salesList in order to store all Sales object for later use
    static List <Sales> salesList = new ArrayList<>();
    static List <Branch> branchList = new ArrayList<>();
    // Used to add all amounts to a list in order to better find the highest sale
    public static List salesOnly = new ArrayList();

    // Create a dictionary
    static Hashtable<String, List> salesDictionary = new Hashtable<>();

    public static void ConstructObjects() {
        int number;
        String postCode;
        int value;
        int year;
        String month;
        String branchName;

        // Create scanner object to allow the user to enter data
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the house num as an integer");
        number = keyboard.nextInt();

        System.out.println("Enter the postcode");
        postCode = keyboard.next();

        System.out.println("Enter the price that it was sold as an integer");
        value = keyboard.nextInt();

        // Add to the salesOnly list the 3 parameters to identify a sale better and print the list to test it's okay
        salesOnly.add(value);
        salesOnly.add(number);
        salesOnly.add(postCode);
        // System.out.println(salesOnly);

        System.out.println("Enter the year as an integer");
        year = keyboard.nextInt();

        System.out.println("Enter the month");
        month = keyboard.next();

        // Create the object in the class and then print it to check if it's written correctly
        Sales object = new Sales(number, postCode, value, year, month);
        //System.out.println(object.toStringSales());

        System.out.println("Enter the name of the branch");
        branchName = keyboard.next();

        List <Sales> salesObject = new ArrayList<>();
        salesObject.add(object);

        // Create the object in the class and then print it to check if it's written correctly
        Branch branch1 = new Branch(branchName, salesObject);
        //System.out.println(branch1.toStringBranch());

        // Appends the salesObject to the salesList and prints them out to check if everything is written correctly
        salesList.addAll(salesObject);
        //salesList.forEach((sale) -> System.out.println(sale.toStringSales()));

        // Appends the new branch1 object to the branchList and prints them out to check if it's okay
        branchList.add(branch1);
        //branchList.forEach((branch -> System.out.println(branch.toStringBranch())));

        // Create the dictionary or check if the branch already exists
        if (salesDictionary.containsKey(branchName)){
            salesDictionary.get(branchName).add(value);
            //System.out.println(salesDictionary.get(branchName));
        }
        else{
            salesDictionary.put(branchName, new ArrayList<>());
            salesDictionary.get(branchName).add(value);
        }
    }
}