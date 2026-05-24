import java.util.Scanner;

public class triangulopascal {

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

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite n: ");
        int n = sc.nextInt();

        long soma = 0;

        for (int k = 0; k <= n; k++) {

            long valor = combinacao(n, k);

            soma += valor;

            System.out.print(valor + " ");
        }

        System.out.println();
        System.out.println("Soma = " + soma);
        System.out.println("2^n = " + (long)Math.pow(2, n));

        sc.close();
    }
}
