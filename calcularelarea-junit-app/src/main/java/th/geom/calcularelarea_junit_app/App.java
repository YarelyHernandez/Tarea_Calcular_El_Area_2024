package th.geom.calcularelarea_junit_app;

import java.util.Scanner;

public class App {

    public static double calcularAreaCirculo(double radio) {
        return Math.PI * radio * radio;
    }

    public static double calcularAreaCuadrado(double lado) {
        return lado * lado;
    }

    public static double calcularAreaRectangulo(double largo, double ancho) {
        return largo * ancho;
    }

    public static double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Seleccione la operación que desea realizar:");
            System.out.println("1. Calcular área de un círculo");
            System.out.println("2. Calcular área de un cuadrado");
            System.out.println("3. Calcular área de un rectángulo");
            System.out.println("4. Calcular área de un triángulo");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el radio del círculo: ");
                    double radio = scanner.nextDouble();
                    System.out.println("El área del círculo es: " + calcularAreaCirculo(radio));
                    break;
                case 2:
                    System.out.print("Ingrese el lado del cuadrado: ");
                    double lado = scanner.nextDouble();
                    System.out.println("El área del cuadrado es: " + calcularAreaCuadrado(lado));
                    break;
                case 3:
                    System.out.print("Ingrese el largo del rectángulo: ");
                    double largo = scanner.nextDouble();
                    System.out.print("Ingrese el ancho del rectángulo: ");
                    double ancho = scanner.nextDouble();
                    System.out.println("El área del rectángulo es: " + calcularAreaRectangulo(largo, ancho));
                    break;
                case 4:
                    System.out.print("Ingrese la base del triángulo: ");
                    double base = scanner.nextDouble();
                    System.out.print("Ingrese la altura del triángulo: ");
                    double altura = scanner.nextDouble();
                    System.out.println("El área del triángulo es: " + calcularAreaTriangulo(base, altura));
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }

            System.out.println(); 
        } while (opcion != 5);

        scanner.close();
    }
}