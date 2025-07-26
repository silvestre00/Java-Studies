public class Account {
    //Attributes
    private final String accountNumber;
    private String cardholderName;
    protected double balance;

    //Builder
    public Account(String accountNumber, String cardholderName){
        this.accountNumber = accountNumber.trim();
        this.cardholderName = cardholderName.trim();
        this.balance = 0.0;
    }

    //Get
    public String getAccountNumber(){
        return this.accountNumber;
    }

    public String getCardholderName(){
        return this.cardholderName;
    }

    public double getBalance() {
        return this.balance;
    }

    //Set
    public void setCardholderName (String name){
        if (name != null && !name.isBlank()){
            this.cardholderName = name.trim();
            System.out.println("Changed the account holder name to: " + cardholderName);
        } else {
            System.out.println("Error: Holder name cannot be empty.");
        }
    }

    //Methods
    public void deposit(double value){
        if (value > 0){
            balance += value;
            System.out.printf("The deposit in the amount of: R$%.2f was made successfully%n", value);
        }
        else {
            System.out.println("Unable to make deposit. Negative amounts are not accepted. Please try again.");
        }
    }
    public void withdrawMoney(double value){
        if (this.balance > value && value > 0){
            balance -= value;
            System.out.printf("Withdrawal completed.%n" +
                    "Withdrawal amount:%.2f%n" +
                    "Remaining balance:%.2f%n", value, balance);
        }
        else {
            System.out.printf("Withdrawal not completed. %n" +
                    "No balance available for withdrawal. %n" +
                    "Current balance: R$%.2f%n", balance);
        }
    }
    public void checkBalance(){
        System.out.printf("The current balance in %s's account" +
                " is: R$%.2f%n", cardholderName,balance);
    }
}
