package umg.progra2.grupo1;

import java.io.IOException;
import java.util.Scanner;

public class clsArea {

    //Area de un círculo
    public clsArea() throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Área de un circulo");
        System.out.print("Ingresa el radio del círculo: ");
        double radio = scanner.nextDouble();

        double areaCirculo = Math.PI * Math.pow(radio, 2);
        System.out.println("El área del círculo es: " + areaCirculo +"\n");
        System.in.read();
    }

}
