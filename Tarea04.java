import java.util.Scanner;

public class Tarea04 {
    public static void main(String[] args) {
        double centigrados;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el numero que desea convertir a grados Fahrenheit:");
        centigrados = sc.nextDouble();
        System.out.println("Usted quiere convertir " + centigrados + " centigrados a grados Fahrenheit");
        double result = calculateFahrenheitFromCentigrade(centigrados);
        System.out.println("El resultado es: " + result);
    }

    private static double calculateFahrenheitFromCentigrade(double centigrados) {
        return centigrados * 1.8 + 32;
    }
}
