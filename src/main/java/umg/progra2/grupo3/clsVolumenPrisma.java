package umg.progra2.grupo3;

import java.util.Scanner;

public class clsVolumenPrisma {

    public clsVolumenPrisma() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la longitud del prisma: ");
        double longitud = scanner.nextDouble();

        System.out.print("Ingresa el ancho del prisma: ");
        double ancho = scanner.nextDouble();

        System.out.print("Ingresa la altura del prisma: ");
        double altura = scanner.nextDouble();

        double volumen = calcularVolumen(longitud, ancho, altura);

        System.out.println("El volumen del prisma rectangular es: " + volumen + " unidades cúbicas");
    }

    public static double calcularVolumen(double longitud, double ancho, double altura) {
        return longitud * ancho * altura;
    }
}
