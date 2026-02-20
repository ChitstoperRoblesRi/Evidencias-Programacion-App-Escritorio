public class Ejercicio4 {

    public void LanzarExcepcion() throws ExcepcionPersonalizada {
        throw new ExcepcionPersonalizada("Error desde Lanzar Excepcion");
    }

    public static void main(String[] args) {
        Ejercicio4 obj = new Ejercicio4();
        try {
            obj.LanzarExcepcion();
        } catch (ExcepcionPersonalizada e) {
            System.out.println("Se atrapó una excepción: " + e.getMessage());
        }
    }
}