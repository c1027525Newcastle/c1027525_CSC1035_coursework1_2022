public class Sales {
    // Defining:House no, postcode, value, year and month the house was sold
    public int houseNumber;
    public String postCode;
    public int value;
    public int year;
    public String month;

    // Creating the constructor
    public Sales(int houseNumber, String postCode, int value, int year, String month) {
        this.houseNumber = houseNumber;
        this.postCode = postCode;
        this.value = value;
        this.year = year;
        this.month = month;
    }

    public String toStringSales(){
        String result;
        result = "\nHouse Number:" + houseNumber + "\nPostcode:" + postCode + "\nValue:" + value + "\nYear:" + year + "\nMonth:" + month;
        return result;
    }
}