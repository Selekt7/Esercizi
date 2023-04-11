package JavaAdvanced_OOP._1;

class Animal {
    private double height, weight,speed;

    public Animal(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }
    public Animal(){

    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "height=" + height +
                ", weight=" + weight +
                '}';
    }
}
