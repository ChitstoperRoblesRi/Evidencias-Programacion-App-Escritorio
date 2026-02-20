import java.util.Scanner;

public class CalculatorWithoutException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("---CALCULADORA SIN MANEJO DE EXCEPCIONES---");
        
        System.out.print("Ingrese el primer operando: ");
        String input1 = scanner.nextLine();
        
        if (!isNumeric(input1)) {
            System.out.println("\nError: El primer operando no es numérico: '" + input1 + "'");
            System.out.println("Los operandos deben ser números enteros.");
            scanner.close();
            return;
        }
        
        System.out.print("Ingrese el operador (+, -, *, /): ");
        String operator = scanner.nextLine();
        
        System.out.print("Ingrese el segundo operando: ");
        String input2 = scanner.nextLine();
        
        if (!isNumeric(input2)) {
            System.out.println("\nError: El segundo operando no es numérico: '" + input2 + "'");
            System.out.println("Los operandos deben ser números enteros.");
            scanner.close();
            return;
        }
        
        int operand1 = Integer.parseInt(input1);
        int operand2 = Integer.parseInt(input2);
        int result = 0;
        
        if (operator.charAt(0) == '/' && operand2 == 0) {
            System.out.println("\nError: División por cero no permitida.");
            scanner.close();
            return;
        }
        
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
                System.out.println("\nError: Operador no válido. Use +, -, *, /");
                scanner.close();
                return;
        }
        
        System.out.println("\nResultado: " + operand1 + " " + operator + " " + operand2 + " = " + result);
        
        System.out.println("\n---Fin de la ejecución de Calculator---");
        scanner.close();
    }

    private static boolean isNumeric(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        
        int startIndex = 0;
        if (str.charAt(0) == '-') {
            if (str.length() == 1) {
                return false;
            }
            startIndex = 1;
        }
        
        for (int i = startIndex; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        
        return true;
    }
}