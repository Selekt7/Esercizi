package JavaAdvanced_OOP._2.movable_things;

public class Car implements Movable{
    @Override
    public void moveForward() {
        System.out.println("I'm a car and I'm moving forward!");
    }

    @Override
    public void moveBackward() {
        System.out.println("I'm a car and I'm moving backward!");

    }
}
