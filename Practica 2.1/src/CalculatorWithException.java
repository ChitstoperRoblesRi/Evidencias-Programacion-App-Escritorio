import java.util.Scanner;

public class CalculatorWithException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.println("---CALCULADORA CON MANEJO DE EXCEPCIONES---");
            
            System.out.print("Ingrese el primer operando: ");
            String input1 = scanner.nextLine();
            int operand1 = Integer.parseInt(input1);
            
            System.out.print("Ingrese el operador (+, -, *, /): ");
            String operator = scanner.nextLine();
            
            System.out.print("Ingrese el segundo operando: ");
            String input2 = scanner.nextLine();
            int operand2 = Integer.parseInt(input2);
            
            int result = 0;
            
            switch (operator.charAt(0)) {
                case '+': 
                    result = operand1 + operand2;
                    break;
                case '-': 
                    result = operand1 - operand2;
                    break;
                case '*': 
                    result = operand1 * operand2;
                    break;
                case '/': 
                    result = operand1 / operand2;
                    break;
                default:
                    System.out.println("Error: Operador no válido. Use +, -, *, /");
                    return;
            }
            
            System.out.println("\nResultado: " + operand1 + " " + operator + " " + operand2 + " = " + result);
            
        } catch (NumberFormatException e) {
            System.out.println("\nError: Operando no numérico detectado.");
            System.out.println("Los operandos deben ser números enteros.");
            System.out.println("Detalle del error: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("\nError: División por cero no permitida.");
        } finally {
            System.out.println("\n---Fin de la ejecución de Calculator---");
            scanner.close();
        }
    }
}