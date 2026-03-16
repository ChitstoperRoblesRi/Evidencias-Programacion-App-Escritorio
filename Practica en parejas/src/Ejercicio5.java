public class Ejercicio5 {

    public void LanzarExcepcion() throws ExcepcionPersonalizada {
        throw new ExcepcionPersonalizada("Error desde Lanzar Excepcion");
    }

    public static void main(String[] args) {
        Ejercicio5 obj1 = null;
        try {
            obj1.LanzarExcepcion();
        } catch (Exception e) {
            System.out.println("Se atrapó una excepción: " + e);
        }
    }
}