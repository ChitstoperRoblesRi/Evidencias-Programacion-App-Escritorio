public class Ejercicio2 {
    public static void main(String[] args) {
        try {
            throw new Exception("Error personalizado en Ejercicio 2");
        } catch (Exception e) {
            System.out.println("Mensaje de error: " + e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("Bloque finally alcanzado");
            System.out.println("Cerrando programa...");
        }
    }
}