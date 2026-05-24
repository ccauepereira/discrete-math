import java.util.Scanner;

public class relacaostifel {

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

        long esquerda =
                combinacao(n, k)
                + combinacao(n, k + 1);

        long direita =
                combinacao(n + 1, k + 1);

        System.out.println("Esquerda = " + esquerda);
        System.out.println("Direita = " + direita);

        if (esquerda == direita) {
            System.out.println("Relacao verdadeira.");
        } else {
            System.out.println("Relacao falsa.");
        }

        sc.close();
    }
}
