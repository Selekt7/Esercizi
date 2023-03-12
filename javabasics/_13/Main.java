package javabasics._13;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1: Add 8 random integers to the array list
     * <p>
     * Print out the first item
     * <p>
     * Remove the first 3 items
     * <p>
     * Then print out the first remaining item
     */
    public static void exercise1() {
        System.out.println("Exercise 1:");
        ArrayList<Integer> numbers = new ArrayList<>();

        //Write your code here
        numbers.add(2);
        numbers.add(3);
        numbers.add(5);
        numbers.add(7);
        numbers.add(11);
        numbers.add(13);
        numbers.add(17);
        numbers.add(19);
        System.out.println(numbers.get(0));
        numbers.remove(0);
        numbers.remove(0);
        numbers.remove(0);
        System.out.println(numbers.get(0));
    }

    /**
     * 2: Create 2 Array Lists,
     * <p>
     * A list of strings called 'menuItems'
     * <p>
     * And a list of Doubles called 'menuPrices'
     * <p>
     * The indexes of these two lists correspond to eachother
     * <p>
     * Create a print statement to output the name and price of each
     * menu item correspond
     */
    public static void exercise2() {
        System.out.println("\nExercise 1:");
        //Write your code here
        ArrayList<String> menuItems = new ArrayList<String>(3);
        ArrayList<Double> menuPrices = new ArrayList<Double>(3);
        menuItems.add("Pizza");
        menuItems.add("Pasta");
        menuItems.add("Fries");
        menuPrices.add(9.50);
        menuPrices.add(8.99);
        menuPrices.add(1.99);
        System.out.println("The price of the "+ menuItems.get(0)+" is "+menuPrices.get(0));
        System.out.println("The price of the "+ menuItems.get(1)+" is "+menuPrices.get(1));
        System.out.println("The price of the "+ menuItems.get(2)+" is "+menuPrices.get(2));
        /*
        Maybe better like below. I know we didn't study the for loop yet,
        but I search on Google the syntax differences. I think the logic behind is equals.
         */
        int i=0;
        for ( i=0; i<3; i++){
            System.out.println("The price of the "+ menuItems.get(i)+" is "+menuPrices.get(i));
        }
    }

    /**
     * 3: I changed this to an int array after recording!
     * <p>
     * You'll still need to find the total but using [index] instead of .get(index)
     * <p>
     * Find the total sum of all items in the ArrayList below.
     * <p>
     * Use the + operator
     * <p>
     * print the total
     */
    public static void exercise3() {
        System.out.println("\nExercise 3:");
        int[] items = new int[]{5, 10404, -234348, -53, 9, 91, 92, 34534, 12334, 1435};

        //Write your code here
        double total= items[0]+items[1]+items[2]+items[3]+items[4]+items[5]+items[6]+items[7]+items[8]+items[9];
        //maybe better with for loop. I don't know if there are some methods to do it better and faster.

        System.out.println(total);


    }
}
