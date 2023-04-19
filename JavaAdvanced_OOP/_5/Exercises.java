package JavaAdvanced_OOP._5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Exercises {

    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
    }

    private static List<Integer> ourNumbers = IntStream.range(1, 11).boxed().toList();

    /**
     * 1:
     * <p>
     * <p>
     * Use filter to select only even numbers from the list 'ourNumbers'
     * <p>
     * Use forEach to print the selected even numbers
     * <p>
     * %
     */
    public static void evenNumbersMethod(Collection<Integer> list) {
       list.stream().filter(number -> number % 2 == 0).forEach(System.out::println);
    }

    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
        evenNumbersMethod(ourNumbers);
    }

    /**
     * 2:
     * <p>
     * <p>
     * Use filter to select only odd numbers from the list 'ourNumbers'
     * <p>
     * Use the toSet() method to collect the selected odd numbers in a Set
     * <p>
     * Print the resulting Set
     */
    //prima mi creo una lista di stringhe visto che non è fornita

    public static Set<Integer>  oddNumbersMethod(List<Integer> list) {
      return list.stream().filter(number -> number % 2 == 1).collect(Collectors.toSet());
    }
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        System.out.println( oddNumbersMethod(ourNumbers));
    }

    /**
     * 3:
     * <p>
     * <p>
     * Use map to convert the strings to uppercase
     * <p>
     * Use the toSet() method to collect the resulting uppercase strings in a Set
     * <p>
     * Print the resulting Set
     * <p>
     * BONUS: do so without creating any variables!
     */
    private static Set<String> toUpperCaseMethod(List<String> list){
        return list.stream().map(stringa->stringa.toUpperCase()).collect(Collectors.toSet());
    }
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        List<String> alice = List.of("Alice", "Bob", "Charlie");
        // Your code here
        System.out.println(toUpperCaseMethod(alice));
    }

    /**
     * 4:
     * <p>
     * <p>
     * Use filter to select only even numbers from the list 'ourNumbers'
     * <p>
     * Use map to multiply the even numbers by 2
     * <p>
     * Use the toSet() method to collect the resulting numbers in a Set
     * <p>
     * Print the resulting Set
     */
    public static Set<Integer> operation(Collection<Integer> list) {
        return list.stream().filter(number -> number % 2 == 0).map(n -> n*2).collect(Collectors.toSet());
    }
    private static void exercise4() {
        System.out.println("\nExercise 4");
        //Your code here
        System.out.println(operation(ourNumbers));
    }
}
