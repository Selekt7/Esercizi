package javabasics._5;

public class Main {
    // Don't forget to use comments to clear things up if you need them!
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4Bonus();
        exercise5Bonus();
        playAroundWithModulus();
    }

    /*
            Remember the symbols you need to do maths are

            Plus = +
            Minus = -
            Multiply or times = *
            Divide = /
     */

    /**
     * 1: Create an int variable, add 1 to the value and then print it. Use the + operator
     * Then minus 1 from the same variable and print it.
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        // Write your code here
        int myNumber= 7;
        myNumber= myNumber+1;
        System.out.println(myNumber);
        myNumber=myNumber-1;
        System.out.println(myNumber);
    }

    /**
     * 2: Create a double variable, times by 2 and then print it.
     * <p>
     * Create another double variable, which is the previous variable divided by 2
     * and then print it
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        // Write your code here
        double myDouble= 3.1497;
        myDouble *=2;
        System.out.println(myDouble);
        double myDouble2= 3.1497;
        myDouble2 /= 2;
        System.out.println(myDouble2);
    }

    /**
     * 3: We are going to convert the temperature from celsius to fahrenheit
     * <p>
     * Create a double variable called celsius
     * <p>
     * Create a new variable called fahrenheit
     * <p>
     * The variable fahrenheit should be set as
     * celsius times by 1.8 plus 32
     * <p>
     * Print out celsius and fahrenheit with 2 print statements
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");
        // Write your code here
        double celsius= 22.0;
        double fahrenheit = 1.8 * celsius + 32;
        System.out.println(celsius);
        System.out.println(fahrenheit);
    }

    /**
     * 4: BONUS! This is an optional task, but it is recommended you complete it
     * ----------------------------------------------------------------------
     * Create an int called age with a starting value of 10.
     * <p>
     * Only using the '++' operator increase this value to 15
     */
    private static void exercise4Bonus() {
        System.out.println("\nExercise 4:");
        // Write your code here
        int age= 10;
        age++;
        age++;
        age++;
        age++;
        age++;

        System.out.println(age);
    }

    /**
     * 5: BONUS! This is an optional task, but it is recommended you complete it
     * ----------------------------------------------------------------------
     * Create an int called age set as 50
     * <p>
     * Using the -= operator change this value from 50 to 0 in one line of code,
     * <p>
     * Underneath create another int called secondAge set as 50
     * <p>
     * Change this value from 50 to 0 in 3 lines of code
     */
    private static void exercise5Bonus() {
        System.out.println("\nExercise 5:");
        int age=50;
        System.out.println(age);
        age -= 50;
        System.out.println(age);
        int secondAge=50;
        System.out.println(secondAge);
        secondAge -=20;
        secondAge -=20;
        secondAge -=10;
        System.out.println(secondAge);
        // Write your code here
    }

    /**
     * This is completely optional, but if you guys want to play around with
     * modulus to get a better understanding. Simply change the code below
     */
    private static void playAroundWithModulus() {
        System.out.println("\nModulus testing!:");

        int value = 468;   // <--- change this value
        int modulus = 31; // <--- and this value to see the results of modulus

        int quotient= value/modulus;
        int product=quotient*modulus;
        int modulusByCalculations= value-product;
        
        System.out.println("the value is " +value+ "\nthe modulus is " + modulus );
        System.out.println("the quotient between value and modulus is "+ quotient);
        System.out.println("the product between quotient and modulus in order to calculate the modulus is = " + product);
        System.out.println("the modulus that I found is " + modulusByCalculations);

        System.out.println("Modulus calculation, " + value + " % " + modulus +
                " = " + value % modulus);
    }

}