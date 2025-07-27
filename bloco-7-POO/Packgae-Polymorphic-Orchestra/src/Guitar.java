public class Guitar extends Instrument{
    public Guitar(String name){
        super(name);
    }
    @Override
    public void sound(){
        System.out.println("Do, re, mi... (sound of guitar strings)");
    }
}
