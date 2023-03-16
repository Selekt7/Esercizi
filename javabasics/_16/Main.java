package javabasics._16;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1: Take the code below and put it into a function, read the code and see what it is.
     * <p>
     * What do you think the function does? Name the function appropriately and make sure
     * <p>
     * return the appropriate result type
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        // Put this into a function

//        double celsius = 23;
//        double fahrenheit = ((celsius * 9) / 5) + 32;
//        String conversionDescription = celsius + " Celsius is " + fahrenheit + " fahrenheit";
        // End
        converterCelsiusToFahrenheit(20);
        //   System.out.println(conversionDescription);
    }

    //my function
    static void converterCelsiusToFahrenheit(double celsius) {
        double fahrenheit = ((celsius * 9) / 5) + 32;
        String conversionDescription = celsius + " Celsius is " + fahrenheit + " fahrenheit";
        System.out.println(conversionDescription);
    }

    /**
     * 2: Create a function that processes and prints out all the names in the ArrayList
     * <p>
     * Make sure to put all the formatting code in the function, formatting:
     * 1) to Upper case
     * 2) Remove spaces at the start and the end
     * 3) If the name contains any numbers, instead of returning the name, return "Invalid"
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        List<String> names = Arrays.asList("Alan   ", "Alice   ", "Ant0ni0   ", "  Aziz");

        for (String name : names) {
            // Call your function
            System.out.println(formatter(name));
        }
    }

    // my function
    static String formatter(String nameToFormat) {

        List<Integer> numbers = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);

        nameToFormat = nameToFormat.toUpperCase().trim();
        for (int num : numbers) {
            if (nameToFormat.contains("" + num)) {
                nameToFormat = "Invalid";
                break;
            }
        }
        return nameToFormat;
    }

    /**
     * 3: Write a function that prints out every variable seen in the code. It should not return anything
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");

        double myLunchPrice = 5.99;
        String lunchType = "sandwich";
        String description = "Nice big sandwich";
        int weightInGrams = 500;

        // Call your function
        printer(myLunchPrice, lunchType, description, weightInGrams);
    }

    //my function. I'm not sure is the right method to use, but I can't find another method.
    static void printer(double myLunchPrice, String lunchType, String description, int weightInGrams) {
        System.out.println(myLunchPrice + "\n" + lunchType + "\n" + description + "\n" + weightInGrams);
    }

}
