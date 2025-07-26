public class Main {
    public static void main(String[] args){
        /* Account account1 = new Account("0001-01", "Silvestre");
        account1.deposit(100.00);
        account1.checkBalance();
        account1.withdrawMoney(200);
        account1.withdrawMoney(50);
        System.out.println("--------------");
        Account account2 = new Account("0001-02", "Ana");
        account2.deposit(1000.00);
        account2.checkBalance();
        account2.withdrawMoney(900);
        account2.withdrawMoney(200);
        account2.checkBalance();
        System.out.println("------Test gets-------");
        //Builder account 3
        Account account3 = new Account("0009-01", "Input Test");
        //Get Account Banking
        String accNumber3 = account3.getAccountNumber();
        System.out.println("Account number: " + accNumber3);
        //Get Balance
        double balanceAcc3 = account3.getBalance();
        System.out.println("Balance get test, starting balance: R$" + balanceAcc3);
        account3.deposit(250);
        balanceAcc3 = account3.getBalance();
        System.out.println("Balance get test, balance after deposit: R$" + balanceAcc3);
        //Get Cardholder Name
        String nameAcc3 = account3.getCardholderName();
        System.out.println("The account holder's name before the change is: " + nameAcc3);
        System.out.println("------Test Set-------");
        account3.setCardholderName(" ");
        nameAcc3 = account3.getCardholderName();
        System.out.println("The account holder name after the change is: " + nameAcc3);
        System.out.println("------Savings Account-------");
        SavingsAccount account4 = new SavingsAccount("0002-01", "Barsi", 12);
        account4.deposit(1000);
        account4.earnInterest();
        account4.withdrawMoney(120);*/
        System.out.println("------Current Account-------");
        CurrentAccount accCurrent1 = new CurrentAccount("0001-01", "Silvestre", 1000);
        accCurrent1.deposit(200);
        accCurrent1.withdrawMoney(200);
        accCurrent1.checkBalance();
        accCurrent1.withdrawMoney(500);
        accCurrent1.checkBalance();
        accCurrent1.withdrawMoney(650);
    }
}
