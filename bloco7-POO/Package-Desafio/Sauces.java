package Desafio;

public class Sauces extends Product{
    private String typeSauce;
    private int grams;

    public Sauces(String name, double price, int initialQuantity, String typeSauce, int grams){
        super(name, price, initialQuantity);
        this.typeSauce = typeSauce;
        this.grams = grams;
    }

    public String getTypeSauce() {
        return typeSauce;
    }

    public int getGrams() {
        return grams;
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.printf("Type of Sauce: %s, Grams: %dg", typeSauce, grams);
    }
}
