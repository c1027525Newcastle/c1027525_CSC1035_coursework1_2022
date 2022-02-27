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

    // return: The Sale with the highest value recorded by the branch
    // return: The average sale value recorded by the branch in a given year
    // return: A list of all sales recorded by the branch with a value greater than a given amount of money
}
