public class CurrentAccount extends Account{
    private double specialCheckLimit;
    private double specialCheckAvailableLimit;

    public CurrentAccount(String accountNumber, String cardholderName, double specialCheckLimit){
        super(accountNumber, cardholderName);
        this.specialCheckLimit = specialCheckLimit;
    }
    //Get
    public double getSpecialCheckLimit() {
        return specialCheckLimit;
    }
    //Set
    public void setSpecialCheckLimit(double specialCheckLimit) {
        this.specialCheckLimit = specialCheckLimit;
    }

    @Override
    public void withdrawMoney(double value) {
        if (value > 0 && (this.balance + this.specialCheckLimit) >= value){
            if(value > this.balance){
                balance -= value;
                System.out.println("Withdrawal of R$" + value + "made (using special check).");
            }
            else{
                balance -= value;
                System.out.printf("Withdrawal completed.%n" +
                        "Withdrawal amount:%.2f%n" +
                        "Remaining balance:%.2f%n", value, balance);
            }
        }
        else {
            System.out.println("Withdrawal not made. Insufficient limit.");
        }
    }

    @Override
    public void checkBalance() {
        if (balance < 0){
            super.checkBalance();
        }
        super.checkBalance();

    }
}
