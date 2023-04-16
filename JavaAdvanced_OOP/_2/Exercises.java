package JavaAdvanced_OOP._2;

import JavaAdvanced_OOP._2.geometrical_figures.Circle;
import JavaAdvanced_OOP._2.geometrical_figures.Rectangle;
import JavaAdvanced_OOP._2.movable_things.Boat;
import JavaAdvanced_OOP._2.movable_things.Car;
import JavaAdvanced_OOP._2.playble_things.Guitar;
import JavaAdvanced_OOP._2.playble_things.Piano;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }
    /**
     * 1:
     *
     * Create an abstract class called "Shape" with fields of height and width
     *
     * Create classes called "Rectangle" and "Circle" that extend the GeometricShape class and implement the calculateArea() method.
     *
     * Create instances of both and calculate their area
     *
     * To calculate the area copy the following code:  Math.PI * Math.pow((height / 2), 2)
     *
     * BONUS: Make sure the height and width values are exactly the same for Circle, change the constructor to do this
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
        Rectangle rectangle=new Rectangle(15, 34);
        Circle circle= new Circle(56);
        rectangle.calculateArea();
        circle.calculateArea();
    }

    /**
     * 2:
     *
     *
     * Create an interface class called "Movable" that has the following methods: moveForward, moveBackward
     *
     * Create classes called "Car" and "Boat" that implement the Movable Interface
     *
     * Write code below that creates instances of both the Car and Boat class and demonstrates the use of the methods from the Movable interface.
     */
    // potrei creare una classe astratta chiamata "mezziDiTrasporto" e assegnare fields come "velocita", "tipo","dimensioneInMetriCubi" e andare a modificare con i metodi dell'interaccia gli attributi delle classi.
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        Car car= new Car();
        Boat boat= new Boat();
        car.moveForward();
        car.moveBackward();
        boat.moveBackward();
        boat.moveForward();
    }

    /**
     * 3:
     *
     *
     * Create an interface called "Playable" with an abstract method called "play()".
     *
     * Create an abstract class called "Instrument" that implements the Playable interface and contains the fields "name" and "brand".
     *
     * Create classes called "Guitar" and "Piano" that extend the Instrument class and implement the play() method.
     *
     * Write code below that creates instances of both the Guitar and Piano class and demonstrates the use of the play() method.
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        Piano pianoforte = new Piano("Pianoforte", "Bechstein");
        Guitar guitar= new Guitar("Chitarra", "Yamaha");
        pianoforte.play();
        guitar.play();


    }
}
