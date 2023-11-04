import java.util.Set;
import java.util.stream.Collectors;

public class Tarea16 {
    public static void main(String[] args) {
        // Dado un String, devuelve true si tiene caracteres duplicados o false en caso contrario
        String cadena = "java";

        // set[0] = 'j'
        // set[1] = 'a'
        // set[2] = 'v'
        Set<Character> caracteres = cadena.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toSet());

        boolean tieneDuplicados = cadena.length() != caracteres.size();

        if (tieneDuplicados) {
            System.out.println("La cadena " + cadena + " tiene caracteres duplicados");
        } else {
            System.out.println("La cadena " + cadena + " no tiene caracteres duplicados");
        }
    }
}
