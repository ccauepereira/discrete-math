public class cargosempresa {

    public static int fatorial(int n) {

        int resultado = 1;

        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }

        return resultado;
    }

    public static void main(String[] args) {

        int resultado = fatorial(8) / fatorial(5);

        System.out.println("Total de maneiras = " + resultado);
    }
}
