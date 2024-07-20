package umg.progra2.grupo2;


import java.util.Scanner;

public class clsAreaPiramide {

    //Área de una pirámide cuadrada
    public clsAreaPiramide() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la base del triangulo: ");
        int base = scanner.nextInt();

        System.out.print("Ingrese la altura del triangulo: ");
        int altura = scanner.nextInt();

        double area = base * altura;
        System.out.print("El area del triangulo es:  " +area);

    }
}
