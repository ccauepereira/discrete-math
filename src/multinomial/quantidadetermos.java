import java.util.Scanner;

public class quantidadetermos {

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

        long termos =
                fatorial(n + 2) /
                (fatorial(2) * fatorial(n));

        System.out.println("Quantidade de termos = " + termos);

        sc.close();
    }
}
