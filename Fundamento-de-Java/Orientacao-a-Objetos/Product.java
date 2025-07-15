package Desafio;

public class Product {
    //Attributes
    String name;
    double price;
    int quantityInStock;

    //Methods
    public void displayDetails(){
        System.out.printf("\nThe product: %s, Cost: R$%f,and we have %d unit(s) in stock ", name, price,quantityInStock);
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
        System.out.printf("\n%d units of %s added. New stock: %d", addedQuantity, name, quantityInStock);
    }

}
