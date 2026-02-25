package ManejoExcepciones;
import java.math.*;;

public class Circle extends GeometricObject{
    private double radius;

    public Circle(){};

    public Circle(String color, boolean filled, double radius){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {return radius;}
    public void setRadius(double radius) {this.radius = radius;}

    public double getAreaC(){
        return Math.PI * Math.pow(radius, 2);
    }
    
    public double getPerimeterC(){
        return Math.PI * 2 * radius;
    }

    public double getDiameterC(){
        return 2 * radius;
    }

    public void printCircle(){
        System.out.println(super.toString()+" Su radio es: "+radius+" Su perimetro es: "+getPerimeterC()+" Su area es: "+getAreaC()+" Su perimetro es: "+getPerimeterC());
    }
}
