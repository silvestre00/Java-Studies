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
    }
}
