package JavaAdvanced_OOP._4;

public record Person(String name, int age, String address) {
    public void print(){
        System.out.println("Person name: "+name+"; age: "+age+"; live in: "+address+".");
    }
}
