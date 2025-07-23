package Desafio;

public class Book extends Product{
    // Specific attributes of the books class
    private String author;

    private int pageCount;

    //Subclass constructor
    public Book(String name, double price, int initialQuantity, String author, int pageCount){
        super(name, price, initialQuantity);
        this.author = author;
        this.pageCount = pageCount;
    }

    public String getAuthor() {
        return author;
    }

    public int getPageCount() {
        return pageCount;
    }

    @Override // Esta anotação indica ao compilador que estamos sobrescrevendo um método
    public void displayDetails() {
        // Primeiro, chamamos o método original da superclasse para não repetir código
        super.displayDetails();
        // Agora, adicionamos as informações específicas do livro
        System.out.printf("Author: %s, Pages: %d\n", this.author, this.pageCount);
    }
}
