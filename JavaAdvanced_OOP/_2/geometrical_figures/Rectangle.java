package JavaAdvanced_OOP._2.geometrical_figures;

public class Rectangle extends Shape{

    public Rectangle(double height, double width) {
        super(height, width);
    }

    public void calculateArea(){
        System.out.println( width*height);
    }
}
