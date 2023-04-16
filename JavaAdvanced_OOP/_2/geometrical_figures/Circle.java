package JavaAdvanced_OOP._2.geometrical_figures;

public class Circle extends Shape {
    public Circle(double raggio) {
            super(raggio,raggio);

    }

    public void calculateArea(){
        System.out.println( Math.PI * Math.pow((height / 2), 2));
    }
}
