public class Sales {
    //House no, postcode, value, month and year the house was sold
    private int houseNumber;
    private String postCode;
    private int value;
    private int year;
    private String month;

    //constructor to store and retrieve

    public void SalesConstructor(int houseNumber, String postCode, int value, int year, String month) {
        this.houseNumber = houseNumber;
        this.postCode = postCode;
        this.value = value;
        this.year = year;
        this.month = month;
    }

    public int getHouseNumber(){
        return houseNumber;
    }

    public String getPostCode() {
        return postCode;
    }

    public int getValue() {
        return value;
    }

    public int getYear() {
        return year;
    }

    public String getMonth(){
        return month;
    }
}