package JavaOOP._3;

import JavaOOP._3.Student;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
    }

    /**
     * 1: Copy over the student class
     *
     *    Make sure there are 5 fields inside, if they are not simply create some more.
     *    make every field private first.
     *
     *    Then create getters and setters for each of these 5 fields.
     *
     *    Once ready use all 5 below
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");

        // Write and use your 5 getters and setters!
        Student student = new Student();
        student.setName("Mario");
        student.setAge(25);
        student.setIsOffSite(true);
        student.setVoteInDecimal(10);
        student.setFavoriteSubject("Math");
        System.out.println(student);
        System.out.println(student.getAge());
        System.out.println(student.isOffSite());
        System.out.println(student.getVoteInDecimal());
        System.out.println(student.getFavoriteSubject());
    }

    /**
     * 2: Create 3 setter constraints for the student class
     *
     *    Think about what reasonably constraints are?
     *
     *    Should a student be able to be a negative age?
     *
     *    Create a counter for one of the getters, try to think about
     *    what other code could be inside a getter? Why not write it?
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        Student student = new Student();
        student.setVoteInDecimal(10);
        student.setVoteInDecimal(7);
        student.setVoteInDecimal(2);
        student.getVoteRegister();
        student.setIsOffSite(true);
        student.setIsOffSite(false);
        student.setIsOffSite(true);
        System.out.println("the counter is: "+Student.getCounterChangeSite());

        //Write your code here

      
    }

}
