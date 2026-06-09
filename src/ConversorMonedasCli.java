import java.util.Scanner;

public class ConversorMonedasCli {

    private Scanner scanner = new Scanner(System.in);

    public void iniciar() {

        System.out.println("=== CONVERSOR DE MONEDAS ===");

        System.out.print("Ingrese la cantidad en USD: ");
        double usd = scanner.nextDouble();

        double tasaCop = 4000; // Ejemplo
        double cop = usd * tasaCop;

        System.out.println("Resultado:");
        System.out.println(usd + " USD = " + cop + " COP");
    }
}