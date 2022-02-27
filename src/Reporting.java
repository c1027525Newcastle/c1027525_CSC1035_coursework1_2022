import java.util.ArrayList;
import java.util.List;

public class Reporting {
    public static void highestSales() {
        int highestSaleItem = (int) Main.salesOnly.get(0);
        int size = Main.salesOnly.size();
        int actualSize = size-3;

        if (Main.salesOnly.size() == 3) {
            System.out.println("Highest recorded sale is: " + highestSaleItem + "\nHouse num:" + Main.salesOnly.get(1) + "\nPostCode:" + Main.salesOnly.get(2));
        }
        else {
            for (int i = 0; i < actualSize; i+=3) {
                int nextSale = (int) Main.salesOnly.get(i + 3);
                if (highestSaleItem < nextSale){
                    highestSaleItem = nextSale;
                }
            }
        }
        System.out.println(highestSaleItem);
    }

    public static List greaterSales(int amountChosen){
        int size = Main.salesOnly.size();
        int actualSize = size-2;
        List salesGreater = new ArrayList();

        for (int i = 0; i < actualSize; i+=3){
            // check
            //System.out.println(i);
            if ((int) Main.salesOnly.get(i) > amountChosen){
                salesGreater.add(Main.salesOnly.get(i));
            }
        }
        return salesGreater;
    }
    // Find the branch with the largest average value sale for a given years
}