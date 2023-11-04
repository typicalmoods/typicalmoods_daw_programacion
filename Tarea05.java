import java.util.Scanner;

public class Tarea05 {
    public static void main(String[] args) {
        double radio;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el radio de la circunferencia");
        radio = sc.nextDouble();
        System.out.println("El area de la circunferencia es: " + (Math.PI * Math.pow(radio, 2)));
        System.out.println("La longitud de la circunferencia es: " + (2 * Math.PI * radio));
    }
}
