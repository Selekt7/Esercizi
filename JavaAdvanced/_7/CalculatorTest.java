package JavaAdvanced._7;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    /**
     * 1:
     *
     *
     * Create JUnit test for the add() and subtract() methods in the Calculator class.
     *
     * Test the methods with multiple test cases, including positive and negative numbers, and zero.
     *
     * Verify that the methods return the correct result for each test case.
     *
     * If there is an error you may have to change the code in Calculator to fix it!
     */
    @Test
    void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
        Calculator calculator= new Calculator();
        Assertions.assertEquals(125, calculator.add(125,0));
        Assertions.assertEquals(125, calculator.add(100,25));
        Assertions.assertEquals(8, calculator.add(4,4));
        Assertions.assertEquals(10, calculator.subtract(13,3));
        Assertions.assertEquals(60, calculator.subtract(61,1));
    }

    /**
     * 2:
     *
     *
     * Create JUnit test for the multiply() and divide() methods in the Calculator class.
     *
     * Test the same kind of inputs as before as exercise 1
     *
     * If there is an error you may have to change the code in Calculator to fix it!
     *
     */
    @Test
    void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here

        Calculator calculator = new Calculator();
        Assertions.assertThrows(ArithmeticException.class,()->calculator.divide(10, 0));
        Assertions.assertEquals(600, calculator.multiply(30, 20));
        Assertions.assertEquals(0, calculator.multiply(10, 0));
        Assertions.assertEquals(0, calculator.multiply(0, 32));
        Assertions.assertEquals(15, calculator.multiply(3, 5));
        Assertions.assertEquals(5, calculator.divide(15, 3));
        Assertions.assertEquals(9, calculator.divide(72, 8));

    }

    /**
     * 3:
     *
     * Create a JUnit test for the power() method in the Calculator class that raises a number to a power.
     * Test the method with test cases where the base is zero, positive, and negative - the exponent is zero, one and negative
     * Test with decimals too!
     * Verify that the method returns the correct result for each test case.
     *
     * If there is an error you may have to change the code in Calculator to fix it!
     *
     * Don't just write tests that use the result of the program as the expected!!
     */
    @Test
    void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        Calculator calculator = new Calculator();
        Assertions.assertEquals(-8, calculator.power(-2,3));
        Assertions.assertEquals(8, calculator.power(2,3));
        Assertions.assertEquals(9, calculator.power(3,2));
        Assertions.assertEquals(1, calculator.power(345678,0));
        Assertions.assertEquals(0, calculator.power(0,36543));
        //Sinceramente non saprei in che altro modo testare una calcolatrice se non inserendo il risultato che mi aspetto dalle operazioni
    }
}