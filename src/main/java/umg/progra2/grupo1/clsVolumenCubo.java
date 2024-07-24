package umg.progra2.grupo1;

import java.io.IOException;
import java.util.Scanner;

public class clsVolumenCubo {

    public clsVolumenCubo() throws IOException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Volumen de un cubo");
        System.out.print("Ingrese la longitud del lado del cubo: ");
        double lado = scanner.nextDouble();

        double calcularVolumen = lado * lado * lado;
        double volumen = calcularVolumen;
        System.out.println("El volumen del cubo es: " + volumen + " unidades cúbicas\n");
        System.in.read();
    }
}
