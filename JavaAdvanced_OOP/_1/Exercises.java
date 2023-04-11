package JavaAdvanced_OOP._1;

import java.util.ArrayList;
import java.util.List;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1:
     * <p>
     * <p>
     * Create a class called "Dog" that extends the Animal class.
     * <p>
     * Add a new field called "breed" to the Dog class.
     * <p>
     * Write a constructor for the Dog class that takes in a breed, height, and weight as parameters, and passes the height and weight to the superclass constructor.
     * <p>
     * Write getters and setters for the breed field.
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
        Dog paco = new Dog(70.0, 42.0, "MaremmaShepherd-Labrador");
        System.out.println(paco);
    }

    /**
     * 2:
     * <p>
     * <p>
     * Create new classes called "Fish" and "Bird" that extends the Animal class.
     * <p>
     * Add a new field called "species" to the Fish class and "wingSpan" to the Bird class.
     * <p>
     * Also create constructors, getters and setters
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        Fish nemo = new Fish(5, 0.3, "pagliaccio");
        Bird titti = new Bird(8, 0.1, 20);
        System.out.println(titti + "\n" + nemo);
    }


    /**
     * 3:
     * <p>
     * In the dog class create a method called runSpeedMetersPerSecond() that returns the Dog's Height * 2
     * In the fish class create a method called swimSpeedMetersPerSecond() that returns the Fish's Weight * 2
     * In the bird class create a method called flySpeedMetersPerSecond() that returns the Bird's Wingspan * 4
     * <p>
     * Create instances of each Animal: Dog, Fish and Bird. Fill the constructors with values of your choice
     * and print out which of the animals has the fastest movement speed in MetersPerSecond
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        List<Animal> animals = new ArrayList<>();
        Dog paco = new Dog(70.0, 42.0, "MaremmaShepherd-Labrador");
        Fish nemo = new Fish(5, 0.3, "Pagliaccio");
        Bird titti = new Bird(8, 0.1, 20);
        Bird aquila= new Bird(1, 10, 750);

        animals.add(paco);
        animals.add(nemo);
        animals.add(titti);
        animals.add(aquila);


        paco.runSpeedMetersPerSecond();
        nemo.swimSpeedMetersPerSecond();
        titti.flySpeedMetersPerSecond();
        aquila.flySpeedMetersPerSecond();

        speedController(animals);


    }

    private static void speedController(List<Animal> animals) {
        double fast = 0;
        for (Animal animal : animals) {
            fast = (Math.max(fast, animal.getSpeed()));
        }
        System.out.println(fast);
    }
}
