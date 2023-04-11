package JavaAdvanced_OOP._1;

public class Dog extends Animal{
    String breed;

    public Dog(double height, double weight,String breed) {
        super(height, weight);
        this.breed=breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {

        return "Dog-"+
                super.toString()+
                "+breed='" + breed + '\'';
    }
    public double runSpeedMetersPerSecond(){
        this.setSpeed(this.getHeight()*2);
        return this.getSpeed();
    }
}
