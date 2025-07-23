public class AccountBanking {
    String accountNumber;
    String cardholderName;
    double balance;
    //Builder
    public AccountBanking(String accountNumber, String cardholderName){
        this.accountNumber = accountNumber;
        this.cardholderName = cardholderName;
        balance = 0.0;
    }
    public void deposit(double value){
        if (value >= 0){
            balance += value;
            System.out.printf("The deposit in the amount of: R$%.2f was made successfully%n", value);
        }
        else {
            System.out.println("Unable to make deposit. Negative amounts are not accepted. Please try again.");
        }
    }
    public void withdrawMoney(double value){
        if (balance < value){
            System.out.printf("Withdrawal not completed. %n" +
                    "No balance available for withdrawal. %n" +
                    "Current balance: R$%.2f%n", balance);
        }
        else if (value < 0) {
            System.out.println("Withdrawal not completed.%n" +
                    "It is not possible to withdraw negative amounts. %n" +
                    "Try again with an amount greater than 0.");
        }
        else {
            balance -= value;
            System.out.printf("Withdrawal completed.%n" +
                    "Withdrawal amount:%.2f%n" +
                    "Remaining balance:%.2f%n", value, balance);
        }
    }
    public void checkBalance(){
        System.out.printf("The current balance in %s's account is" +
                " is: R$%.2f", cardholderName,balance);
    }
}
