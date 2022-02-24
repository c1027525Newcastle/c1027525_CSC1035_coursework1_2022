import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int number;
        String postCode;
        int value;
        int year;
        String month;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the house num");
        number = keyboard.nextInt();

        System.out.println("Enter the postcode");
        postCode = keyboard.next();

        System.out.println("Enter the value");
        value = keyboard.nextInt();

        System.out.println("Enter the year");
        year = keyboard.nextInt();

        System.out.println("Enter the month");
        month = keyboard.next();

        Sales object1 = new Sales(number, postCode, value, year, month);
        System.out.println(object1.toString());
    }
}
