public class SavingsAccount extends Account{
    //Child class attributes
    private double interestRate;
    //Child class constructor and Parent class constructor Account(super)
    public SavingsAccount(String accountNumber, String cardholderName, double interestRate){
        super(accountNumber, cardholderName);
        this.interestRate = interestRate;
        System.out.println("Account created successfully. \nAccount holder: "+ cardholderName +
                "\nAccount number: " + accountNumber);
    }
    //Methods
    public void earnInterest(){
        double interest = this.balance * (this.interestRate / 100);
        this.balance += interest;
        System.out.println("Interest of R$" + interest + " earned in savings.");
        checkBalance();
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
