package figuras;

import java.util.Scanner;

public class Trapezoid {
    public static void calculateArea() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la base mayor del trapecio: ");
        double baseMayor = scanner.nextDouble();
        
        System.out.print("Ingrese la base menor del trapecio: ");
        double baseMenor = scanner.nextDouble();
        
        System.out.print("Ingrese la altura del trapecio: ");
        double altura = scanner.nextDouble();
        
        double area = ((baseMayor + baseMenor) / 2) * altura;
        System.out.println("El área del trapecio es: " + area);
        
        
    }
}
