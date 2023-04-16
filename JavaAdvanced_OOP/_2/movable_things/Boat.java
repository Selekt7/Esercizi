package JavaAdvanced_OOP._2.movable_things;

public class Boat implements Movable{
    @Override
    public void moveForward() {
        System.out.println("I'm a boat and I'm moving forward!");
    }

    @Override
    public void moveBackward() {
        System.out.println("I'm a boat and I'm moving backward!");
    }
}
