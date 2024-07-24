package umg.progra2.grupo2;

import java.io.IOException;
import java.util.Scanner;

public class clsAreaTriangulo {

    public clsAreaTriangulo() throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Área de un triangulo");
        System.out.print("Ingrese la base del triángulo: ");
        double base = scanner.nextDouble();

        System.out.print("Ingrese la altura del triángulo: ");
        double altura = scanner.nextDouble();


        double area = (base * altura) / 2;
        System.out.println("El área del triángulo es: " + area + " unidades cuadradas\n");
        System.in.read();
    }
}
