// Superclass: BankAccount
class BankAccount {
    String accountNumber;
    double balance;

    // Constructor
    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void displayDetails() {
        System.out.println("Account Number: " + accountNumber + ", Balance: $" + balance);
    }
}

// Subclass: SavingsAccount
class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    void displayAccountType() {
        System.out.println("Type: Savings Account | Interest Rate: " + interestRate + "%");
    }
}

// Subclass: CheckingAccount
class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    void displayAccountType() {
        System.out.println("Type: Checking Account | Withdrawal Limit: $" + withdrawalLimit);
    }
}

// Subclass: FixedDepositAccount
class FixedDepositAccount extends BankAccount {
    int maturityPeriod;

    FixedDepositAccount(String accountNumber, double balance, int maturityPeriod) {
        super(accountNumber, balance);
        this.maturityPeriod = maturityPeriod;
    }

    void displayAccountType() {
        System.out.println("Type: Fixed Deposit Account | Maturity Period: " + maturityPeriod + " months");
    }
}


public class BankSystem {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("SA12345", 5000.00, 3.5);
        CheckingAccount ca = new CheckingAccount("CA67890", 3000.00, 1000.00);
        FixedDepositAccount fda = new FixedDepositAccount("FD54321", 10000.00, 12);

        sa.displayDetails();
        sa.displayAccountType();

        ca.displayDetails();
        ca.displayAccountType();

        fda.displayDetails();
        fda.displayAccountType();
    }
}
