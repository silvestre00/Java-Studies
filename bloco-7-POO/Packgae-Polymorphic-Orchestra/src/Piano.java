public class Piano extends Instrument{
    public Piano(String name){
        super(name);
    }
    @Override
    public void sound(){
        System.out.println("Pliim, plim... (sound of piano keys)");
    }
}
