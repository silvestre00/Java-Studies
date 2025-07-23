package Desafio;

public class Main {
    public static void main(String[] args){
        Product productGeneric = new Product("Pen", 2.0, 100);

        System.out.println("---Generic Product Details---");
        productGeneric.displayDetails();

        System.out.println("\n--- Book details ---");
        Book book1 = new Book("O Senhor dos Anéis", 80.0, 10, "J.R.R. Tolkien", 1200);
        book1.displayDetails();
        book1.sell(3);

        System.out.println("\n--- Electronic Details ---");
        Eletronics eletronic1 = new Eletronics("Computer", 2500, 10, "Positivo", 220);
        eletronic1.displayDetails();

        System.out.println("\n--- Sauces Details ---");
        Sauces sauce1 = new Sauces("Ketchup", 1.50, 100, "Picante", 50);
        sauce1.displayDetails();
    }
}
