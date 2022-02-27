import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

    public static void highestSaleRecorded(){
        System.out.println("Which branch do you want to look into?");
        Scanner s = new Scanner(System.in);
        String branchChosen = s.nextLine();
        List branchSalesList = Main.salesDictionary.get(branchChosen);
        int highestSale = (int) branchSalesList.get(0);
        int actualSize = branchSalesList.size() -1;

        for (int i = 0; i< actualSize; i++){
            int nextSale = (int) branchSalesList.get(i+1);
            if (highestSale < nextSale){
                highestSale = nextSale;
            }
        }
        System.out.println(highestSale);
    }
    // return: The average sale value recorded by the branch in a given year
    // return: A list of all sales recorded by the branch with a value greater than a given amount of money
}
