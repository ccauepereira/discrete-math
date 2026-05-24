public class escolhalivros {

    public static int fatorial(int n) {

        int resultado = 1;

        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }

        return resultado;
    }

    public static int combinacao(int n, int p) {

        return fatorial(n) / (fatorial(p) * fatorial(n - p));
    }

    public static void main(String[] args) {

        int matematica = combinacao(6, 2);
        int fisica = combinacao(4, 2);
        int quimica = combinacao(3, 1);

        int total = matematica * fisica * quimica;

        System.out.println("Total de formas = " + total);
    }
}
