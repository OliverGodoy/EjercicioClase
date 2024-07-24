package umg.progra2.grupo2;

import java.io.IOException;
import java.util.Scanner;

public class clsVolumenPiramide {

    public clsVolumenPiramide() throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Volumen de una piramide cuadrada");
        System.out.print("Ingrese la longitud del lado de la base de la pirámide: ");
        double ladoBase = scanner.nextDouble();

        System.out.print("Ingrese la altura de la pirámide: ");
        double altura = scanner.nextDouble();


        double volumen = calcularVolumen(ladoBase, altura);
        System.out.println("El volumen de la pirámide cuadrada es: " + volumen + " unidades cúbicas\n");
        System.in.read();

    }

    public static double calcularVolumen(double ladoBase, double altura) {
        double areaBase = ladoBase * ladoBase;
        return (1.0 / 3) * areaBase * altura;
    }
}
