package ManejoExcepciones;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        

        try{
            System.out.println("---Creacion de un triangulo---");

            System.out.println("Ingrese el valor del lado 1: ");
            double s1 = sc.nextDouble();
            System.out.println("Ingrese el valor del lado 2: ");
            double s2 = sc.nextDouble();
            System.out.println("Ingrese el valor del lado 3: ");
            double s3 = sc.nextDouble();
            System.out.println("Ingrese un color: ");
            String c1 = sc.next();
            System.out.println("Quiere que el triangulo este relleno? s/n ");
            String b1 = sc.next();

            boolean b;
            if (b1 == "n") {b = false;} 
            else {b = true;}

            Triangle t = new Triangle(c1, b, s1, s2, s3);
            System.out.println(t.toString());
            System.out.println("El area es: "+t.getAreaT()+" El perimetro es: "+t.getPerimeterT());
            } catch (IllegalTriangleException ex)

    }
}
