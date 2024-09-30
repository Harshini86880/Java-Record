// SavingsAccount.java
public class SavingsAccount {
    // Static variable to store the annual interest rate for all account holders
    private static double annualInterestRate;
    
    // Instance variable to store the savings balance
    private double savingsBalance;

    // Constructor to initialize the savings balance
    public SavingsAccount(double initialBalance) {
        if (initialBalance >= 0) {
            this.savingsBalance = initialBalance;
        } else {
            this.savingsBalance = 0; // Set to 0 if a negative value is provided
        }
    }

    // Method to calculate monthly interest and update the savings balance
    public void calculateMonthlyInterest() {
        double monthlyInterest = (savingsBalance * annualInterestRate) / 12;
        savingsBalance += monthlyInterest;
    }

    // Static method to modify the annual interest rate
    public static void modifyInterestRate(double newRate) {
        annualInterestRate = newRate;
    }

    // Method to get the current balance (optional)
    public double getSavingsBalance() {
        return savingsBalance;
    }
}

// SavingsAccountTest.java
public class SavingsAccountTest {
    public static void main(String[] args) {
        // Set the annual interest rate
        SavingsAccount.modifyInterestRate(0.04); // 4%

        // Create a savings account with an initial balance
        SavingsAccount account1 = new SavingsAccount(1000.00);
        
        // Calculate monthly interest and update balance
        account1.calculateMonthlyInterest();
        System.out.println("Savings Balance after interest: " + account1.getSavingsBalance());
        
        // Change the interest rate
        SavingsAccount.modifyInterestRate(0.05); // 5%

        // Create another savings account
        SavingsAccount account2 = new SavingsAccount(2000.00);
        
        // Calculate monthly interest for the second account
        account2.calculateMonthlyInterest();
        System.out.println("Savings Balance after interest: " + account2.getSavingsBalance());
    }
}
