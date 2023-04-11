package JavaAdvanced_OOP._1;

public class Fish extends Animal{
        String species;
    public Fish(double height, double weight, String species) {
        super(height, weight);
        this.species=species;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String toString() {
        return "Fish-" +
                super.toString()+
                "+species='" + species + '\'';
    }
    public double swimSpeedMetersPerSecond(){
        this.setSpeed(this.getWeight()*2);
        return this.getSpeed();
    }
}
