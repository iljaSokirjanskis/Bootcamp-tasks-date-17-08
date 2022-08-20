package Day3.Task3;

public class BankAccount {

    double balance;

    public BankAccount() {
    }

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double deposit(double amount){
        return balance += amount;
    }

    public double withdraw(double amount){
        return balance -= amount;
    }

    public void printBalance(){
        System.out.println(balance);
    }

    public static void main(String[] args) {
        BankAccount BankAccount = new BankAccount(1000);
        BankAccount.printBalance();
    }

}
