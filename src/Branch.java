import java.util.ArrayList;
import java.util.List;

public class Branch {
    // name of local branch, list of sales that it has had
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
        System.out.println(amount);
        int actualSize = branchSalesList.size();
        for (int i = 0; i<actualSize; i++){
            int valueToBeChecked = (int) branchSalesList.get(i);
            if (valueToBeChecked > amount){
                salesListGreater.add(valueToBeChecked);
            }
        }
        return salesListGreater;
    }
    // return: The average sale value recorded by the branch in a given year
}
