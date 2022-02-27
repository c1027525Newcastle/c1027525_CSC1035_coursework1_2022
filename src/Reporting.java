import java.util.ArrayList;
import java.util.List;

public class Reporting {
    public static void highestSales() {
        int highestSaleItem = (int) Main.salesOnly.get(0);
        int size = Main.salesOnly.size();
        int actualSize = size-3;///
        if (Main.salesOnly.size() == 3) {////
            System.out.println("Highest recorded sale is: " + highestSaleItem + "\nHouse num:" + Main.salesOnly.get(1) + "\nPostCode:" + Main.salesOnly.get(2));//////
        }
        else {
            for (int i = 0; i < actualSize; i+=3) {/////
                int nextSale = (int) Main.salesOnly.get(i + 3);////
                if (highestSaleItem < nextSale){
                    highestSaleItem = nextSale;
                }
            }
        }
        System.out.println(highestSaleItem);

        // Find the branch with largest  average value sale for a given years
        // Find all sales with value greater than a given amounts
    }
}
