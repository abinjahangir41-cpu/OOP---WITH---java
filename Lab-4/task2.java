public class Idcard {
    private String fullName;
    private String idNumber;
    private String expirationDate;

    public Idcard(String fullName, String idNumber, String expirationDate) {
        this.fullName = fullName;
        this.idNumber = idNumber;
        this.expirationDate = expirationDate;
    }

    public void displayCardInfo() {
        System.out.println("ID Card Holder: " + fullName);
        System.out.println("ID Number: " + idNumber);
        System.out.println("Expires: " + expirationDate);
    }

    public static void main(String[] args) {
        Idcard card = new Idcard("Abid bin jahangir", "E253002", "12/31/2029");
        card.displayCardInfo();
    }
}