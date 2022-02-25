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
        String result = "";
        result = "\nBranch name: " + name;
        salesObject.forEach((sale -> System.out.println("Details: " +sale.toStringSales())));
        return result;
    }

    // return: the sale with the highest value, the average sale value recorded by the branch in a given year,
    // return:a list of all sales with a value greater than a given amount of money
}
