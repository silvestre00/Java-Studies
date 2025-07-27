public class Instrument {
    private String name;
    public Instrument(String name){
        this.name = name;
        System.out.println("Instrument " + name + "included from the orchestra!");
    }
    public void sound(){
        System.out.println("Playing an instrument sound...");
    }
}
