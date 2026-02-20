import java.util.Scanner;
import java.util.ArrayList;

public class CalculadoraVotos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> votos = new ArrayList<>();
        
        System.out.println("=== CALCULADORA DE PORCENTAJE DE VOTOS ===");
        System.out.println("Ingrese los votos (número del candidato)");
        System.out.println("Presione 0 para terminar");
        System.out.println("----------------------------------------");
        
        // Leer votos hasta que se ingrese 0
        int voto;
        int totalVotos = 0;
        
        do {
            System.out.print("Ingrese voto: ");
            voto = scanner.nextInt();
            
            if (voto != 0) {
                votos.add(voto);
                totalVotos++;
            }
        } while (voto != 0);
        
        // Verificar si hay votos
        if (totalVotos == 0) {
            System.out.println("\nNo se ingresaron votos.");
            scanner.close();
            return;
        }
        
        // Encontrar el número máximo de candidato
        int maxCandidato = 0;
        for (int v : votos) {
            if (v > maxCandidato) {
                maxCandidato = v;
            }
        }
        
        // Contar votos por candidato
        int[] conteoVotos = new int[maxCandidato + 1];
        for (int v : votos) {
            conteoVotos[v]++;
        }
        
        // Mostrar resultados
        System.out.println("\n=== RESULTADOS ===");
        System.out.println("Total de votos: " + totalVotos);
        System.out.println("----------------------------------------");
        System.out.println("Candidato | Votos | Porcentaje");
        System.out.println("----------------------------------------");
        
        for (int i = 1; i <= maxCandidato; i++) {
            if (conteoVotos[i] > 0) {
                double porcentaje = (conteoVotos[i] * 100.0) / totalVotos;
                System.out.printf("%9d | %5d | %6.2f%%\n", i, conteoVotos[i], porcentaje);
            }
        }
        
        System.out.println("----------------------------------------");
        
        scanner.close();
    }
}