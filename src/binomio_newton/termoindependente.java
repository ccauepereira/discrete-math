public class termoindependente {

    public static long fatorial(int n) {

        long resultado = 1;

        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }

        return resultado;
    }

    public static long combinacao(int n, int k) {

        return fatorial(n) / (fatorial(k) * fatorial(n - k));
    }

    public static void main(String[] args) {

        int n = 12;

        for (int k = 0; k <= n; k++) {

            int expoente = (2 * (n - k)) - k;

            if (expoente == 0) {

                long coeficiente = combinacao(n, k);

                System.out.println("k = " + k);
                System.out.println("Termo independente = " + coeficiente);
            }
        }
    }
}
