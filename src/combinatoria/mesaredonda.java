public class mesaredonda {

    public static int fatorial(int n) {

        int resultado = 1;

        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }

        return resultado;
    }

    public static void main(String[] args) {

        int pesquisadores = 6;

        int total = fatorial(pesquisadores - 1);

        System.out.println("Total de disposicoes = " + total);
    }
}
