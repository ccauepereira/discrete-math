public class anagramas {

    public static int fatorial(int n) {

        int resultado = 1;

        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }

        return resultado;
    }

    public static void main(String[] args) {

        String palavra = "CADERNO";

        int total = fatorial(palavra.length());

        System.out.println("Quantidade de anagramas = " + total);
    }
}
