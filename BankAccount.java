public class BankAccount {
    private String accountNumber;
    private String ownerName;
    private double balance;

    public BankAccount(String accountNumber, String ownerName, double balance){
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public void setOwnerName(String ownerName){
        this.ownerName = ownerName;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public String getOwnerName(){
        return ownerName;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        balance += amount;
    }

    @Override
    public String toString(){
        return "BankAccount: [Account Number: " + accountNumber + ", Owner: " + ownerName + ", Balance: " + balance + "]";
    }

    public void withdraw(double amount){
        if(amount > 0){
            balance -= amount;
        } else {
            System.out.println("There is no enough funds!");
        }
    }

    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("654321", "Muradif", 30000, 0.05);
        System.out.println("Savings Account Before Interest: " + savings);

        savings.applyInterest();
        System.out.println("Savings Account After Interest: " + savings);

        CheckingAccount acc = new CheckingAccount("987654", "Ibrahim", 25000, 5000);
        System.out.println("Checking Account After Withdrawal: " + acc);

        acc.withdraw(10000.0);
        System.out.println("Checking Account After Withdrawal: " + acc);

        acc.withdraw(35000.0);

        System.out.println("/nAll Accounts: ");
        System.out.println(savings);
        System.out.println(acc);
    }
}
