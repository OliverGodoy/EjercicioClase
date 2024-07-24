package umg.progra2.grupo3;

import java.io.IOException;
import java.util.Scanner;

public class clsVolumenCilindro {

    public clsVolumenCilindro() throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Volumen de un cilindro");
        System.out.print("Ingrese el radio de la base del cilindro: ");
        double radio = scanner.nextDouble();

        System.out.print("Ingrese la altura del cilindro: ");
        double altura = scanner.nextDouble();

        double volumen = Math.PI * radio * radio * altura;
        System.out.println("El volumen del cilindro es: " + volumen + " unidades cúbicas\n");
        System.in.read();
    }
}
