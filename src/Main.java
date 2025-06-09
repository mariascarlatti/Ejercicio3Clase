import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido a la calcladora de la clase main!");

        menu();
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        Operations operations = new Operations();
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Elevar al cuadrado");
        System.out.println("6. Salir");

        System.out.print("Seleccione una opción: ");

        int option = 0;
        try {
            option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case 1:
                    System.out.println("Seleccionó Sumar");
                    System.out.print("Ingrese el primer número: ");
                    int num1 = Integer.parseInt(scanner.nextLine());
                    System.out.print("Ingrese el segundo número: ");
                    int num2 = Integer.parseInt(scanner.nextLine());
                    System.out.println("Resultado: " + operations.sum(num1, num2));
                    menu();
                    break;
                case 2:
                    System.out.println("Seleccionó Restar");
                    System.out.print("Ingrese el primer número: ");
                    int num3 = Integer.parseInt(scanner.nextLine());
                    System.out.print("Ingrese el segundo número: ");
                    int num4 = Integer.parseInt(scanner.nextLine());
                    System.out.println("Resultado: " + operations.subtract(num3, num4));
                    menu();
                    break;
                case 3:
                    System.out.println("Seleccionó Multiplicar");
                    System.out.print("Ingrese el primer número: ");
                    int num5 = Integer.parseInt(scanner.nextLine());
                    System.out.print("Ingrese el segundo número: ");
                    int num6 = Integer.parseInt(scanner.nextLine());
                    System.out.println("Resultado: " + operations.multiply(num5, num6));
                    menu();
                    break;
                case 4:
                    System.out.println("Seleccionó Dividir");
                    System.out.print("Ingrese el primer número: ");
                    int num7 = Integer.parseInt(scanner.nextLine());
                    System.out.print("Ingrese el segundo número: ");
                    int num8 = Integer.parseInt(scanner.nextLine());
                    if (num8 == 0) {
                        System.out.println("Error: División por cero no permitida.");
                    } else {
                        System.out.println("Resultado: " + operations.divide(num7, num8));
                    }
                    menu();
                    break;
                case 5:
                    System.out.println("Seleccionó Calcular el cuadrado de un número");
                    System.out.print("Ingrese el número: ");
                    int num9 = Integer.parseInt(scanner.nextLine());
                    System.out.println("Resultado: " + operations.cuadrado(num9));
                    menu();
                    break;
                case 6:
                    System.out.println("Saliendo de la calculadora. ¡Hasta luego!");
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
                    menu();
                    return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Por favor, ingrese un número válido.");
            return;
        }
    }
}