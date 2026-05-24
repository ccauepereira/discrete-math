import java.util.Scanner;

public class somaimpares {

    public static int soma(int n) {

        int total = 0;

        for (int i = 1; i <= n; i++) {
            total += (2 * i) - 1;
        }

        return total;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite n: ");
        int n = sc.nextInt();

        int resultado = soma(n);
        int formula = n * n;

        System.out.println("Resultado = " + resultado);
        System.out.println("n^2 = " + formula);

        if (resultado == formula) {
            System.out.println("Inducao validada.");
        } else {
            System.out.println("Erro.");
        }

        sc.close();
    }
}
