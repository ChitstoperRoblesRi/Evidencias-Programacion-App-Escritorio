package ManejoExcepciones;

public class Rectangule extends GeometricObject{
    private double width;
    private double height;

    public Rectangule(){};

    public Rectangule(String color, boolean filled, double width, double height){
        super(color, filled);
        this.height = height;
        this.width = width;
    }

    public double getWidth() {return width;}
    public void setWidth(double width) {this.width = width;}
    
    public double getHeight() {return height;}
    public void setHeight(double height) {this.height = height;}

    public double getAreaR(){
        return width * height;
    }

    public double getPerimeterR(){
        return (2*height) + (2*width);
    }

    public void printRectangule(){
        System.out.println(super.toString()+" Su altura es: "+height+" Su base es: "+width+" Su area es: "+getAreaR()+" Su perimetro es: "+getPerimeterR());
    }
}
