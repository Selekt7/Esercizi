package JavaAdvanced_OOP._3;

import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
//        String name=this.getName();
        int age = this.getAge();
//        String address=this.address;
        if (age != 0) {
            return age;
        } else {
            return 0;
        }
    }


//    @Override
//    public int hashCode() {
//        return Objects.hash(age);
//    }

    @Override
    public boolean equals(Object person) {
        Person input = (Person) person;
        return this.age == input.age;
    }
}
