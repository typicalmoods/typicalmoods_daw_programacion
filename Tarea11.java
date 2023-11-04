public class Tarea11 {
    public static void main(String[] args) {
        int year = 2024;

        // Divisible entre 4 y (no divisible entre 100 o divisible entre 400)

        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println("El año es bisiesto");
        } else {
            System.out.println("El año no es bisiesto");
        }
        System.out.println("Se acaba la operación");
    }
}
