package umg.progra2;

import umg.progra2.grupo1.clsArea;
import umg.progra2.grupo1.clsCircunferenciaCirculo;
import umg.progra2.grupo1.clsVolumenCubo;
import umg.progra2.grupo2.clsAreaPiramide;
import umg.progra2.grupo2.clsAreaTriangulo;
import umg.progra2.grupo2.clsVolumenPiramide;
import umg.progra2.grupo3.clsAreaParalelogramo;
import umg.progra2.grupo3.clsVolumenCilindro;
import umg.progra2.grupo3.clsVolumenPrisma;

import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("----- Menú --j---");
            System.out.println("----GRUPO 1----");
            System.out.println("1. Área de un circulo");
            System.out.println("2. Circunferencia de circulo");
            System.out.println("3. Volumen de un cubo");
            System.out.println("----GRUPO 2----");
            System.out.println("4. Área de una piramide cuadrada");
            System.out.println("5. Volumen de una piramide cuadrada");
            System.out.println("6. Área de un triangulo");
            System.out.println("----GRUPO 3----");
            System.out.println("7. Volumen de un prisma rectangular");
            System.out.println("8. Area de un paralelogramo");
            System.out.println("9. Volumen de un cilindro");
            System.out.println("10. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();

            switch(opcion) {
                case 1:
                    clsArea obj = new clsArea();
                    break;
                case 2:
                    clsCircunferenciaCirculo obj4 = new clsCircunferenciaCirculo();
                    break;
                case 3:
                    clsVolumenCubo obj5 = new clsVolumenCubo();
                    break;
                case 4:
                    clsAreaPiramide obj6 = new clsAreaPiramide();
                    break;
                case 5:
                    clsVolumenPiramide obj7 = new clsVolumenPiramide();
                    break;
                case 6:
                    clsAreaTriangulo obj8 = new clsAreaTriangulo();
                    break;
                case 7:
                    clsVolumenPrisma obj9 = new clsVolumenPrisma();
                    break;
                case 8:
                    clsAreaParalelogramo obj10 = new clsAreaParalelogramo();
                    break;
                case 9:
                    clsVolumenCilindro obj11 = new clsVolumenCilindro();
                    break;
                default :
                    System.out.println("Opcion no valida");
                    break;
            }
        }while(opcion != 10);
    }
}