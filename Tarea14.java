public class Tarea14 {

    private enum MES {
        ENERO(1),
        FEBRERO(2),
        MARZO(3),
        ABRIL(4),
        MAYO(5),
        JUNIO(6),
        JULIO(7),
        AGOSTO(8),
        SEPTIEMBRE(9),
        OCTUBRE(10),
        NOVIEMBRE(11),
        DICIEMBRE(12);

        private final int numMes;

        MES(int numMes) {
            this.numMes = numMes;
        }

        public int getNumMes() {
            return numMes;
        }
    }

    public static void main(String[] args) {
        String trimestre;
        MES mes = MES.MAYO;
        int numMes = mes.getNumMes();

        if (numMes >= MES.ENERO.getNumMes() && numMes <= MES.MARZO.getNumMes()) {
            trimestre = "Primer trimestre";
        } else if (numMes >= MES.ABRIL.getNumMes() && numMes <= MES.JUNIO.getNumMes()) {
            trimestre = "Segundo trimestre";
        } else if (numMes >= MES.JULIO.getNumMes() && numMes <= MES.SEPTIEMBRE.getNumMes()) {
            trimestre = "Tercer trimestre";
        } else {
            trimestre = "Cuarto trimestre";
        }

        System.out.println(mes + " " + trimestre);

    }
}
