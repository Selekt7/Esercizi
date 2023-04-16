package JavaAdvanced._5;


import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
    }

    /**
     * 1: Uncomment the Files.createFile() line below and write a try catch block that
     * prints it's stack trace
     */

    // Ho giocato molto con questo esercizio
    private static void exercise1() {
        System.out.println("Exercise 1: ");
        // Your code here
        try {
            Files.createDirectories(Path.of("File-text"));
            Files.createFile(Path.of("File-text/Test.txt"));
            Files.writeString(Path.of("File-text/Test.txt"), "Ciao mondo.");
        } catch (FileAlreadyExistsException exception) {
            exception.printStackTrace();
            System.out.println("the file already exists!".toUpperCase());
            reader(Path.of("File-text/Test.txt"));
        } catch (Exception exception) {
            System.err.println("there is an exception!!!");
        }
    }

    private static void reader(Path path) {
        try {
            System.out.println(Files.readString(path));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 2:
     * <p>
     * Write a try-catch block that attempts to open a file
     * <p>
     * In the catch block, print a message that informs the user that the file could not be found.
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        String userInputFileName = "test-file.txt";
        try {
            Files.readString(Path.of(userInputFileName));
        } catch (Exception exception) {
            System.out.println("The file could not be found!");
        }

    }

    /**
     * 3:
     * <p>
     * Write a try-catch block that attempts to parse a string as an integer.
     * <p>
     * In the catch block, print a message that informs the user that the input was not a valid integer.
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        try {
            System.out.println(Integer.parseInt("xdfgyu"));
        } catch (Exception exception) {
            System.out.println("the input was not a valid integer");
        }

    }

    /**
     * 4:
     * <p>
     * Write a try block that around this print statement that attempts to divide 2 numbers
     * <p>
     * Create multiple catch blocks that catch different types of exceptions, such as NumberFormatException and DivideByZeroException.
     * <p>
     * In each catch block, print a message that informs the user of the specific exception that was caught and why it occurred.
     */
    private static void exercise4() {
        System.out.println("\nExercise 4: ");
        // Your code here

        int num1 = 10;
        String num2AsString = "0";
        try {
            System.out.println(num1 / Integer.parseInt(num2AsString));
            // Your catch blocks here
        } catch (NumberFormatException ex) {
            System.out.println("You can't parse text in number");
        } catch (ArithmeticException e) {
            System.out.println("Non puoi dividere per 0");
        }

    }
}
