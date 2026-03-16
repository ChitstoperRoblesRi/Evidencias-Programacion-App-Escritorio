public class Ejercicio1 {
    public static void main(String[] args) {
        try {
            throw new Exception("Error personalizado en Ejercicio 1");
        } catch (Exception e) {
            System.out.println("Mensaje de error: " + e.getMessage());
        }
    }
}