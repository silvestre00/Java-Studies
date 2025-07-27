public class Orchestra {
    public static void main(String[] args) {
        Instrument[] instruments = new Instrument[5];
        //
        instruments[0] = new Piano("Piano1");
        instruments[1] = new Piano("Piano2");
        instruments[2] = new Guitar("Guitar1");
        instruments[3] = new Guitar("Guitar2");
        instruments[4] = new Piano("Piano3");
        //
        for (Instrument ins : instruments){
            ins.sound();
        }
    }
}