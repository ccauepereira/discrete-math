public class coeficientexyz {

    public static long fatorial(int n) {

        long resultado = 1;

        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }

        return resultado;
    }

    public static void main(String[] args) {

        int n1 = 1;
        int n2 = 2;
        int n3 = 3;

        long coeficiente =
                fatorial(6) /
                (fatorial(n1) * fatorial(n2) * fatorial(n3));

        System.out.println("Coeficiente = " + coeficiente);
    }
}
