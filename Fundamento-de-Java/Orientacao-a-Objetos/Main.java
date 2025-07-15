package Desafio;

public class Main {
    public static void main(String[] args){
        // Criando objeto e definindo valores
        Product product1 = new Product();
        product1.name = "Ketchup";
        product1.price = 12;
        product1.quantityInStock = 0;
        // Chamadas
        product1.displayDetails();
        product1.sell(3);
        product1.addStock(6);
        product1.sell(2);

        System.out.println("\n--------------------\n");
        Product product2 = new Product();
        product2.name = "Maionese";
        product2.price = 10;
        product2.quantityInStock = 10;
        //chamadas
        product2.displayDetails();
        product2.sell(3);
        product2.addStock(4);
        product2.displayDetails();
    }
}
