package umg.progra2.grupo3;

import java.io.IOException;
import java.util.Scanner;

public class clsAreaParalelogramo {

    public clsAreaParalelogramo() throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Área de un paralelogramo");
        System.out.print("Ingrese la longitud de la base del paralelogramo: ");
        double base = scanner.nextDouble();

        System.out.print("Ingrese la altura del paralelogramo: ");
        double altura = scanner.nextDouble();

        double area = base * altura;
        System.out.println("El área del paralelogramo es: " + area + " unidades cuadradas\n");
        System.in.read();
    }
}
