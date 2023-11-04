import java.util.Scanner;

public class Tarea12 {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String cadena;

        System.out.println("Dime la fruta preferida");
        cadena = sc.nextLine();

        // La comparación de valor para los objetos en Java no debe hacerse con el operador "==",
        // ya que este operador compara las referencias en memoria, no los valores.
        if ("pera" == cadena) {
        }

        // La comparación de valores en Java para los objetos se hace usando el método equals()
        if ("pera".equals(cadena)) {
            System.out.println("Tu fruta preferida es la " + cadena);
        } else {
            System.out.println("No es igual a pera");
        }

        System.out.println("Termina el programa");
    }


}
