import java.util.Scanner;

public class termogeralbinomio {

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

        System.out.print("Digite k: ");
        int k = sc.nextInt();

        long coeficiente = combinacao(n, k);

        System.out.println("Coeficiente binomial = " + coeficiente);

        System.out.println("Termo geral:");
        System.out.println(coeficiente + " * x^" + (n - k) + " * a^" + k);

        sc.close();
    }
}
