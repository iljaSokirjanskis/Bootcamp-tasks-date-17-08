package Day3.Task4;


public class BankAccountUpdate {
    private double balance;

    public BankAccountUpdate() {
    }

    public BankAccountUpdate(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 5000) {
            System.out.println("Transaction canceled. Max deposit - 5000 | Your deposit:" + amount);
        } else {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount < balance) {
            balance -= amount;
        } else {
            System.out.println("There is not enough funds.");
        }
    }

    public void printBalance() {
        System.out.println(balance);
    }

    public void transferFrom(BankAccountUpdate to, double amount) {

        if (amount > balance) {
            System.out.println("Transfer canceled. You are trying to transfer " + amount + " units, but only " + balance + " are available.");

        } else {
            balance -= amount;
            to.balance += amount;
        }
    }

    public static void main(String[] args) {
        BankAccountUpdate BankAccountUpdate = new BankAccountUpdate(1000);
        BankAccountUpdate BankAccountUpdate2 = new BankAccountUpdate(1500);

        BankAccountUpdate.printBalance();
        BankAccountUpdate2.printBalance();

        BankAccountUpdate.transferFrom(BankAccountUpdate2, 400);

        BankAccountUpdate.printBalance();
        BankAccountUpdate2.printBalance();


        //BankAccountUpdate.withdraw(1100);
        //BankAccountUpdate.deposit(6770);
        //BankAccountUpdate.printBalance();
    }
}
