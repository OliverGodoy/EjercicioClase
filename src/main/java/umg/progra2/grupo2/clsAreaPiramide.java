package umg.progra2.grupo2;


import java.io.IOException;
import java.util.Scanner;

public class clsAreaPiramide {

    //Área de una pirámide cuadrada
    public clsAreaPiramide() throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cálculo del área de una Pirámide");
        System.out.print("Ingrese la base de la piramide: ");
        double base = scanner.nextDouble();

        System.out.print("Ingrese la altura de la piramide: ");
        double altura = scanner.nextDouble();

        double area = (base * altura) / 2;
        System.out.println("El área de la piramide es: " + area + " unidades cuadradas\n");
        System.in.read();
    }
}
