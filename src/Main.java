import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido a la calcladora de la clase main!");

        menu();
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");

        System.out.print("Seleccione una opción: ");

        int option = 0;
        try {
            option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case 1:
                    System.out.println("Seleccionó Sumar");
                    break;
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