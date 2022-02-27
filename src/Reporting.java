import java.util.ArrayList;
import java.util.List;

public class Reporting {
    public static void highestSales() {
        int highestSaleItem = (int) Main.salesOnly.get(0);
        int size = Main.salesOnly.size();
        int actualSize = size-1;
        if (Main.salesOnly.size() == 1) {
            System.out.println("Highest recorded sale is: " + highestSaleItem);
        }
        else {
            for (int i = 0; i < actualSize; i++) {
                int nextSale = (int) Main.salesOnly.get(i + 1);
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
