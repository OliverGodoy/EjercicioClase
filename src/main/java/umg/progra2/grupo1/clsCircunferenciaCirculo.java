package umg.progra2.grupo1;

import java.io.IOException;
import java.util.Scanner;

public class clsCircunferenciaCirculo {

    public clsCircunferenciaCirculo() throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Circunferencia de un Circulo");
        System.out.print("Ingrese el radio del círculo: ");
        double radio = scanner.nextDouble();

        double calcularCircunferencia = 2 * Math.PI * radio;
        double circunferencia = calcularCircunferencia;
        System.out.println("La circunferencia del círculo es: " + circunferencia + " unidades\n");
        System.in.read();
    }
}
