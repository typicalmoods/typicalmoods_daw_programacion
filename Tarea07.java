import java.util.Scanner;

public class Tarea07 {

    public static void main(String[] args) {
        double altura, base, hipotenusa;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la altura:");
        altura = sc.nextDouble();
        System.out.println("Introduce la base:");
        base = sc.nextDouble();
        hipotenusa = hipoCalculo(altura, base);
        System.out.println("La longitud de la hipotenusa es: " + hipotenusa);

    }

    static double hipoCalculo(double altura, double base) {
        return Math.sqrt(Math.pow(altura, 2) + Math.pow(base, 2));
    }
}
