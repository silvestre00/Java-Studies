public class Main {
    public static void main(String[] args){
        AccountBanking account1 = new AccountBanking("0001-01", "Silvestre");
        account1.deposit(100.00);
        account1.checkBalance();
        account1.withdrawMoney(200);
        account1.withdrawMoney(50);
        System.out.println("--------------");
        AccountBanking account2 = new AccountBanking("0001-02", "Ana");
        account2.deposit(1000.00);
        account2.checkBalance();
        account2.withdrawMoney(900);
        account2.withdrawMoney(200);
        account2.checkBalance();
        System.out.println("------Test gets-------");
        //Builder account 3
        AccountBanking account3 = new AccountBanking("0009-01", "Input Test");
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
    }
}
