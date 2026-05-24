import java.util.Scanner;

public class potenciasbase2 {

    public static int soma(int n) {

        int total = 0;

        for (int i = 0; i <= n; i++) {
            total += (int) Math.pow(2, i);
        }

        return total;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite n: ");
        int n = sc.nextInt();

        int resultado = soma(n);
        int formula = (int) Math.pow(2, n + 1) - 1;

        System.out.println("Resultado = " + resultado);
        System.out.println("Formula = " + formula);

        if (resultado == formula) {
            System.out.println("Inducao validada.");
        } else {
            System.out.println("Erro.");
        }

        sc.close();
    }
}
