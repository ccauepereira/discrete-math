public class comissaoengenharia {

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

        int caso1 = combinacao(7, 2) * combinacao(5, 2);
        int caso2 = combinacao(7, 3) * combinacao(5, 1);
        int caso3 = combinacao(7, 4);

        int total = caso1 + caso2 + caso3;

        System.out.println("Total de comissoes = " + total);
    }
}
