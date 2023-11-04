import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Tarea03 {
    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el numero entero:");
        numero = sc.nextInt();
        System.out.println("Numero introducido; " + numero);
        System.out.println("El doble de " + numero + " es " + 2 * numero);
        System.out.println("El triple de " + numero + " es " + 3 * numero);
    }
}
