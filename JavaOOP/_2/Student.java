package JavaOOP._2;

public class Student {
    String name;
    int age;

    Student(String name, int age){
        System.out.println("Constructing!");
        System.out.println("Constructed!");
        this.name=name;
        this.age=age;
    }
    Student(String name){
    this.name=name;
        System.out.println(this.name);
    }
    Student(int age){
    this.age=age;
        System.out.println(this.age);

    }
    Student(){
        System.out.println("Nothing here :(");

    }


}

