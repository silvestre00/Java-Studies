package Desafio;

public class Eletronics extends Product{
    private String brand;
    private int voltage;

    public Eletronics (String name, double price, int initialQuantity, String brand, int voltage){
        super(name, price, initialQuantity);
        this.brand = brand;
        this.voltage = voltage;
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.printf("Brand: %s, Voltage: %dv\n", this.brand, this.voltage);
    }
}
