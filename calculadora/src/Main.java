//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static int suma(int a, int b) {
        return a + b;
    }
    public static int resta(int a, int b) {
        return a - b;
    }
    public static int multiplicacion(int a, int b) {
        return a * b;
    }
    public static int division(int a, int b) {
        return a/b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result;

        System.out.print("Primer numero: ");
        int num1 = sc.nextInt();
        System.out.print("Segundo numero: ");
        int num2 = sc.nextInt();

        System.out.print("\nEscoga una opcion: \n1. Suma\n2. Resta\n3. Multiplicacion\n4. Division\n> ");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                result = Main.suma(num1, num2);
                System.out.println("Su resultado es: " + result);
                break;
            case 2:
                result = Main.resta(num1, num2);
                System.out.println("Su resultado es: " + result);
                break;
            case 3:
                result = Main.multiplicacion(num1, num2);
                System.out.println("Su resultado es: " + result);
                break;
            case 4:
                result = Main.division(num1, num2);
                System.out.println("Su resultado es: " + result);
                break;
            default:
                System.out.println("Opcion Invalida");
                break;
        }
    }
}