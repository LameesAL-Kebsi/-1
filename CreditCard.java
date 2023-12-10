//Q11
public class CreditCard {
    private double balance;
    private double creditLimit;


    public void updateCreditLimit(double newLimit) {
        if (newLimit >= 0) {
            creditLimit = newLimit;
        } else {
            System.out.println("Invalid credit limit. Please provide a non-negative value.");
        }
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public static void main(String[] args) {
        CreditCard c = new CreditCard();
        c.updateCreditLimit(5000);
        System.out.println("Credit Limit: " + c.getCreditLimit());
    }
    }



