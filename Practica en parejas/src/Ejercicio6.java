public class Ejercicio6 {

    public void a() throws ExcepcionPersonalizada {
        throw new ExcepcionPersonalizada("Excepción desde método a");
    }

    public void b() throws Exception {
        try {
            a();
        } catch (ExcepcionPersonalizada e) {
            throw new Exception("Excepción lanzada desde b", e);
        }
    }

    public static void main(String[] args) {
        Ejercicio6 obj = new Ejercicio6();
        try {
            obj.b();
        } catch (Exception e) {
            System.out.println("Excepción en main:");
            e.printStackTrace();
        }
    }
}