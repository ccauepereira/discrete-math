import java.util.Scanner;

public class maximomultinomial {

    public static long fatorial(int n) {

        long resultado = 1;

        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }

        return resultado;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite n: ");
        int n = sc.nextInt();

        System.out.print("Digite m: ");
        int m = sc.nextInt();

        int base = n / m;

        long denominador = 1;

        for (int i = 0; i < m; i++) {
            denominador *= fatorial(base);
        }

        long resultado =
                fatorial(n) / denominador;

        System.out.println("Coeficiente maximo aproximado = " + resultado);

        sc.close();
    }
}
