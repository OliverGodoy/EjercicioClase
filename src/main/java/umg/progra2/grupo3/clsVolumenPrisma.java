package umg.progra2.grupo3;

import java.io.IOException;
import java.util.Scanner;

public class clsVolumenPrisma {

    public clsVolumenPrisma() throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Volumen de un prisma rectangular\n");
        System.out.print("Ingresa la longitud del prisma: ");
        double longitud = scanner.nextDouble();

        System.out.print("Ingresa el ancho del prisma: ");
        double ancho = scanner.nextDouble();

        System.out.print("Ingresa la altura del prisma: ");
        double altura = scanner.nextDouble();


        double volumen = longitud * ancho * altura;

        System.out.println("El volumen del prisma rectangular es: " + volumen + " unidades cúbicas\n");
        System.in.read();
    }

}
