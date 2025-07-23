package Desafio;

public class Product {
    //Attributes
    private String name;
    private double price;
    private int quantityInStock;

    // Builder
    public Product(String name, double price, int initialQuantity){
        System.out.println("Builder started!");
        this.name = name;
        this.price = price;
        this.quantityInStock = initialQuantity;
    }

    //Getters to be used in encapsulated attributes
    //Getter for name
    public String getName(){
        return this.name;
    }
    //Getter for price
    public double getPrice(){
        return this.price;
    }
    //Getter for quantityInStock
    public int getQuantityInStock(){
        return this.quantityInStock;
    }


    //Setters to be used in encapsulated attributes
    //Setter for name
    public void setName(String newName){
        this.name = newName;
    }
    //Setter for price
    public void setPrice(double newPrice){
        if (newPrice >= 0) {
            this.price = newPrice;
        }
        else {
            System.out.println("Error! The product value cannot be negative!");
        }
    }
    //Setter for quantityInStock
    public void setQuantityInStock(int newQuantityInStock){
        if (newQuantityInStock >= 0){
            this.quantityInStock = newQuantityInStock;
        }
        else {
            System.out.println("Error! The quantity in stock cannot be negative!");
        }
    }

    //Methods
    public void displayDetails(){
        System.out.printf("The product: %s, Cost: R$%.2f,and we have %d unit(s) in stock\n", name, price,quantityInStock);
    }

    public void sell(int soldQuantities){
        if (quantityInStock >= soldQuantities) {
            quantityInStock -= soldQuantities;
            System.out.printf("\n%d units of %s were sold.%d units left in stock", soldQuantities, name, quantityInStock);
        }
        else{
            System.out.printf("\nInsufficient stock to sell %d units of %s. Only %d units available.", soldQuantities, name, quantityInStock);
        }
    }

    public void addStock(int addedQuantity){
        quantityInStock += addedQuantity;
        System.out.printf("%d units of %s added. New stock: %d", addedQuantity, name, quantityInStock);
    }

}
