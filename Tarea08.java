import java.util.Scanner;

public class Tarea08 {

    private enum Moneda {
        CENT_50(50),
        CENT_20(20),
        CENT_10(10),
        CENT_5(5),
        CENT_2(2),
        CENT_1(1);

        private final int valor;

        Moneda(int valor) {
            this.valor = valor;
        }

        public int getValor() {
            return this.valor;
        }
    }

    public static void main(String[] args) {
        int precioArticulo, importeIntroducido, cambioEnMonedas;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el precio del articulo (en céntimos)");
        precioArticulo = sc.nextInt();
        System.out.println("Introduzca el importe para pagar (en céntimos)");
        importeIntroducido = sc.nextInt();

        cambioEnMonedas = devolverCambio(precioArticulo, importeIntroducido);

        System.out.println("El cambio en monedas es: " + cambioEnMonedas);
    }

    private static int devolverCambio(int precioArticulo, int importeIntroducido) {
        int valorCambio = importeIntroducido - precioArticulo;
        int numMonedas = 0;

        while (valorCambio > 0) {
            for (Moneda moneda : Moneda.values()) {
                if (valorCambio >= moneda.getValor()) {
                    valorCambio = valorCambio - moneda.getValor();
                    numMonedas++;
                    break;
                }
            }
//            if (valorCambio >= Moneda.CENT_50.getValor()) {
//                valorCambio = valorCambio - Moneda.CENT_50.getValor();
//                numMonedas++;
//                continue;
//            }
//            if (valorCambio >= Moneda.CENT_20.getValor()) {
//                valorCambio = valorCambio - Moneda.CENT_20.getValor();
//                numMonedas++;
//                continue;
//            }
//            if (valorCambio >= Moneda.CENT_10.getValor()) {
//                valorCambio = valorCambio - Moneda.CENT_10.getValor();
//                numMonedas++;
//                continue;
//            }
//            if (valorCambio >= Moneda.CENT_5.getValor()) {
//                valorCambio = valorCambio - Moneda.CENT_5.getValor();
//                numMonedas++;
//                continue;
//            }
//            if (valorCambio >= Moneda.CENT_2.getValor()) {
//                valorCambio = valorCambio - Moneda.CENT_2.getValor();
//                numMonedas++;
//                continue;
//            }
//            if (valorCambio >= Moneda.CENT_1.getValor()) {
//                valorCambio = valorCambio - Moneda.CENT_1.getValor();
//                numMonedas++;
        }
//        }

        return numMonedas;
    }
}
