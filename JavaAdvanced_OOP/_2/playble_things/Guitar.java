package JavaAdvanced_OOP._2.playble_things;

public class Guitar extends  Instrument {
    public Guitar(String name, String brand) {
        super(name, brand);
    }

    @Override
    public void play() {
        System.out.println("Let's do some ROCK&ROLL!!");

    }
}
