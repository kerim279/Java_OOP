public class SavingsAccount extends BankAccount{
    private double interesRate;

    public SavingsAccount(String accountNumber, String ownerName, int balance, double interestRate){
        super(accountNumber, ownerName, balance);
        this.interesRate = interestRate;
    }

    public void applyInterest(){
        double interest = getBalance() * interesRate;
        deposit(interest);
        System.out.println("Interest applied: " + interest);

    }

    public void setInteresRate(double interesRate){
        this.interesRate = interesRate;
    }

    public double getInteresRate(){
        return interesRate;
    }

    @Override
    public  String toString(){
        return super.toString() + ", Interest Rate: " + interesRate;
    }
}
