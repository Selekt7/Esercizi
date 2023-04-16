package JavaAdvanced_OOP._2.playble_things;

public class Piano extends Instrument {
    public Piano(String name, String brand) {
        super(name, brand);
    }

    @Override
    public void play() {
        System.out.println("Il mio suono può essere dolce e pacato ma anche forte e prerompente!");

    }
}
