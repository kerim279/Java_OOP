public class CheckingAccount extends BankAccount{
    private double overdraftLimit;

    public CheckingAccount(String accountNumber, String ownerName, int balance, double overdraftLimit){
        super(accountNumber, ownerName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public void setOverdraftLimit(Double overdraftLimit){
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit(){
        return overdraftLimit;
    }

    public void withdraw(double amount){
        double availlable = getBalance() + overdraftLimit;

        if(amount > 0 && amount <= availlable){
            super.deposit(-amount);
            System.out.println("Withdrew " + amount + ". New balance: " + getBalance());
        } else{
            System.out.println("Withdrawal failed: Amount exceeds overdraft limit.");
        }
    }

    @Override
    public String toString(){
        return super.toString() + ", Overdraft Limit: " + overdraftLimit;
    }
}
