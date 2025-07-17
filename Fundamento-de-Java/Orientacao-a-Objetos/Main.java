package Desafio;

public class Main {
    public static void main(String[] args){
        // Criando objeto e definindo valores
        Product product1 = new Product("Ketchup", 12, 0);
        // Chamadas
        product1.displayDetails();
        product1.setName("Ice Cream");
        System.out.println("New product name is: " + product1.getName());
        product1.setPrice(-10);
        product1.setQuantityInStock(2);
        System.out.println("Quantity in stock is: " + product1.getQuantityInStock());
        product1.addStock(3);
    }
}
