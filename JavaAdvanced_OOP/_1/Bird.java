package JavaAdvanced_OOP._1;

public class Bird extends Animal{
    double wingSpan;
    public Bird(double height, double weight, double wingSpan) {
        super(height, weight);
        this.wingSpan=wingSpan;
    }

    public double getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(double wingSpan) {
        this.wingSpan = wingSpan;
    }

    @Override
    public String toString() {
        return "Bird-" +
                super.toString()+
                "+wingSpan=" + wingSpan ;
    }
    public double flySpeedMetersPerSecond(){
        this.setSpeed(this.wingSpan*4);
        return this.getSpeed();

    }
}
