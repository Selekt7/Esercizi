package JavaAdvanced._6;



public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
    }

    private enum YouCanUseClassLocalEnumsLikeThis {
        THIS_CAN_ONLY_BE_ACCESSED_IN_THIS_CLASS,
        THIS_TOO
    }

    /**
     * 1:
     * <p>
     * <p>
     * Create an enum called "Days" with the values "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY".
     * <p>
     * Loop over the values with Days.values() and print them out.
     */
    private enum Days {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY

    }

    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
//        Days first = Days.MONDAY;
//        Days second= Days.TUESDAY;
//        Days third= Days.WEDNESDAY;
//        Days fourth= Days.THURSDAY;
//        Days fifth= Days.FRIDAY;
//        Days sixth= Days.SATURDAY;
//        Days seventh= Days.SUNDAY;
//        System.out.println(first+" "+second+" "+third+" "+Days.MONDAY+" "+fourth +" "+fifth+" "+sixth+" "+seventh);
//        System.out.println(Days.MONDAY+" "+Days.SATURDAY);
//
//        System.out.println(Arrays.toString(Days.values()));
//        int lengthDays= Days.values().length;
//        Days[] newWeek= Days.values(); //useless
//        System.out.println(lengthDays);

        for (Days i : Days.values()) {
            System.out.println(i);
        }
    }

    /**
     * 2:
     * <p>
     * <p>
     * Create an enum called "Seasons" with the values "SPRING", "SUMMER", "FALL", "WINTER".
     * <p>
     * Write a method that takes a Seasons value as input and returns the corresponding date range of months in that season.
     */
    private enum Season {
        SPRING,
        SUMMER,
        FALL,
        WINTER
    }

    private static void seasonDate(Season season) {
        switch (season) {
            case SPRING -> System.out.println("21 MARZO -> 21 GIUGNO");
            case SUMMER -> System.out.println("22 GIUGNO -> 22 SETTEMBRE");
            case WINTER -> System.out.println("22 DICEMBRE ->20 MARZO");
            case FALL -> System.out.println("23 SETTEMBRE -> 21 DICEMBRE");
        }
    }

    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        seasonDate(Season.SPRING);
        seasonDate(Season.SUMMER);
        seasonDate(Season.WINTER);
        seasonDate(Season.FALL);
    }

    /**
     * 3:
     * <p>
     * <p>
     * Create an enum called "TrafficLight" with the values "RED", "YELLOW", "GREEN".
     * <p>
     * Write code that simulates the behavior of a traffic light. It should take the current state of the traffic light as input and return the next state.
     */
    private enum TrafficLight {
        RED,
        YELLOW,
        GREEN
    }

    private static TrafficLight semaforo(TrafficLight state) {
        TrafficLight actualColor = null;
        if (state.equals(TrafficLight.RED)) {
            actualColor = TrafficLight.GREEN;
        } else if (state.equals(TrafficLight.GREEN)) {
            actualColor = TrafficLight.YELLOW;
        } else if (state.equals(TrafficLight.YELLOW)) {
            actualColor = TrafficLight.RED;
        }
        return actualColor;
    }

    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        System.out.println(semaforo(TrafficLight.RED));

    }

    /**
     * 4:
     * <p>
     * Given the Days enum from exercise 1, add a local field called isWeekend and set it to true for the weekend days and false for the weekdays.
     * <p>
     * Write an if statement that prints weekend or weekday based on the enum
     */
    private enum Days2 {
        MONDAY(false),
        TUESDAY(false),
        WEDNESDAY(false),
        THURSDAY(false),
        FRIDAY(true),
        SATURDAY(true),
        SUNDAY(true);
        private final boolean isWeekend;

        Days2(boolean isWeekend) {
            this.isWeekend = isWeekend;
        }
    }

    // Faccio tutte void perché voglio stampale nel terminale. quindi invece di ritornare il boolean, in questo caso, lo stampo
    private static void isWeekendDay(Days2 day) {
        if (day.isWeekend) {
            System.out.println("Is weekend day today!");
        } else {
            System.out.println("Is not weekend day.. You have to work :( ");
        }
    }

    private static void exercise4() {
        System.out.println("\nExercise 4: ");
        // Your code here
        isWeekendDay(Days2.MONDAY);
    }

    /**
     * 5:
     * <p>
     * <p>
     * Create an enum called "Operator" with the values "ADD", "SUBTRACT", "MULTIPLY", "DIVIDE".
     * <p>
     * Write a method that takes two integers and an Operator value as input, performs the corresponding operation on the integers, and returns the result.
     */
    private enum Operator {
        ADD,
        SUBTRACT,
        MULTIPLY,
        DIVIDE
    }

    private static void calculator(double num1, double num2, Operator operator) {
        double total = 0;
        switch (operator) {
            case ADD -> total = num1 + num2;
            case DIVIDE -> total = num1 / num2;
            case MULTIPLY -> total = num1 * num2;
            case SUBTRACT -> total = num1 - num2;
        }
        System.out.println(total);
    }

    private static void exercise5() {
        System.out.println("\nExercise 5: ");
        // Your code here

        double num1 = 5;
        double num2 = 2;
        calculator(num1, num2, Operator.DIVIDE);
    }

}
