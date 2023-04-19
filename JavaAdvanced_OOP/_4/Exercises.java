package JavaAdvanced_OOP._4;



import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class Exercises {
    public static void main(String[] args){
        exercise1();
        exercise2();
        exercise3();
    }
    /**
     * 1:
     *
     *
     * In the main method, create a variable x as a random number between 0-100 using Math.random() * 100;
     *
     * Use a ternary operator to check if x is greater than or equal to 50. If it is, print "x is greater than or equal to 50". If it's not, print "x is less than 50".
     *
     * Experiment with different values of x and observe the output
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
        for (int i=0; i<30; i++) {
            double randomNumber = Math.random() * 100;
            String s = randomNumber >= 50 ? "The number is greater or equal than 50" : "The number is smaller then 50";
            System.out.println(s);
        }
    }

    /**
     * 2:
     *
     *
     * Create a record called "Person" with fields for name, age and address.
     *
     * Add a toString method to Person to print out the data in a different format
     *
     * Print the record to the console
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        Person person = new Person("Pippo", 26, "Via Topolinia, 15");
        person.print();
    }

    /**
     * 3:
     *
     *
     * In the main method, create a BigInteger variable with a large value.
     *
     * Create a BigDecimal variable with a large value
     *
     * Divide the BigInteger by 3 using the divide method and assign the result to a new BigInteger variable
     *
     * Divide the BigDecimal by Math.PI using the divide method and assign the result to a new BigDecimal variable
     *
     * Print the results
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        BigInteger bigInteger= new BigInteger("123456789009876543211234567890098765432112345678900987654321");
        BigDecimal bigDecimal= new BigDecimal("0.00000000000000096543000000000034500000000000654320007");
        BigInteger bigDivision= bigInteger.divide(new BigInteger("3"));
        BigDecimal otherBigDivision= bigDecimal.divide(new BigDecimal(Math.PI), RoundingMode.UP);
        System.out.println(bigDivision);
        System.out.println(otherBigDivision);
    }

}
