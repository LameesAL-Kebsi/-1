public class Q12 {
    private double balance;
    private double creditLimit;


    public void processPayment(double amount) {
        if (amount > 0) {
            balance -= amount;
        } else {
            System.out.println("Invalid payment amount. Please provide a positive value.");
        }
    }
}
