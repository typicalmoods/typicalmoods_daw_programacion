import java.util.Scanner;

public class Tarea15 {

    private static final Scanner sc = new Scanner(System.in);

    private enum MES {
        ENERO("Enero"),
        FEBRERO("Febrero"),
        MARZO("Marzo"),
        ABRIL("Abril"),
        MAYO("Mayo"),
        JUNIO("Junio"),
        JULIO("Julio"),
        AGOSTO("Agosto"),
        SEPTIEMBRE("Septiembre"),
        OCTUBRE("Octubre"),
        NOVIEMBRE("Noviembre"),
        DICIEMBRE("Diciembre");

        // Miembro/Atributo/Propiedad de la clase "MES"
        private final String nombreMes;

        // Constructor de la clase "MES" (en Java siempre se necesita un constructor por defecto)
        MES(String nombreMes) {
            this.nombreMes = nombreMes;
        }

        // Definición del método de la clase "MES" que devuelve el valor del atributo "nombreMes"
        public String getNombreMes() {
            return nombreMes;
        }
    }

    public static void main(String[] args) {
        System.out.println("Escriba el mes: ");
        String mesStr = sc.nextLine();
        MES mes = MES.valueOf(mesStr.toUpperCase());

        System.out.println("Escriba el año: ");
        int year = sc.nextInt();

        boolean esBisiesto = year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);

        int numDias;

        if (mes.equals(MES.ENERO) || mes.equals(MES.MARZO) || mes.equals(MES.MAYO) || mes.equals(MES.JULIO)
                || mes.equals(MES.AGOSTO) || mes.equals(MES.OCTUBRE) || mes.equals(MES.DICIEMBRE)) {
            numDias = 31;
        } else if (mes.equals(MES.ABRIL) || mes.equals(MES.JUNIO) || mes.equals(MES.SEPTIEMBRE)
                || mes.equals(MES.NOVIEMBRE)) {
            numDias = 30;
        } else if (esBisiesto) {
            numDias = 29;
        } else {
            numDias = 28;
        }

        System.out.println(mes.getNombreMes() + " en el año " + year + " tiene " + numDias + " días");
    }
}
