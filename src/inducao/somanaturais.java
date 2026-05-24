import java.util.Scanner;

public class somanaturais {

    public static int soma(int n) {

        int total = 0;

        for (int i = 1; i <= n; i++) {
            total += i;
        }

        return total;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite n: ");
        int n = sc.nextInt();

        int resultado = soma(n);
        int formula = (n * (n + 1)) / 2;

        System.out.println("Soma = " + resultado);
        System.out.println("Formula = " + formula);

        if (resultado == formula) {
            System.out.println("Inducao validada.");
        } else {
            System.out.println("Erro.");
        }

        sc.close();
    }
}
