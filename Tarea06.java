import java.util.Scanner;

public class Tarea06 {

    public static void main(String[] args) {
        double velocidad;
        Scanner sc = new Scanner(System.in);

        System.out.println("Inserte la velocidad en km/h");
        velocidad = sc.nextDouble();
        System.out.println("La velocidad en m/s es: " + (velocidad * 1000 / 3600));

    }
}
