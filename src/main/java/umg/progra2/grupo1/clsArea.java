package umg.progra2.grupo1;

import java.util.Scanner;

public class clsArea {

    //Area de un círculo
    public clsArea(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el radio del círculo: ");
        double radio = scanner.nextDouble();

        double areaCirculo = Math.PI * Math.pow(radio, 2);
        System.out.println("El área del círculo es: " + areaCirculo);
    }

}
