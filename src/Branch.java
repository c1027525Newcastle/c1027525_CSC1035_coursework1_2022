import java.util.ArrayList;
import java.util.List;

public class Branch {
    public String name;
    static List <Sales> salesObject = new ArrayList<>();

    public Branch(String name, List salesObject) {
        this.name = name;
        this.salesObject = salesObject;
    }

    public String toStringBranch(){
        String result;
        result = "Branch name:" + name + "\n";
        salesObject.forEach((sale -> System.out.println("Details:" +sale.toStringSales())));
        return result;
    }

    public static int highestSaleRecorded(String branchChosen){
        List branchSalesList = Main.salesDictionary.get(branchChosen);
        int highestSale = (int) branchSalesList.get(0);
        int actualSize = branchSalesList.size() -1;

        for (int i = 0; i< actualSize; i++){
            int nextSale = (int) branchSalesList.get(i+1);
            if (highestSale < nextSale){
                highestSale = nextSale;
            }
        }
        return highestSale;
    }

    public static List valueGreater(String branchChosen1, int amount){
        List branchSalesList = Main.salesDictionary.get(branchChosen1);
        List salesListGreater = new ArrayList<>();
        int actualSize = branchSalesList.size();

        for (int i = 0; i<actualSize; i++){
            int valueToBeChecked = (int) branchSalesList.get(i);
            if (valueToBeChecked > amount){
                salesListGreater.add(valueToBeChecked);
            }
        }
        return salesListGreater;
    }

    public static int averageSale(String branchChosen2, int yearChosen){
        int averageSale = 0;
        int count = 0;
        List branchSalesList = Main.salesDictionaryYear.get(branchChosen2);
        List salesList = new ArrayList<>();
        int actualSize = branchSalesList.size() -1;

        // Go through the values list and see which one has the corresponding year
        for (int i = 0; i < branchSalesList.size(); i+=2){
            if ((int) branchSalesList.get(i+1) == yearChosen){
                salesList.add(branchSalesList.get(i));
            }
        }

        // Test if it stores correctly
        //System.out.println(salesList);

        // Go through the list and add everything to the averageSale and keep the count as to know how many elements there are
        for (int i = 0; i < salesList.size(); i++){
            count +=1;
            int newSale = (int) salesList.get(i);
            averageSale = averageSale + newSale;

            // To test if everything is okay
            //System.out.println("1:" + averageSale);
            //System.out.println("2:" + count);
        }

        // Make the actual average sale
        averageSale = averageSale/count;
        return averageSale;
    }
}