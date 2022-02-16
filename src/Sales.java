public class Sales {
    //House no, postcode, value, month and year the house was sold
    private int houseNumber;
    private String postCode;
    private int value;
    private String date;

    //constructor to store and retrieve

    public Sales(int houseNumber, String postCode, int value, String date) {
        this.houseNumber = houseNumber;
        this.postCode = postCode;
        this.value = value;
        this.date = date;
    }

    public int getHouseNumber(){
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber){
        this.houseNumber = houseNumber;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
